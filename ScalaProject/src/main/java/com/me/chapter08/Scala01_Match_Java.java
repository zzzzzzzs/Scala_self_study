package com.me.chapter08;

public class Scala01_Match_Java {
    public static void main(String[] args) {

        // Scala中模式匹配语法类似于Java的switch语法
        // Scala中没有switch语法，因为switch语法有歧义
        int i = 5;

        // switch多重分支判断
        // switch穿透现象
        switch (i) {
            case 5:
            case 10 :
                System.out.println("i = 10");
                break;
            case 20 :
                System.out.println("i = 20");
                break;
            default :
                System.out.println("other");
        }
        System.out.println("main...");

    }
}
