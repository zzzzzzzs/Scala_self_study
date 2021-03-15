package com.me.chapter06.bean;

public class User extends Person {
    public int age = 30;

    public void test() {
        System.out.println("super.age" + super.age);
        System.out.println("this.age" + this.age);
    }
}
