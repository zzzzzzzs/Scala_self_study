package com.me.chapter04


object Scala09_Flow_For4 {

    def main(args: Array[String]): Unit = {

        // for表达式的结果其实就是Unit
        // 如果想要将每一次循环的数据返回，那么需要使用特殊的处理（关键字）
        val result = for ( i <- 1 to 5 ) yield{
//            println(i)
            i * 2
        }

        println(result)

        // Scala中可以直接调用Java的API
        Thread.`yield`()



    }
}
