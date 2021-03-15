package com.me.chapter06


import scala.beans.BeanProperty

object Scala16_Object_Field2 {

    def main(args: Array[String]): Unit = {

        // TODO Scala 面向对象 - 属性

        // Scala类中声明属性，其实不仅仅声明属性
        //  声明属性其实在编译时会声明私有的属性和两个公共的方法（set,get）
        val user = new User()
        // name_$eq => name_=()
        // 给Scala的对象的属性赋值的时候，等同于调用了属性的set方法
        user.name = "lisi"
        // 访问Scala对象的属性时，其实等同于访问这个属性的get方法
        println(user.name)
        // 如果类的属性声明为私有的，那么编译时，自动生成的set,get方法也是私有的，所以外部无法使用
        // 如果类的属性声明时使用val，那么编译时，会自动给属性添加final修饰符。
        //     编译时，也不会提供属性对应的set方法，所以无法给属性赋值。
        // Scala中声明的属性并没有遵循Bean规范，无法在大多数的框架中直接使用
        // Spring => 反射 => setXXX

        // Scala如果希望类符合Bean规范，可以在属性前增加对应的注解 : @BeanProperty
        //user.setSex()
        //user.getSex

    }
    class User {
        var name : String = _
        //private var age : Int = 20
        val age : Int = 20
        @BeanProperty var sex : String = "男"
    }
}
// Bean规范
// 属性私有化，存在属性对应的set，get方法
// setName, getName
/*
class User {
    public String name;
    public void setName( String name ) {
        this.name = name;

    }
}
 */



