package com.me.chapter02


import java.io.{BufferedReader, InputStreamReader, ObjectInputStream}
import java.net.{ServerSocket, Socket}

object Scala13_IO_Server {

    def main(args: Array[String]): Unit = {

        // Scala 网络通信 - server
        // 占用端口号，监听指定的端口，接收数据
        val server = new ServerSocket(9999)
        println("服务器已经启动...")
        println("等待客户端的连接...")
        // 接收客户端
        val client: Socket = server.accept()
        println("客户端已经连接...")
        // 获取客户端发送的数据

        // 1. 读取简单数据
        //val i: Int = client.getInputStream.read()
        // Stream => Reader

        // 2. 读取字符串数据
//        val reader = new BufferedReader(
//            new InputStreamReader(
//                client.getInputStream
//            )
//        )
//
//        println("客户端发送的数据为：" + reader.readLine())

        // 3. 读取对象数据
        val objIn = new ObjectInputStream(client.getInputStream)
        println("客户端发送的数据为：" + objIn.readObject())

        server.close()



    }
}
