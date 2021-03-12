package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object Scala14_Collection_Seq5 {

    def main(args: Array[String]): Unit = {

        // TODO Scala - 集合 - 可变序列 和不可变序列的转换
        val list = List(1,2,3,4)
        val buffer : ListBuffer[String] = ListBuffer("a","b","c")

        // 不可变集合 => 可变
        val buffer1: mutable.Buffer[Int] = list.toBuffer
        println(buffer1)
        // 可变集合 => 不可变集合
        val list1: List[String] = buffer.toList
        println(list1)


    }
}
