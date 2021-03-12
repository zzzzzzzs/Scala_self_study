package com.atguigu.bigdata.scala.chapter06

object Scala28_Object_Abstract2 {

    def main(args: Array[String]): Unit = {

        // TODO 面向对象 - 抽象

        // 抽象属性 ： Scala中不完整的属性就是抽象属性
        //             如果一个类中包含抽象属性，那么这个类是不完整的，也应该声明为抽象类
        //             抽象类无法构造对象，需要子类继承后，再构建对象
        //             如果子类继承抽象类，那么需要将不完整的内容进行补全，才可以创建对象
        //              否则这个子类也需要声明为抽象类

        // 子类应该将抽象属性补充完整 ： 将属性初始化

        // 抽象属性在编译时根本就不会生成属性，而是生成属性对象的set，get两个抽象方法
        // 子类继承抽象类，补全抽象属性，其实等同于增加属性并将set，get两个抽象方法进行重写

        // 属性（变量）应该显示的初始化
        val user = new ChildUser()
        println(user.name)

    }
    abstract class User {
        // TODO 抽象属性
        var name:String
    }
    class ChildUser extends User {
        var name:String = "zhangsan"
    }


}



