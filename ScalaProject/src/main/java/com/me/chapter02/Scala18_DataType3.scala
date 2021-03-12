package com.atguigu.bigdata.scala.chapter02

object Scala18_DataType3 {

    def main(args: Array[String]): Unit = {

        // Scala 类型转换 - 隐式转换 - 自动转换
        // java 代码
        // byte b = 10         (8)
        // int i = b           (32)
        // byte b1 = (byte)i   (8)
        // scala 代码
        // class Byte
        // class Int

        // Byte 和Int类型之间没有关系，但是也能够进行转换的原因是：
        // Scala编译器在进行编译时自动进行类型的转换，称之为隐式转换
        val b : Byte = 10
        val i : Int = b

        println(b + ", " + i)

    }
}
