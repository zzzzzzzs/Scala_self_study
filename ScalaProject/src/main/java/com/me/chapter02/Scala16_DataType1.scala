package com.me.chapter02

object Scala16_DataType1 {

    def main(args: Array[String]): Unit = {

        // java中null表示一个变量的取值为空
        // scala中null表示一个Null类型的对象，这个类型只有一个对象, 就是null

        // 多态
        //val name : String = null
        //val username = "zhangsan"

        //println(name)

        // Nothing : 无值,可以在很多地方使用(方法返回值, 空集合)
        //           为了体现面向对象的语法特征而特殊声明的类型。
        val nil: List[Nothing] = Nil
        // Unit : 没有返回值， 一般用于方法声明
    }
    def test(): Nothing = {
        throw new Exception
    }
}
