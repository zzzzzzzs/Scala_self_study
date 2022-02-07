package com.me.miniflink

//  注释： 注册消息  TaskManager -> JobManager
case class RegisterTaskManager(val taskmanagerid: String, val memory: Int, val cpu: Int)