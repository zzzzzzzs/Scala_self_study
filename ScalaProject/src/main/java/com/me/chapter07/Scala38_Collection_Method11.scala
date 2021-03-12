package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable

object Scala38_Collection_Method11 {

    def main(args: Array[String]): Unit = {

        // TODO Scala - 两个Map集合的合并
        val A = mutable.Map( "a"->1, "b"->2, "c"->3 )
        val B = mutable.Map( "a"->4, "d"->5, "c"->6 )

        B.foreach(
            kv => {
                val key = kv._1
                val bvalue = kv._2

                val avalue = A.getOrElse(key, 0)
                A.update(key, avalue + bvalue)
            }
        )

        println(A)


    }
}
