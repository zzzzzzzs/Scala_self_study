package com.me.chapter04


import scala.util.control.Breaks._

object Scala12_Flow_Break1 {

    def main(args: Array[String]): Unit = {

        // Scala中没有break关键字。
        // break语法比较单一，并且不是面向对象，null, void
        // Scala采用面向对象的语法代替break关键字。

        // Scala 中没有continue关键字，也不存在对应的语法
        // 简写
        var age = 10
        breakable {
            while ( age < 20 ) {

                if ( age == 15 ) {
                    // 跳出循环
                    // break方法会抛出异常，会中止程序的运行
                    break
                }
                println("age = " + age )
                age += 1
            }
        }


        println("main方法。。。")
    }
}
