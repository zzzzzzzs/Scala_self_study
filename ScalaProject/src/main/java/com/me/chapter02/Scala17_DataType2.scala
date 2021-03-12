package com.atguigu.bigdata.scala.chapter02

object Scala17_DataType2 {

    def main(args: Array[String]): Unit = {

        // scala中的数据类型分为值类型和引用类型
        // 值类型和引用类型之间无法互相转换。
        val s : String = null
        // Int是值类型， null是引用类型，无法互相转换。所以会发生错误
        // 此处可以使用Nothing， 不推荐使用， Nothing是一个抽象类，不能直接构建对象
        val age : Int = 1

        println(s"name = $s, age = $age")

    }
}
