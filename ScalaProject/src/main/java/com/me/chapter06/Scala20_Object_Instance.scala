package com.atguigu.bigdata.scala.chapter06

object Scala20_Object_Instance {

    def main(args: Array[String]): Unit = {

        // TODO Scala 面向对象 - 构造方法
        // java中每一个类默认提供无参构造方法，可以不需要显示的声明, 也可以显示的声明
        // scala中的构造方法的名称不是和类名一致，和类名一致的方法其实就是普通方法。
        // scala默认提供无参的构造方法，但是也可以显示的声明
        // scala是一个完全面向函数式编程的语言。万物皆函数。类其实也是函数
        // 所以类名的后面是可以增加小括号，那么这个函数其实就是构造函数。

        // 构造方法执行时，会完成类的初始化操作
        // 构造方法如果需要传递参数，那么不能省略小括号
        val user = new User("zhangsan")
        //user.User()
        println(user)

    }
    class User(name:String) {
        // 函数体 & 类的主体
        println("user...")
//        def User(){
//            println("user...")
//        }
    }
}



