package com.me.chapter06


object Scala38_Object_Interface6 {

    def main(args: Array[String]): Unit = {
        // 初始化（？次）
        new MyClass()


    }
    trait MyTrait1 {
        println("MyTrait1")
    }
    // 特质可以继承其他特质，也可以继承其他的类
    trait MyTrait2 extends MyTrait1{
        println("MyTrait2")
    }
    trait MyTrait3 extends MyTrait1 {
        println("MyTrait3")
    }
    class MyParent extends MyTrait1 {
        println("MyParent")
    }
    class MyClass extends MyParent with MyTrait2 with MyTrait3 {
        println("MyClass")
    }
}
// MyTrait1
// MyParent
// MyTrait2
// MyTrait3
// MyClass



