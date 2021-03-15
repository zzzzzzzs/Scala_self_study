package com.me.chapter07


import scala.collection.mutable.ListBuffer

object Scala13_Collection_Seq4 {

    def main(args: Array[String]): Unit = {

        // TODO Scala - 集合 - 可变序列
        val buffer : ListBuffer[String] = ListBuffer("a","b","c")

        // 产生新的集合
        val buffer1: ListBuffer[Any] = buffer :+ 1

        // 不会产生新的集合
        val buffer2: ListBuffer[String] = buffer += "d"
        // += 方法要求传递的参数（增加的数据）和当前集合的类型保持一致
        //val buffer3: ListBuffer[Any] = buffer += 1 (X)

        // 删除元素，产生新的集合
        val buffer3: ListBuffer[String] = buffer - "a"
        // 删除元素，返回当前集合类型
        val buffer4: ListBuffer[String] = buffer -= "b"

//        println(buffer eq buffer1)
//        println(buffer eq buffer2)
        println(buffer)
        println(buffer3)
        println(buffer4)


    }
}
