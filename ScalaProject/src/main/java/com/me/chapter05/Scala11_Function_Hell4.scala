package com.atguigu.bigdata.scala.chapter05

object Scala11_Function_Hell4 {

    def main(args: Array[String]): Unit = {

        // TODO Scala 函数式编程 - 地狱难度

        // TODO 函数是Scala中最重要的内容, 可以将函数看作对象来使用
        def test( f : (String)=>Unit ): Unit = {
            f( "zhangsan" )
        }

//        def fun( s : String ): Unit = {
//            println("name = " + s)
//        }

        //test( ( s : String ) => {  println(s) } )
        //test( ( s : String ) => println(s) )
        //test( ( s ) => println(s) )
        // TODO 如果参数列表只有一个参数，那么可以省略小括号
        //test( s => println(s) )
        //test( println(_) )
        test( println )



    }
}
