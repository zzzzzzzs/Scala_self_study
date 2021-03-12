package com.atguigu.bigdata.scala.chapter05

object Scala10_Function_Hell3 {

    def main(args: Array[String]): Unit = {

        // TODO Scala 函数式编程 - 地狱难度

        // TODO 函数是Scala中最重要的内容, 可以将函数看作对象来使用
        /*
           public void test( String name ) {
               name.substring()
           }

           String password = "123123"
           test("password)


         */
        def test( f: (Int, Int) => Int ): Int = {
            f ( 10,20 )
        }

//        def fun(i : Int, j : Int): Int = {
//            i + j
//        }

        // TODO 将函数作为参数传递给另外一个函数使用
        //      一般情况下，不会独立声明这个函数，而是使用匿名函数
        //      匿名函数 ：(i : Int, j : Int) => { 函数体 }
        //val result = test(fun)
        //val result = test((i : Int, j : Int) => { i + j })
        // TODO 匿名函数也可以遵循至简原则

//        val result = test((i : Int, j : Int) => { i + j })
        // TODO 如果函数逻辑代码只有一行，大括号可以省略
//        val result = test((i : Int, j : Int) => i + j )
        // TODO 如果参数类型可以推断，那么参数类型可以省略
//        val result = test((i, j) => i + j )
        // TODO 如果参数在逻辑中值使用了一次，那么参数可以使用下划线代替，参数就可以省略
        //      下划线是按照参数的声明顺序进行代替的，第一个下划线就是代替第一个参数
        val result = test(_ + _)

        println(result)



    }
}
