package com.atguigu.bigdata.scala.chapter05

object Scala12_Function_Hell5 {

    def main(args: Array[String]): Unit = {

        // TODO Scala 函数式编程 - 地狱难度

        // TODO 函数是Scala中最重要的内容, 可以将函数看作对象来使用
        // TODO 3. 可以将函数作为返回值在函数中返回。
        def fun(): Unit = {
            println("fun...")
        }

        // TODO 函数会将满足条件的最后一行逻辑代码作为返回值
        //      可以将一个函数作为返回值返回
        def test() = {
            fun _
        }

        // 调用函数
        //val f = test()
        //f()
        test()()

    }
}
