package com.me.chapter06


object Scala19_Object_Method1 {

    def main(args: Array[String]): Unit = {

        // TODO Scala 面向对象 - 方法
        // 构造对象
        // 单例模式：构造方法私有化，提供公共的，静态的，返回本类型的方法

        // TODO 伴生对象的apply方法可以被编译器自动识别，自动调用
        val date1 = User.apply()
        val date2 = User()
        val date3 = User
        val user = User(10)
        println(date1)
        println(date2)
        println(date3)
        println(user)

        // TODO 伴生类中的apply方法
        val user1 = new User()
        val newUser1: User = user1.apply()
        val newUser2: User = user1()

        // TODO 如果 类名() 等同于调用伴生对象的apply方法
        //      如果 对象名称()  等同于调用伴生类的apply方法。
    }
    class User {
        def apply(): User = {
            println("apply....")
            new User()
        }
    }
    // object修饰的类似于Java中方的static
    object User {
        // 应用，可以构建对象,可以是其他类型的对象
        //def apply(): User = new User()
        def apply(): java.util.Date = new java.util.Date()
        // apply方法可以重载
        def apply(i:Int): User = new User()

    }
}



