package com.me.miniflink

/**
 * @author zs
 * @date 2021/12/24
 */
//  注释： TaskManager 信息类
class TaskManagerInfo(val taskmanagerid: String, val memory: Int, val cpu: Int) {

  //  注释： 上一次心跳时间
  var lastHeartBeatTime: Long = _

  override def toString: String = {

    taskmanagerid + "," + memory + "," + cpu
  }
}
