package com.atguigu.bigdata.scala.chapter04

object Scala05_Flow_For {

    def main(args: Array[String]): Unit = {

        // Scala 流程控制
        /*
            java
            for ( int i = 0; i < 10; i++ ) {
                // 循环体
            }

            for ( Object obj : list ) {
                //println(obj)
            }
         */
        // Scala 的循环和Java的循环不太一样。循环方式类似于增强for循环。
        // java 增强for循环 来自于JDK1.5 => 马丁 => pizza

        // 创建集合(从1到5)
        // scala中的for循环使用符号不是冒号，是左箭头（颜文字）
        val list = 1 to 5
        for ( i : Int <- list ) {
            println("i = " + i)
        }

    }
}
