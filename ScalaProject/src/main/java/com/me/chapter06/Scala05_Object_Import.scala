package com.me.chapter06




object Scala05_Object_Import {
    def main(args: Array[String]): Unit = {
        // TODO Scala 面向对象编程 - 导入

        // Java ： 导类， 静态导入
        // java语法中的import操作功能比较单一，但是不能舍弃
        // scala语言在java语法基础上进行扩展.

        // Scala import
        // TODO 1. import 可以声明在任意的位置
        //import java.util.Date
        //new Date()

        // TODO 2. java默认导入的类是java.lang包中所有的类
        //         Scala默认导入的类：
        //         2.1 java.lang包中的类
        //         2.2 scala包中的类
        //         2.3 Predef类（类似于java的静态导入）
        //println("zhangsan")

        // TODO 3. scala可以导包,也可以导类
        //import java.util
        //util.ArrayList

        // TODO 4. scala可以导入一个包中所有的类
        //         scala使用下划线代替java中的星号
        //         即使使用下划线导入包中所有的类，其实编译器也是按需导入
        //import java.util._
        //new ArrayList()

        // TODO 5. scala也可以在一行中导入一个包中多个类
        //         使用大括号将多个类包含起来
        //import java.util.{ArrayList, HashMap}
        //new ArrayList()
        //new HashMap()

        // TODO 6. 使用import的相关语法可以将指定的类隐藏
        //import java.util._
        //import java.sql.{Date=>_, _}
        // println(new Date(123123123))

        // TODO 7. 使用import可以给类起别名
        //import java.util.{HashMap=>JavaHashMap}
        //new JavaHashMap()

        //type S = String
        //new S()

        // TODO 8. 使用包名访问类的时候，这个类的所在包其实采用的相对路径查找。
        //         如果不想使用相对路径来查找类，可以采用特殊的路径（_root_）访问
        new java.util.HashMap()
        new _root_.java.util.HashMap()

    }


}
//package java {
//    package util {
//        class HashMap {
//
//        }
//    }
//}

