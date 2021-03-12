package com.atguigu.bigdata.scala.chapter06

object Scala13_Object_Field {

    def main(args: Array[String]): Unit = {

        // TODO Scala 面向对象 - 属性
        //  1. 类的属性其实就是类中的变量,在类的外部可以通过对象访问
        //     属性的声明规则和变量的声明规则完全一样。
        //     1.1 可以使用var, val来声明
        //     1.2 属性的类型可以省略
        //     1.3 变量在内部使用时，有作用域的概念
        //         属性在外部使用时，不存在作用域的概念，但是存在访问权限的概念
        //     1.4 属性的默认值
        //         java中一般不会给属性赋值，而是由编译器自动完成属性的初始化
        //         scala中的属性必须显示的初始化，不能默认初始化
        //         如果想要让scala和java中一样，采用编译器的自动初始化，可以使用下划线。
        //         使用val声明的属性不能使用下划线进行初始化赋值
        val user = new User()
        user.name = "lisi"
        println(user.name)

    }
    class User {
        // 属性声明的方式
        // TODO  访问权限 val | var 属性名 ：属性类型 = 属性值
        // 访问权限表示属性是否能够被访问。默认情况下，访问权限可以不声明，表示公共的。
        var name : String = _
        val age : Int = 20
        val sex = "男"
    }
}



