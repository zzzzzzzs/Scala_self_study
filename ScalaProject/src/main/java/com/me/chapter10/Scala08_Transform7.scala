package com.atguigu.bigdata.scala.chapter10

import com.atguigu.bigdata.scala.chapter10.Scala07_Transform6.User

object Scala08_Transform7 {

    def main(args: Array[String]): Unit = {

//        import com.atguigu.bigdata.scala.chapter09._

        val user = new User()
        user.insert()
//        user.update()
    }
    class User {
        def insert(): Unit = {
            println("insert user...")
        }
    }

}
