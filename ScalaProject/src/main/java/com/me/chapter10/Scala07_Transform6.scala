package com.me.chapter10

import com.me.chapter10.Scala07_Transform6.User

object Scala07_Transform6 extends Parent{

    def main(args: Array[String]): Unit = {

        // TODO Scala 隐式转换的作用域
        //   1. 相同作用域
        //   2. 上级作用域(parentClass, package, trait) => class object
        //   3. 上级作用域(parentClass, package, trait) => class object
        val user = new User()
        user.insert()
        user.update()
    }
    class User {
        def insert(): Unit = {
            println("insert user...")
        }
    }
//    implicit class User1(user:User) {
//        def update(): Unit = {
//            println("update user1...")
//        }
//    }
}
trait TraitTest {

}
object  TraitTest {
    implicit class User3(user:User) {
        def update(): Unit = {
            println("update user3...")
        }
    }
}
class Parent extends TraitTest{

}
object Parent {
//    implicit class User2(user:User) {
//        def update(): Unit = {
//            println("update user2...")
//        }
//    }
}
