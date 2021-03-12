package com.me.chapter02.bean;

import java.io.Serializable;

public class User implements Serializable{
    public static int age;

    static {
        age = 20;
        System.out.println("user init.....");
    }
}
