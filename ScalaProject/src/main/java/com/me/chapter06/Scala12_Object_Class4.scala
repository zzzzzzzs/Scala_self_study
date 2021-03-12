package com.atguigu.bigdata.scala.chapter06

object Scala12_Object_Class4 {

    def main(args: Array[String]): Unit = {

        // Parent, User 在object中声明。那么表示内部类
        // Scala的源码文件中可以声明多个公共类( 访问权限 )
        // 并且不需要和源码文件名一致
    }

}
class Parent {

}
class User extends Parent{

}
object User {

}


