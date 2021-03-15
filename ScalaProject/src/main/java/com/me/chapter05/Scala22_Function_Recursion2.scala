package com.me.chapter05


object Scala22_Function_Recursion2 {

    def main(args: Array[String]): Unit = {

        // TODO Scala 函数 - 递归
        // 递归是Scala中用户的最多的数据处理的算法

        // 普通递归
        // 编译器不做任何的优化，其实就是递归
        def fun():Unit = {
            fun()
            println("test...")
        }

        // 尾递归
        // 编译器会将尾递归操作优化为while循环
        def fun1():Unit = {
            println("test...")
            fun1()
        }

        fun()


    }
}
