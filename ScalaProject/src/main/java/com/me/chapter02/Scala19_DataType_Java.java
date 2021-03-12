package com.atguigu.bigdata.scala.chapter02;

public class Scala19_DataType_Java {
    public static void main(String[] args) throws Exception {

        // 常量，变量
        // 不可变变量
        //final String name = "zhangsan";

        // 编译器编译时可以直接计算常量结果的。
         //int i = 1 + 1 + 1 + 1 + 1;
        //int i = 5;
//        final char a = 'A';
        // 编译器编译时无法直接计算变量的结果，所以变量参与运算时，会出现类型转换错误
//        char c = a + 1;
//        System.out.println(c);

        byte b = 100 + 27;
        System.out.println(b);

    }
}
