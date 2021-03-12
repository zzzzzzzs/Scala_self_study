package com.atguigu.bigdata.scala.chapter05

object Scala17_Function_curry {

    def main(args: Array[String]): Unit = {

        // TODO Scala 函数柯里化 - 一般是有闭包
        // Scala针对柯里化函数有特殊的语法来使用
        def test(a:Int)(b:Int)(c:Int) = {
            a + b + c
        }

        def test1(a:Int, b:Int, c:Int): Unit = {
            a + b + c
        }

        println(test(5)(10)(15))

    }
}
