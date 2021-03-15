package com.me.chapter06


object Scala21_Object_Instance1 {

    def main(args: Array[String]): Unit = {

        // TODO Scala 面向对象 - 构造方法
        // java中构造方法可以重载，声明多个

        // TODO Scala中构造方法只有一个吗？
        // 不是只有一个，Scala中提供了2种不同类型的构造方法
        // 1. 主构造方法：在类名后的构造方法，称之主构造方法，主要功能完成类的初始化
        // 2. 辅助构造方法：为了完成类的初始化的辅助功能而提供的构造方法
        //                  辅助构造方法必须调用主构造方法，完成类的初始化
        //                  辅助构造方法必须直接或间接调用主构造方法
        //                  辅助构造方法互相调用时，需要保证条用的构造方法提前声明
        //          声明方式 ： def this() = {}
        //val user1 = new User()
       // val user2 = new User("zhangsan")
        val user3 = new User("zhangsan", 20)

    }
    class User() {
        println("aaa...")
        def this( name : String ) = {
            this()
            println("bbb...")
        }
        def this( name:String, age:Int ) {
            this(name)
            println("ccc...")
        }

        println("ddd...")
    }
}



