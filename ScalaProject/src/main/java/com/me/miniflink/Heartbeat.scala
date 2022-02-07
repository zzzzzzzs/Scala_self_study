package com.me.miniflink

/**
 * @author zs
 * @date 2021/12/24
 */
//  注释： 心跳消息 TaskManager -> JobManager
case class Heartbeat(val taskmanagerid: String)
