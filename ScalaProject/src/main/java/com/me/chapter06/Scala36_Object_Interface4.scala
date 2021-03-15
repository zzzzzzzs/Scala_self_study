package com.me.chapter06


object Scala36_Object_Interface4 {

    def main(args: Array[String]): Unit = {

        // OCP => 开闭原则
        // 开发程序时，允许对功能扩展开放。对代码的修改要关闭
        // "selects * from user"
        // 动态代理

        // 使用特质给对象动态扩展(混入)功能
        val mysql = new MySQL() with InsertData
        mysql.select()
        mysql.insert()


    }
    trait InsertData {
        def insert(): Unit = {
            println("insert data...")
        }
    }
//    class NewSQL {
//        def insert(): Unit = {
//            println("insert data...")
//        }
//    }
    class MySQL {

        def select(): Unit = {
            println("select data...")
        }
    }
}



