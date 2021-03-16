package com.me.chapter10

import com.me.chapter10.Scala06_Transform5.User
object Scala06_Transform5 {

    def main(args: Array[String]): Unit = {

//        implicit def transform( user:User ): UserExt = {
//            new UserExt()
//        }
        // TODO Scala版本升级后，可以将扩展类和隐式函数合二为一，使用"隐式类"来实现同样的功能
        // 隐式类：在类的前面使用关键字 implicit
        // 所谓的隐式转换其实就是类型的转换 ： A => B
        // 隐式类不能作为顶级对象来使用
        // 隐式类的构造方法只能有一个参数

        val user = new User()
        user.insert()
        user.update()

    }
    implicit class UserExt( user:User ) {
        def update(): Unit = {
            println("update user...")
        }
    }
    class User {
        def insert(): Unit = {
            println("insert user...")
        }
    }

}
