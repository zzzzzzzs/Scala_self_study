package com.atguigu.bigdata.scala.chapter04

object Scala02_Flow1 {

    def main(args: Array[String]): Unit = {

        // Scala 流程控制
        // Scala中表达式有返回值的,可以将返回值赋值给变量来使用
        // 表达式的返回值是表达式中满足条件的最后一行代码的执行结果。
        // 表达式不是真正的方法，所以无需return
        val age = 20
        val result = if ( age == 20 ) {
            //println("年龄为20")
            "年龄为20"
            20
        }

        // 当前result的结果为(),其实就是Unit
        println(result)

    }
}
