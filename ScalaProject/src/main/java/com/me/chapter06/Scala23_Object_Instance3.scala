package com.me.chapter06


object Scala23_Object_Instance3 {

    def main(args: Array[String]): Unit = {

        val user = new User();
    }
    class Person(name:String) {
        println("aaa")
        def this() {
            this("zhangsan")
            println("bbb")
        }
    }
    class User(name:String) extends Person(){
        println("ccc")
        def this() {
            this("lisi")
            println("ddd")
        }
    }
}
//aaa
//ccc
//ddd



