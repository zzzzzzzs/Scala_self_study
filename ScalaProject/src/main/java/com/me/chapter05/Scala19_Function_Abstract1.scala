package com.atguigu.bigdata.scala.chapter05

import scala.util.control.{BreakControl, Breaks}

object Scala19_Function_Abstract1 {

    def main(args: Array[String]): Unit = {

        // TODO Scala 函数 - 控制抽象
        // 将代码作为参数传递到函数中
        def test(op: => Unit) {
            // 调用参数，但是由于参数没有声明小括号，所以调用时，也不能使用小括号
            op
        }

        test{
            println("zhangsan")
        }

    }
}
