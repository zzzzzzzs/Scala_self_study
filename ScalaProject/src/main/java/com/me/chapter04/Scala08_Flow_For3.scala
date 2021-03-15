package com.me.chapter04


object Scala08_Flow_For3 {

    def main(args: Array[String]): Unit = {

        // Scala 流程控制
//        for ( i <- Range(1,4) ) {
//            for ( j <- Range(1,3) ) {
//                println("i = " + i + ",j = " + j )
//            }
//        }
//
//        for ( i <- Range(1,4); j <- Range(1,3) ) {
//            println("i = " + i + ",j = " + j )
//        }

        for ( i <- 1 to 5; j = i - 1) {
            //al j = i - 1
            println(j)
        }



    }
}
