package com.me.miniflink

import akka.actor.{
  Actor, ActorSystem, Props
}
import com.typesafe.config.ConfigFactory

import scala.collection.mutable

/**
 * 注释： 集群主节点抽象
 * 1、receive 方法    接收其他 actor 发送过来的消息，然后进行模式匹配，进行消息处理，有可能返回消息
 * 2、preStart() 方法   对象在构建成功之后，就会触发执行 preStart
 * 3、postStop 方法    在对象销毁之前，会执行一次
 * -
 * 必须了解的知识：
 * 1、伴生类 class A 和 伴生对象 object A（定义的方法，都是静态方法）
 * 2、关于 scala 中定义的一个类的构造方法：
 * 构造器： 类名后面的括号
 * 代码实现： {} 中的一切能执行的代码
 * 变量的初始化
 * 代码块
 * 静态代码块
 * 不能执行的代码： 定义的方法（未调用， 内部类）
 *
 * @author spiral
 * @since ： 2021/7/6 1:26
 *  https://its401.com/article/guoqing2017/118523581
 */

class MyJobManager(var hostName: String, var port: Int) extends Actor {


  var id2TaskManagerInfo = new mutable.HashMap[String, TaskManagerInfo]()

  var taskMangerInfos = new mutable.HashSet[TaskManagerInfo]()


  override def preStart(): Unit = {

    import scala.concurrent.duration._
    import context.dispatcher
    context.system.scheduler.schedule(0 millis, 5000 millis, self, CheckTimeOut)
  }

  override def receive: Receive = {

    case RegisterTaskManager(nodeManagerId, memory, cpu) => {

      val nodeManagerInfo = new TaskManagerInfo(nodeManagerId, memory, cpu)
      println(s"节点 ${nodeManagerId}上线")

      id2TaskManagerInfo.put(nodeManagerId, nodeManagerInfo)
      taskMangerInfos += nodeManagerInfo

      sender() ! RegisteredTaskManager(hostName + ":" + port)
    }
    case Heartbeat(nodeManagerId) => {

      val concurrentTime = System.currentTimeMillis()
      val nodeManagerInfo = id2TaskManagerInfo(nodeManagerId)
      nodeManagerInfo.lastHeartBeatTime = concurrentTime

      id2TaskManagerInfo(nodeManagerId) = nodeManagerInfo
      taskMangerInfos += nodeManagerInfo

      sender() ! Heartbeat(hostName)
    }
    case CheckTimeOut => {

      val currentTime = System.currentTimeMillis()
      taskMangerInfos.filter(nm => {

        val heartbeatTimeout = 15000
        val bool = currentTime - nm.lastHeartBeatTime > heartbeatTimeout
        if (bool) {

          println(s"节点${nm.taskmanagerid} 下线")
        }
        bool
      }).foreach(deadNodeManager => {

        taskMangerInfos -= deadNodeManager
        id2TaskManagerInfo.remove(deadNodeManager.taskmanagerid)
      })

      println("当期注册成功的节点数" + taskMangerInfos.size + "\t 分别是：" + taskMangerInfos.map(x => x.toString).mkString(","))
    }
  }
}

object MyJobManager {

  def main(args: Array[String]): Unit = {

    val host = "localhost"
    val port = 6789
    val str =
      s"""
         |akka.actor.provider = "akka.remote.RemoteActorRefProvider"
         |akka.remote.netty.tcp.hostname = ${host}
         |akka.remote.netty.tcp.port=${port}
         |""".stripMargin

    val conf = ConfigFactory.parseString(str)
    val actorSystem = ActorSystem(Constant.JMAS, conf)
    actorSystem.actorOf(Props(new MyJobManager(host, port)), Constant.JMA)
  }
}