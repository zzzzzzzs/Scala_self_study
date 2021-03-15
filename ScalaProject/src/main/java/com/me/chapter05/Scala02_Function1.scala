package com.me.chapter05


object Scala02_Function1 {

    def main(): Unit = {

    }
    def main(args: Array[String]): Unit = {

        // TODO Scala 函数式编程
        // 函数 & 方法
        // 函数的概念来自于Scala
        // 方法的概念来自于Java
        // Scala是完全面向函数式编程语言，所以方法其实就是函数
        // 一般情况下，将类中封装的功能函数称之为方法
        // 其他地方封装的功能就称之函数
        // 函数可以声明在任意的地方

        // 方法中可以声明函数
        // 函数中不能声明方法，因为方法只能在类中声明

        // TODO 类中的函数就是方法，所以符合java中方法的语法规则: 重写 & 重载
        // TODO 函数没有重写和重载的概念
        def test(): Unit = {
            println("test...")
        }
//        def test( s : String ): Unit = {
//            println("test...")
//        }

        test()
    }
}
