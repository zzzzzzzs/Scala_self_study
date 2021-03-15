package com.me.chapter06


object Scala27_Object_Abstract1 {

    def main(args: Array[String]): Unit = {

        // TODO 面向对象 - 抽象
        // 抽象类可以包含完整的方法

        // 子类如果重写父类的抽象方法，那么重写时什么都不需要，只要补充完整即可
        // 子类如果重写父类的完整方法，那么重写时需要使用override关键字修饰。明确这个方法用于重写。
        val user = new ChildUser()
        user.test()
    }
    abstract class User {
        def test():Unit = {
            println("user...")
        }
    }
    class ChildUser extends User{
        override def test():Unit = {
            println("child user...")
        }
    }

}



