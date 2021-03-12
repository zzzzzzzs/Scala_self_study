package com.atguigu.bigdata.scala.chapter03;

public class Scala03_Oper_Java {
    public static void main(String[] args) {

        // Scala中没有 ++， -- 运算符
        // 因为 ++， --运算有歧义，Scala语法中不希望出现有歧义的语法。
//        int i = 10;
//        i++;
//        System.out.println(i);

//        int i = 10;
//        int j = i++; // j = 10, i = 11
//
//        System.out.println("i = " + i + ", j = " + j);
        //System.out.println("***************************");

        //int i = 10;
        // 下面的思路是不正确的：
        // 1 => i = i = 10;
        // 2 => i + 1 = 11
        // 正确的思路：
        // 等号的作用：将等号右边的【计算结果】赋值给等号的左边
        // 先赋值，再累加
        // 1 => 将i赋值给临时变量 = 10， i变量加1 = 11
        // 2 => 将临时变量作为右边的计算结果赋值给等号的左边 = 10
        //i = i++; // i = 10, i = 11

        //System.out.println("i = " + i);
        // i = 10
        System.out.println("***************************");

        int i = 0;
        i = i++;
        System.out.println(i);

    }
}
