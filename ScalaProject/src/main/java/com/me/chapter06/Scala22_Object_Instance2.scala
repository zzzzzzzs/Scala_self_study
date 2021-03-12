package com.atguigu.bigdata.scala.chapter06

object Scala22_Object_Instance2 {

    def main(args: Array[String]): Unit = {

        // TODO Scala 面向对象 - 构造方法

        // TODO 子类构造对象时，会首先构造父类对象
        //      子类在类初始化之前，必须保证父类已经完成类的初始化

        //  问题： 如果父类构造方法有参？
        //        子类继承父类时，可以直接在父类名的后面传递参数
        //        子类的构造参数可以直接传递给父类的构造方法

        val user = new User("lisi");
    }
    class Person(name:String) {
        println("person init..." + name)
    }
    class User(name:String) extends Person(name){
        println("user init...")
    }
}



