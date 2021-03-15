package com.me.chapter02


object Scala05_Var5 {

    def main(args: Array[String]): Unit = {

        // Scala语言中有一个非常重要的原则
        // 至简原则 ： 能省则省

        // Java是一个强类型的语言，而scala基于java开发，所以也是强类型语言
        // 变量声明的类型和变量的取值类型应该是一致的。
        // Scala中可以省略变量的类型
        //val name : String = "zhangsan"
        // 编译器发现变量的取值为字符串类型，那么从语法角度来讲，name就应该是字符串类型
        // 所以即使name变量不声明String类型，编译器也能自动添加String类型，保证编译通过。
        // 这个操作，称之为编译器的自动识别(自动推断)
        val name = "zhangsan"
        println(name)

    }
}
