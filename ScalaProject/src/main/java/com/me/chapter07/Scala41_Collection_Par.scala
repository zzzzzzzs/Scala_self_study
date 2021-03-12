package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable

object Scala41_Collection_Par {

    def main(args: Array[String]): Unit = {

        // TODO Scala - 集合

        val result1 = (0 to 100).map{
            // num => ThreadName
            num => {
                Thread.currentThread.getName
            }
        }

        val result2 = (0 to 100).par.map{
            // num => ThreadName
            num => {
                Thread.currentThread.getName
            }
        }

        println(result1)
        println(result2)

    }
}
