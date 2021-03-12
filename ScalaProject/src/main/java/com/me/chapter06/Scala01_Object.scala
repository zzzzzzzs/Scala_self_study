package com.atguigu.bigdata.scala.chapter06
import java.util.Date
object Scala01_Object {

    def main(args: Array[String]): Unit = {

        // Scala 面向对象编程
        // Scala面向对象编程的代码和Java的代码基本类似
        /*
           Java :

           package com.atguigu.bigdata // TODO 包
           import java.util.Date;  // TODO 导入
           public class User { // TODO 声明类
               public String name; // TODO 声明属性
               public void setName( String name ) { // TODO 声明方法
                   this.name = name;
               }
               public String getName() {
                   return this.name;
               }
           }
           User user = new User()// TODO 创建对象
           user.name   // TODO 访问对象的属性
           user.setName("zhangsan")// TODO 访问对象的方法
         */

        // TODO Scala创建对象
        val user : User01 = new User01()
        // TODO Scala访问对象的属性
        println(user.name)
        // TODO Scala访问对象的方法
        user.test()

        val user14 = new User14()
        //user14.name_package
        user14.name_package

    }
}
class User01 { // TODO Scala声明类
    var name : String = "zhangsan" // TODO Scala声明属性
    def test(): Unit = { // TODO Scala声明方法
        println("user01...")
    }
}