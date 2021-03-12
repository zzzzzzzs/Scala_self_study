package com.atguigu.bigdata.scala.chapter02

object Scala03_Var1 {

    def main(args: Array[String]): Unit = {

        // Scala中如果一个变量初始化后不想发生改变，不能使用final修饰
        // Scala采用了一种特殊的语法方式(关键字)来实现这个功能
        // Scala声明变量可以使用val关键字
        // Scala中使用编译器的语法限制实现了val操作，和final不太一样。

        // 使用val和var声明的变量的区别：
        // 1. 使用var声明的变量可以改变变量的值
        // 2. 使用val声明的变量一旦初始化后无法改变变量的值。
        // val 和 var都可以声明变量，只是变量的值是否可以更改。

        // val声明的变量一般称之为不可变变量，而不是常量
        // 常量 一般为 ： 1， "abc", 'c', true
        val username : String = "zhangsan"
        //username = "lisi"

        // 使用变量
        println(username)


    }
}
