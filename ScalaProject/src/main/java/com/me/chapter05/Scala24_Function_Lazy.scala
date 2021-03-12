package com.atguigu.bigdata.scala.chapter05

object Scala24_Function_Lazy {

    def main(args: Array[String]): Unit = {

        // TODO Scala 函数 - 惰性函数 - lazy

        // 声明的函数，在调用时不是马上调用，是当我们需要用到这个函数的结果时，再调用。

        def fun9(): String = {
            println("function...")
            "zhangsan"
        }
        lazy val a = fun9() // 10000 User
        println("----------") // 10s
        println(a) // 使用10000 User



    }
}
