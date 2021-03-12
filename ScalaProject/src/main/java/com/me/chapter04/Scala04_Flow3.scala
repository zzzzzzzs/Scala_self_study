package com.atguigu.bigdata.scala.chapter04

object Scala04_Flow3 {

    def main(args: Array[String]): Unit = {

        // Scala 流程控制
        val age = 20

        // 编译器在省略变量类型的情况下，会采用自动推断的方式进行补全操作
        // 编译时，无法对条件进行判断，所以编译器应该考虑不同的场合。
        // 编译器必须提供一个类型，又可以满足正确的逻辑，又可以满足不正确的逻辑
        // Any = String || Unit
        val result = if ( age == 20 ) {
            "zhangsan"
        } else {
            null
        }

        // result => Any
        println(result)

    }
}
