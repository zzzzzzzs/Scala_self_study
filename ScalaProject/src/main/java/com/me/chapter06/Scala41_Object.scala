package com.me.chapter06


object Scala41_Object {

    def main(args: Array[String]): Unit = {

        // 枚举
        println(Color.BLUE)
        println(Color.BLUE.id)
    }
    // 枚举类
    object Color extends Enumeration {
        val RED = Value(1, "red")
        val YELLOW = Value(2, "yellow")
        val BLUE = Value(3, "blue")
    }
}




