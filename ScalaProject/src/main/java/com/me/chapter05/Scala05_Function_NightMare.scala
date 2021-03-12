package com.atguigu.bigdata.scala.chapter05

object Scala05_Function_NightMare {

    def main(args: Array[String]): Unit = {

        // TODO Scala 函数式编程 - 噩梦难度
        // Scala中函数有至简原则 ： 能省则省
        // 这里的能省则省，必须是编译器可以自动推断的场合，才能省
        def fun1( name : String ): String = {
            return "Name : " + name
        }

        // TODO 1. 当函数需要返回值的时候，可以采用函数体中的满足条件的最后一行代码作为返回值
        //          所以可以省略return关键字
        def fun2( name : String ): String = {
            "Name : " + name
        }

        //println(fun2("zhangsan"))

        // TODO 2. 如果编译器能够推断出函数的返回值类型，那么返回值类型可以省略
        def fun3( name : String ) = {
            "Name : " + name
        }
        def fun33( name : String ) = {
            val age = 20
            if ( age == 20 ) {
                //"Name : " + name
                1.0
            } else {
                "name"
            }

        }
       // println(fun33("zhangsan"))

        // TODO 3. 如果函数体逻辑代码只有一行，那么大括号可以省略
        def fun4( name : String ) = "Name : " + name

        //println(fun4("lisi"))

        // TODO 4. 如果当前函数的参数列表没有参数的情况，那么小括号可以省略
        def fun5() = "wangwu"

        //println(fun5())
        // 如果函数的参数只有一个或没有，那么调用这个函数时，小括号可以省略
        // 1 + 1
        //println(fun5)

        def fun55 = "wangwu"
        val name = "zhangsan"

        // TODO 如果函数省略了参数列表的小括号，那么在调用时就不能使用小括号
        // 统一访问原则
        println(fun55)

    }
}
