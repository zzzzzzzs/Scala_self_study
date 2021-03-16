package com.me.chapter08



object Scala03_Match1 {

    def main(args: Array[String]): Unit = {

        // 模式匹配是有返回结果的
        var a: Int = 10
        var b: Int = 20
        var operator: Char = '+'
        var result = operator match {
            case '+' => a + b
            case '-' => a - b
            case '*' => a * b
            case '/' => a / b
            case _ => "illegal"
        }
        println(result)

    }
}
