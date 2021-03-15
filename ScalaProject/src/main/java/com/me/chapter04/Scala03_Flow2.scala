package com.me.chapter04


object Scala03_Flow2 {

    def main(args: Array[String]): Unit = {

        // Scala 流程控制
        // Scala中没有三元运算符,可以使用if。。.else代替
        // d = a？b:c
        val age = 20

        // Scala中如果判断逻辑代码只有一行，那么可以省略大括号
        val remark = if ( age == 20 ) {
            "少年"
        } else {
            "青年"
        }

        val s = if ( age == 20 ) "少年" else "青年"

        println(s)
    }
}
