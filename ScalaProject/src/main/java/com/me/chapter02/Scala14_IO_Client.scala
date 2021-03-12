package com.atguigu.bigdata.scala.chapter02

import java.io.{ObjectOutputStream, PrintWriter}
import java.net.Socket

import com.me.chapter02.bean.User


object Scala14_IO_Client {

    def main(args: Array[String]): Unit = {

        // Scala 网络通信 - client
        // 连接端口，连接服务器，发送数据
        val client = new Socket("localhost", 9999)
        println("建立和服务器的连接")

        // 使用输出流发送数据
        // 1. 发送普通数据
        //client.getOutputStream.write(1)
        // 2. 发送字符串
//        val printWriter = new PrintWriter(
//            client.getOutputStream
//        )
        // Writer => Stream
        //printWriter.println("Hello Server...")
        // flush : 刷新，强制输出缓冲区中未达到阈值的数据.
        //printWriter.flush()

        // 3. 发送对象
        val user = new User();
        val objOut = new ObjectOutputStream(client.getOutputStream)
        objOut.writeObject(user)
        println("向服务器发送数据 ：Hello Server...")

        // 数据发送完毕，关闭链接
        client.close()
        println("关闭和服务器的连接")
    }
}
