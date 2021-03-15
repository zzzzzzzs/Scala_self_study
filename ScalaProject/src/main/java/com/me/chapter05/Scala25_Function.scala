package com.me.chapter05


object Scala25_Function {

    def main(args: Array[String]): Unit = {

       // TODO 函数是什么?
        // Java中没有函数的概念，也就意味着编译后的class文件也不可能有函数
        // Scala有函数的概念，但是编译后的class文件中不能有函数的概念
        // 那么函数到底什么？

        // TODO 1. Scala编译器会将函数在编译时转换为当前类的静态，final的方法
        def test(): Unit = {
            println("abc")
        }

        def fun() = {
            test _
        }

        // TODO 2. 当将函数赋值给变量的时候，那么编译器会在编译时产生匿名函数
        //         产生一个特殊的对象（Function0）,调用其固定的 方法。执行逻辑
        //val a = test _

        //a()

        // TODO 3. Scala中函数式编程其实在编译后会编译为方法，类，对象。
        //         通过组合来实现对应的功能.
        fun()()



    }
}
