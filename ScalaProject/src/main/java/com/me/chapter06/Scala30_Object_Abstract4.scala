package com.atguigu.bigdata.scala.chapter06

object Scala30_Object_Abstract4 {

    def main(args: Array[String]): Unit = {
        new ChildUser()
        // 打印结果为0
        // 1. 子类可以重写父类的完整属性
        // 2. println打印的时候，访问属性，其实方法的属性的get方法
        //    get方法是成员方法，所以会使用动态绑定技术，执行ChildUser中的get方法
        // 3. 类的初始化和类的加载
        //    类的加载完成后执行类的初始化
        // 4. 父子类的初始化顺序
        //    父类初始化完成后才会执行子类的初始化操作
    }
    class Person {
        var name : String = _
    }
    /*
      // 父类
      class User {
          age = 20
          age() // get=>成员方法=>动态绑定=> 执行子类的age方法
          println(0)
      }
     */
    abstract class User {
        val age : Int = 20
        println(age)
    }
    /*
       // 子类
       class ChildUser extends User {
          age = 30
          age() // 返回age

       }

     */
    class ChildUser extends User {
        override val age : Int = 30
    }


}



