package com.atguigu.bigdata.scala.chapter05

object Scala21_Function_Recursion1 {

    def main(args: Array[String]): Unit = {

        // TODO Scala 函数 - 递归
        // 如果递归函数存在跳出的逻辑，也依然有可能出现栈溢出的情况
        // JVM在调用方法（函数）的时候，会向栈内存中压栈（栈帧）
        // 当方法执行完毕或跳出，会 被栈内存弹出

        // 为什么递归函数会出现栈溢出的问题
        // 因为在函数内部调用递归操作时，返回结果被使用了，需要等待，无法释放内存

        def test( num:Long ):Long = {
            if ( num <= 1  ) {
                1
            } else {
                num + test(num-1)
            }
        }

        println(test(100000000L))


    }
}
