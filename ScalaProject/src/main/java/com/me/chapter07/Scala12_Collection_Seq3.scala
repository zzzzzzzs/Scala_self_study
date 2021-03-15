package com.me.chapter07



import scala.collection.mutable.ListBuffer

object Scala12_Collection_Seq3 {

    def main(args: Array[String]): Unit = {

        // TODO Scala - 集合 - 可变序列
        val buffer1 = new ListBuffer[String]()
        val buffer2 = ListBuffer("a","b","c")

        buffer1.append("a", "b", "c")// a, b, c
        buffer1.insert(1, "d", "e")  // a  d  e  b  c

        buffer1.update(0, "f") // f  d  e  b  c
        buffer1(1) = "h"       // f  h  e  b  c

        buffer1.remove(2)      // f  h  b  c
        buffer1.remove(2,2)    // f  h

        println(buffer1)
        println(buffer2)

    }
}
