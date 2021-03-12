package com.atguigu.bigdata.scala.chapter05

object Scala15_Function {

    def main(args: Array[String]): Unit = {

        // TODO Scala 函数式编程 - 闭包
        val a = 10

        def test() = {
            def test1(): Unit = {

            }
            test1 _
        }

        test()()


    }
}
