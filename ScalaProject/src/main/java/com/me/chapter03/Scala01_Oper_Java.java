package com.atguigu.bigdata.scala.chapter03;

public class Scala01_Oper_Java {
    public static void main(String[] args) {

        // 1. 常量放置在哪里？
        //    字符串的常量池
        String s1 = "abc"; // #2  abc
        String s2 = "abc"; // #2  abc

        System.out.println(s1 == s2); // true
        System.out.println(s1.equals(s2)); // true

        String s3 = new String("abc"); // #6 String.class
        String s4 = new String("abc"); // #6 String.class

        System.out.println(s3 == s4); // false
        System.out.println(s3.equals(s4)); // true

    }
}
