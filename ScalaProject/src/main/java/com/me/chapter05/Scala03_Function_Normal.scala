package com.atguigu.bigdata.scala.chapter05

object Scala03_Function_Normal {

    def main(args: Array[String]): Unit = {

        // TODO Scala 函数式编程 - 普通难度

        // 基本的语法使用
        // TODO 1. 函数无参，无返回值
        def fun1(): Unit = {
            //println("f1...")
        }

        fun1()

        // TODO 2. 函数无参，有返回值
        def fun2(): String = {
            return "zhangsan"
        }

        var name = fun2()
        //println(name)

        // TODO 3. 函数有参，有返回值
        def fun3( name : String ): String = {
            return "Name: " + name
        }

        name = fun3("lisi")
        //println(name)

        // TODO 4. 函数有参，无返回值
        def fun4( name : String ): Unit = {
            //println("Name : " + name)
        }

        fun4("wangwu")

        // TODO 5. 函数多参，无返回值
        def fun5( name : String, password:String ): Unit = {
            println(s"Name : $name, Passowrd : $password")
        }

        //fun5("zhaoliu", "123123")

        // TODO 6. 函数多参，有返回值
        def fun6( name : String, password:String ): String = {
            return s"Name : $name, Passowrd : $password"
        }

        val s = fun6("tianqi", "123123")
        println(s)
    }
}
