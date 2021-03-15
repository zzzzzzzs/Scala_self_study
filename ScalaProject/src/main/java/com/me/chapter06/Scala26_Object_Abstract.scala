package com.me.chapter06


object Scala26_Object_Abstract {

    def main(args: Array[String]): Unit = {

        // TODO 面向对象 - 抽象
        // 所谓的抽象其实就是不完整
        // 抽象类 ： 不完整的类
        //           在类的前面声明abstract关键字
        //           抽象类无法构建对象
        //           如果想要抽象类构造对象，可以采用子类继承抽象类，然后再构建对象
        // 抽象方法：不完整的方法
        //           只有声明而没有实现的方法
        //           无需使用abstract关键字修饰

        // 抽象类和抽象方法的关系
        // 如果一个类中有抽象方法，这个类应该是抽象类。
        // 如果一个类是抽象类，但是并不一定会有抽象方法

        // 抽象类如果被子类继承，那么子类应该重写对应的抽象方法，否则这个子类也是不完整的。
        //       此时，也应该声明为抽象
        // 这里的重写方法，其实只要将方法补全即可

        val user = new ChildUser();
    }
    abstract class User {
        // TODO 抽象方法
        //      编译时，会自动生成abstract关键字
        //      abstract修饰符只能在类上使用
        def test():Unit
    }
    class ChildUser extends User{
        def test():Unit = {

        }
    }

}



