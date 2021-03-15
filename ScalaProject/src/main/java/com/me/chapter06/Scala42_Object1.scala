package com.me.chapter06


object Scala42_Object1 {

    println("111")
    def main(args: Array[String]): Unit = {

        // 1. 当前的main是静态方法吗？
        //    不是，是伴生对象的成员方法
        // 2. Scala42_Object1是什么？
        //     对象
        // 3. Scala42_Object1中的大括号中的内容代表什么意思？
        //     伴生对象的类主体内容，所以在构建对象时，会完成类的初始化操作.

        // 类初始化（1，3） => 对象创建 => main方法（成员方法）（2）

        println("222")
    }
    println("333")
}




