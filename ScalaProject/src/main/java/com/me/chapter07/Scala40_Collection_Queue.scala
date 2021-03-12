package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable

object Scala40_Collection_Queue {

    def main(args: Array[String]): Unit = {

        // TODO Scala - 集合 - Queue队列
        val que = new mutable.Queue[String]()
        // 添加元素
        que.enqueue("a", "b", "c")
        //val que1: mutable.Queue[String] = que += "d"

        // 获取数据
        println(que.dequeue())
        println(que.dequeue())
        println(que.dequeue())

        // Kafka : 如何保证数据的有序性


    }
}
