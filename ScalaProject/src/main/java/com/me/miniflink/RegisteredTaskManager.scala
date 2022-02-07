package com.me.miniflink

/**
 * @author zs
 * @date 2021/12/24
 */
//  注释： 注册完成消息 JobManager -> TaskManager
case class RegisteredTaskManager(val jobmanagerhostname: String)
