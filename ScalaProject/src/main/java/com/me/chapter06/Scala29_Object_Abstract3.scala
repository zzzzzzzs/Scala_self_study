package com.me.chapter06


object Scala29_Object_Abstract3 {

    def main(args: Array[String]): Unit = {

        // TODO 面向对象 - 抽象

        // 如果子类重写父类的完整属性，那么需要使用override修饰符
        // 子类重写父类的属性，那么重写的属性必须为val修饰的
        // 如果可以将var变量进行重写，那么在使用时会产生歧义，所以语法不允许

        val user = new ChildUser()
        //println(user.name)
        user.test()

    }
    abstract class User {
        val name:String = "zhangsan"

        def test(): Unit = {
            //name = "wangwu" // setName("wangwu") => 成员方法 => 动态绑定技术 =>
            println(name)   // getName() => 成员方法 => 动态绑定技术 =>
            // 有歧义
        }
    }
    class ChildUser extends User {
        override val name:String = "lisi"
        // setName("wangwu") => name ="wangwu"
        // getName() => "wangwu"
    }


}



