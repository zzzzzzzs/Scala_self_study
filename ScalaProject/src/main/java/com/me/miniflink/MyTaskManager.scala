package com.me.miniflink
import akka.actor.{
  Actor, ActorSelection, ActorSystem, Props}
import com.typesafe.config.ConfigFactory

/**
 * ${description}
 *
 * @author Spiral
 * @since ： 2021/7/6 2:14
 *
 */
class MyTaskManager(val hostName: String, val jobManagerHostName: String, val jobManagerPort: Int, val memory: Int, val cpu: Int) extends Actor {


  var taskManagerId: String = hostName
  var rmRef: ActorSelection = _

  /**
   * 该方法在该Actor启动时，会执行一次
   */
  override def preStart(): Unit = {

    println(s"akka.tcp://${Constant.JMAS}@${jobManagerHostName}:${jobManagerPort}/user/${Constant.JMA}")
    rmRef = context.actorSelection(s"akka.tcp://${Constant.JMAS}@${jobManagerHostName}:${jobManagerPort}/user/${Constant.JMA}")
    //akka.tcp://MyJobManagerActorSystem@localHost:6789
    //akka.tcp://MyJobManagerActorSystem@localhost:6789/user/MyJobManagerActor
    println(taskManagerId + "正在注册")

    rmRef ! RegisterTaskManager(taskManagerId, memory, cpu)
  }

  override def receive: Receive = {

    case RegisteredTaskManager(masterUrl) => {

      println(masterUrl)
      import scala.concurrent.duration._
      import context.dispatcher
      context.system.scheduler.scheduleOnce(0 millis, self, SendMessage)
    }
    case Heartbeat(hostName) => {

      println(hostName)
      import scala.concurrent.duration._
      import context.dispatcher
      context.system.scheduler.scheduleOnce(4000 millis, self, SendMessage)
    }
    case SendMessage => {

      rmRef ! Heartbeat(taskManagerId)
      println(Thread.currentThread().getId)
    }
  }
}

object MyTaskManager{

  def main(args: Array[String]): Unit = {

    val hostName = args(0)
    val jmHostName = args(1)
    val jmPort = args(2).toInt
    val memory = args(3).toInt
    val core = args(4).toInt
    val taskMangerPort = args(5).toInt
    val tmHostName = args(6)
    val str =
      s"""
         |akka.actor.provider = "akka.remote.RemoteActorRefProvider"
         |akka.remote.netty.tcp.hostname=${hostName}
         |akka.remote.netty.tcp.port = ${taskMangerPort}
         |""".stripMargin
    val conf = ConfigFactory.parseString(str)

    val actorSystem = ActorSystem(Constant.JMAS, conf)

    actorSystem.actorOf(Props(new MyTaskManager(tmHostName, jmHostName, jmPort, memory, core)),Constant.TMA)

  }
}
