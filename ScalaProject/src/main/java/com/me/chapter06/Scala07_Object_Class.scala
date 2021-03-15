package com.me.chapter06


object Scala07_Object_Class {
    def main(args: Array[String]): Unit = {
        // TODO Scala 面向对象编程 - 类
        // TODO class & object 的区别？
        //   1. class和java中的class没有区别，表示类型定义
        //      编译时会产生对应的类文件
        //   2. object 关键子可以声明类，编译时会产生两个类文件
        //      一个就是当前类文件，还有一个是 当前类名$  class文件
        //      scala是完全面向对象的语言，所以摒弃了不是面向对象的语法
        //      其中就包括static语法，scala中没有静态语法
        //      为了和java语法兼容，采用了特殊的方式代替静态语法
        //      使用object关键字声明的class中的方法和属性可以通过类名直接访问

        //     使用object关键字会产生单例对象，然后通过这个单例对象来访问方法和属性
        //     但是这个单例对象我们无法直接访问，所以通过object关键字修饰后，可以通过
        //     修饰后的类名间接访问
        //     一般会将object声明时所创建的单例对象称之为伴生对象，伴随着类所产生的单例对象
        Scala07_Object_Class.test()

        // 静态语法是通过类型直接访问静态属性或静态方法
    }
    def test(): Unit = {
        println("test...")
    }
}


