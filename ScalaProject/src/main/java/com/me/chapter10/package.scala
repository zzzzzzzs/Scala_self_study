package com


import com.me.chapter10.Scala07_Transform6.User
package object me {
    implicit class User4(user:User) {
        def update(): Unit = {
            println("update user4...")
        }
    }
}
