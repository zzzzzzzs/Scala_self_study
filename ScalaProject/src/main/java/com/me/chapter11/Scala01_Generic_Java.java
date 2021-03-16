package com.me.chapter11;


import com.me.chapter11.bean.*;
public class Scala01_Generic_Java {
    public static void main(String[] args) {

        // TODO 1. 泛型介绍
        //      JDK1.5 - 马丁 - Pizza
        //      对象类型和泛型不是一个层面的东西
        //      类型主要修饰对象，变量，参数，方法返回值的类型
        //      泛型主要修饰（约束）指定类型内部数据的类型

        //   类声明了泛型，那么泛型就可以理解为类型参数
        //   但是如果不传递这个参数，那么参数就自动作为Object来使用
        //Test test = new Test();
        //test.t // Object

        //  如果传递这个参数, 那么参数就会改变指定类的中属性类型
        //Test<User> test = new Test<User>();
        //test.t // User

        new java.util.ArrayList<User>();
    }
}
