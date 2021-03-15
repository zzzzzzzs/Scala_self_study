package com.me.chapter04


import scala.util.control.Breaks

object Scala11_Flow_Break {

    def main(args: Array[String]): Unit = {

        // Scala中没有break关键字。
        // break语法比较单一，并且不是面向对象，null, void
        // Scala采用面向对象的语法代替break关键字。
        var age = 10
        Breaks.breakable {
            while ( age < 20 ) {

                if ( age == 15 ) {
                    // 跳出循环
                    // break方法会抛出异常，会中止程序的运行
                    Breaks.break()
                }
                println("age = " + age )
                age += 1
            }
        }


        println("main方法。。。")
    }
}
