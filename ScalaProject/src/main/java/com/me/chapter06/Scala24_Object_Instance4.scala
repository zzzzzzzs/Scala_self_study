package com.me.chapter06


object Scala24_Object_Instance4 {

    def main(args: Array[String]): Unit = {

        // TODO 给构造方法传参，目的何在？
        //  1. 类的初始化过程需要使用外部的参数
        //  2. 属性的初始化来自于外部的参数

        // 类的属性不能和类的构造参数重名
        // 类的构造参数一般用于属性赋值，那么就导致属性值和参数值一致，冗余。
        // 马丁优化了参数的设定 : 将构造参数作为类的属性存在。需要使用特殊语法(var, val)
        val user = new User("zhangsan")
        //user.name = "lisi"
    }

    class User(val name:String){
        //var username : String = name
        def this(  name : String, age : Int  ) {
            this("zhangsan")
        }
    }
}



