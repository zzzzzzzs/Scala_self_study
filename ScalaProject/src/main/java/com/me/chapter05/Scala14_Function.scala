package com.me.chapter05


object Scala14_Function {

    def main(args: Array[String]): Unit = {

        // TODO Scala 函数式编程 - 闭包

        // 一个函数当使用外部的变量时，由于作用域的问题，本来无法访问
        // 但是可以通过操作将这个变量包含到函数的内部，形成闭合的环境，这个环境称之为闭包
        // 可以改变变量的生命周期

        // 闭包编译的方式和版本相关
        // 2.12版本会采用改变函数声明的方式来实现闭包
        // 2.11版本会生成新的匿名函数类

        // TODO 闭包的场合：
        //  1. 匿名函数有闭包
        //  2. 将函数赋值给变量会有闭包
        //  3. 将内部函数返回到外部使用会有闭包

        // Spark框架会对闭包特殊的处理。

        def sum( i : Int ) = {
            def inner( j : Int ): Int = {
                i + j
            }
            inner _
        }

        val inner = sum(10)
        inner(20)

        //println(sum(10)(20))


    }
}
