package com.atguigu.bigdata.scala.chapter02

object Scala09_String {

    def main(args: Array[String]): Unit = {

        // Scala 字符串
        // Scala中的字符串其实就是java中的字符串
        // type String = java.lang.String
        val name : String = "zhangsan"
        println(s"name = ${name.length}")

        //
//        val z: String = name.substring(0,1)
//        println(z)


        //println("用户名称 = " + name)

        // JSON
        // JavaScript Object Notation
        // { "username":"zhangsan", "age":20 }

        // 字符串的拼接
        //println("{ \"username\":\""+name+"\", \"age\":20 }")
        // 字符串的传值
        //printf("{ \"username\":\"%s\", \"age\":20 }", name)
        // 字符串的插值
        //println("{ \"username\":\"${name}\", \"age\":20 }")
        //println(s"name = ${name}")
        // JSON格式字符串不能直接使用插值字符串。
        // 可以采用多行字符串的方式。
        //println(s"{ \"username\":\"${name}\", \"age\":20 }")
        //println(s"name = ${name},\n age = 20")
        // 多行字符串中的竖线表示顶格符
        // 多行字符串一般应用于 sql 或 json 字符串
        println(
            """
              | select
              |     *
              | from user
              | where id = 1
            """.stripMargin)

        println(
            s"""
              | { "username":"${name}", "age":20 }
            """.stripMargin)
//        println(
//            """
//              | name = zhangsan
//              | age = 20
//            """.stripMargin)
//        println("******************************")
//        println(
//            """
//               name = zhangsan
//               age = 20
//            """.stripMargin)





    }
}
