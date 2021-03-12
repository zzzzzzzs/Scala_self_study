package com.atguigu.bigdata.scala.chapter06

object Scala11_Object_Class3 {

    def main(args: Array[String]): Unit = {
        val user = new User()
        // Scala中默认的类型推断，只考虑对象本身的类型，不考虑继承关系
        // 如果想要考虑父类型，那么就不能让编译器自动推断,变量类型不能省略
        val user1 : Parent = new User()
    }
    class Parent {

    }
    class User extends Parent{

    }
    object User {

    }
}



