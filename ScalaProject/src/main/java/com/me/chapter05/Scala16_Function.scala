package com.me.chapter05


object Scala16_Function {

    def main(args: Array[String]): Unit = {

        // TODO Scala 函数柯里化
        // 将复杂的函数的参数简单化
//        def test( a:Int, b:Int, c:Int ): Unit = {
//            for ( i <- 1 to a ) {
//
//            }
//
//            for ( i <- 1 to b ) {
//
//            }
//
//            for ( i <- 1 to c ) {
//
//            }
//        }
//
//        val a = 1 to 5 // 5s
//        val b = 5 to 100 // 10s
//        val c = 100 to 1000 // 15s
//
//        test(1,2,3)
        def test( a : Int ) = {
            for ( i <- 1 to a ) {
                println("i = " + i)
            }

            def test1( b:Int ) = {
                for ( j <- 1 to b ) {
                    println("j = " + j)
                }

                def test2( c:Int ): Unit = {
                    for ( k <- 1 to c ) {
                        println("k = " + k)
                    }
                }

                test2 _
            }

            test1 _

        }

        test(5)(10)(15)


    }
}
