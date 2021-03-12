package com.atguigu.bigdata.scala.chapter06

object Scala37_Object_Interface5 {

    def main(args: Array[String]): Unit = {

        // 如果将特质看作抽象类，那么就存在类的初始化操作
        // 特质的初始化顺序
        // 1. 父类先执行初始化
        // 2. 多个特质按照从左到右的顺序完成初始化
        // 3. 当前类的初始化
        new MyClass()
    }
    trait MyTrait1 {
        println("MyTrait1")
    }
    trait MyTrait2 {
        println("MyTrait2")
    }
    class MyParent {
        println("MyParent")
    }
    // 混入特质
    // 类可以混入多个特质，第一个特质可以采用extends关键字，后续的特质混入时采用with
    // 如果类存在父类，那么使用extends关键字继承父类，采用with混入特质
    class MyClass extends MyParent with MyTrait1 with MyTrait2 {
        println("MyClass")
    }
}



