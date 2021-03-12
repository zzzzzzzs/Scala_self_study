package com.atguigu.bigdata.scala.chapter04

object Scala06_Flow_For1 {

    def main(args: Array[String]): Unit = {

        // Scala 流程控制
       /*
        val list = 1 to 5
        for ( i : Int <- list ) {
            println("i = " + i)
        }
        */

        // 循环中，可以推断每一个数据的类型，数据类型可以省略
        /**/
        // 1 to 5 表示从1到5：1，2，3，4，5
        for ( i <- 1 to 5 ) {
            //println("i = " + i)
        }

        // by 2 表示循环的增长幅度
        for ( i <- 1 to 5 by 2 ) {
            //println("i = " + i)
        }



        // 常见集合类
        // Range集合类中第二个参数不包含：1，2，3，4
        for ( i <- Range(1,5, 2) ) {
            //println("i = " + i)
        }
        for ( i <- 1 until 5 ) {
            //println("i = " + i)
        }

        // 降序输出
        //1 to 5
        // 5, 4, 3, 2, 1
        for ( i <- 5 to 1 by -1) {
            println("i = " + i)
        }

        //
        //1 to 5 by 2
        //1.to(5).by(2)


    }
}
