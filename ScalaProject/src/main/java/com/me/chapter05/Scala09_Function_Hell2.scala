package com.atguigu.bigdata.scala.chapter05

object Scala09_Function_Hell2 {

    def main(args: Array[String]): Unit = {

        // TODO Scala 函数式编程 - 地狱难度

        // TODO 函数是Scala中最重要的内容, 可以将函数看作对象来使用
        // TODO 2. 可以将函数作为参数传递给函数
        def test( name : String ): Unit = {
            println("name = " + name)
        }
        def test1( name : Int ): Unit = {
            println("name = " + name)
        }
        test("zhangsan")
        test1(20)
        // TODO 如果将函数作为参数传递， 那么参数名其实就是函数名
        //      那么参数类型其实不就是函数类型
        def test2( f : (Int)=>Int ): Unit = {
            //println("name = " + name)
            // 如果参数是函数类型，
            // 那么可以通过函数调用的方式来使用这个参数
            println(f(20))
        }

        def fun(i:Int): Int = {
            i * 2
        }
        //val f = fun _
        //test2( f )
        //test2( fun _ )
        test2( fun )




    }
}
