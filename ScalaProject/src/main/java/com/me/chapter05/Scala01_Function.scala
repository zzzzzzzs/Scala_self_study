package com.me.chapter05


object Scala01_Function {

    def main(args: Array[String]): Unit = {

        // TODO Scala 函数式编程
        //   在函数式编程领域中，万物皆函数！
        //   1. 函数就是方法，方法就是函数
        //   2. 函数的声明
        //      def 函数名（参数列表）：返回值类型 = { 函数体 }
        //   3. 函数的调用
        //      函数名（参数）


        test("zhangsan")
    }
    // 参数列表中的参数声明
    // 参数名1 ：参数类型1，参数名2：参数类型2
    def test( s : String ) : Unit = {
        // 函数体
        println(s)
    }
}
