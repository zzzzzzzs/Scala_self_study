package com.atguigu.bigdata.scala.chapter10

import com.atguigu.bigdata.test.TestScala

object Scala01_Transform {

    def main(args: Array[String]): Unit = {

        // OCP => Open Close开发原则

        // 如果当前的程序出现了错误，希望编译器可以通过自动化的手段帮助解决，而不需要
        // 改动任何的代码，遵循OCP开发原则

        // 编译器提供了一种隐式转换功能，帮助我们实现类型的转换。
        // byte b = 10
        // int i = b
        // Byte和Int类型之间没有任何的关系，但是编译器可以进行自动的转换（隐式转换）
        // 将Byte类型转换为Int类型的数据
        //val b : Byte = 10
        //val i : Int = b

        // 现在的错误 Double => Int ,编译器无法实现自动转换操作。
        // 之所以出现错误，是编译器的自动转换规则中没有 Double => Int,
        // 如果没有，我们可以自己添加转换规则。让编译器识别后自动使用即可
        // 想要让编译器可以识别自己定义转换规则，那么需要添加特殊的关键字

        // TODO 所谓的隐式转换可以简单的理解为二次编译
        //      第一次编译会出现错误
        //      编译器尝试在自己的编译规则找查找能够让程序编译通过的规则
        //      如果找到。那么会自动进行转换指定第二次编译。
        //      如果找不到，那么编译出现错误
        //      隐式转换的时机就是编译出现错误的方法

        // TODO 所谓的隐式转换其实就是类型的转换，这个转换是由编译器自动完成的
        implicit def transform( d : Double ): Int = {
            (d * 100).toInt
        }

        // ***************************************
        val testScala = new TestScala

        def test( num : Int ): Unit = {
            println("百分比为 " + num + "%")
        }

        test(testScala.num)
        // **************************************
    }

}
