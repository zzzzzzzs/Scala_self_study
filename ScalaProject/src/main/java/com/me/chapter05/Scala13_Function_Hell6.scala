package com.atguigu.bigdata.scala.chapter05

object Scala13_Function_Hell6 {

    def main(args: Array[String]): Unit = {

        // TODO Scala 函数式编程 - 地狱难度

        // TODO 函数是Scala中最重要的内容, 可以将函数看作对象来使用
        // TODO 3. 可以将函数作为返回值在函数中返回。
        //         一般将函数作为返回值返回时，使用的是嵌套函数
//        def outer() : ()=> Unit = {
//            def inner(): Unit = {
//                println("inner function...")
//            }
//
//            inner
//        }
//
//        outer()()

//        def sum( i:Int ) = {
//            def innerSum(j : Int): Int = {
//                i + j
//            }
//
//            innerSum _
//        }
//
//        println(sum(10)(20))

        // operator(10)(20)(xxxx) => 30,200, -10
        def operator( x : Int ) = {
            def inner( y : Int ) = {
                def oper( f : (Int, Int) => Int ): Int = {
                    f(x, y)
                }
                oper _
            }
            inner _
        }

        //operator(10)(20)((x,y)=>{x + y})
        println(operator(10)(20)(_ * _))

    }
}
