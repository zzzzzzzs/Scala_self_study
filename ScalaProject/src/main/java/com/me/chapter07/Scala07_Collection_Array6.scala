package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable.ArrayBuffer

object Scala07_Collection_Array6 {

    def main(args: Array[String]): Unit = {

        // TODO Scala - 集合 - 可变数组

        // Scala中可变集合，使用的方法最好是单词（字母）方法
        // Scala中不可变集合，使用的方法是颜文字方法
        val array = ArrayBuffer(1,2,3,4)
        val array1 = ArrayBuffer(5,6,7,8)

        val array2 = array += 5

        val array3: ArrayBuffer[Int] = array ++= array1

        println(array3 eq array)
        println(array3 eq array1)

        //println(array eq array1)
    }
}
