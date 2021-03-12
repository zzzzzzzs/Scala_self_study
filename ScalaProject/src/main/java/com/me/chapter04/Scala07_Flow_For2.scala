package com.atguigu.bigdata.scala.chapter04

object Scala07_Flow_For2 {

    def main(args: Array[String]): Unit = {

        // Scala 流程控制

        // 循环守卫：循环的时候增加条件判断，条件成立，执行循环体
        for ( i <- 1 to 5 if( i % 2 == 0 ) ) {
            println("i = " + i)
        }

        for ( i <- 1 to 5  ) {
            if( i % 2 == 0 ) {
                println("i = " + i)
            }
        }



    }
}
