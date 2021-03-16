package com.me.chapter10


object Scala03_Transform2 {

    def main(args: Array[String]): Unit = {

        // TODO Scala中的隐式转换功能可以实现功能的扩展，非常的强大
       implicit def transform(user:User): Ext = {
            new Ext()
        }

        // OCP
        //*************************************
        val user = new User() //with Ext // 动态混入
        user.insert()
        user.update()
        //*************************************
    }
    class Ext {
        def update(): Unit = {
            println("update user...")
        }
    }
    class User {
        def insert(): Unit = {
            println("insert user...")
        }
//        def update(): Unit = {
//            println("update user...")
//        }
    }

}
