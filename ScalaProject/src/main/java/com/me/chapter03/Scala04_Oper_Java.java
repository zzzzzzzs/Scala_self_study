package com.atguigu.bigdata.scala.chapter03;

public class Scala04_Oper_Java {
    public static void main(String[] args) {

        // 阶乘 ： 5！=5 * 4! = 5 * 4 * 3! = 5 * 4 * 3 * 2！ = 5 * 4 * 3 * 2 * 1
        // java.lang.StackOverflowError ： 栈溢出
        // 一个大于1的数的阶乘等于这个数 乘以这个数减一的阶乘
        int result = factorial(5);
        System.out.println("5的阶乘为 ：" + result );
    }
    private static int factorial( int num ) {
        if ( num <= 1 ) {
            return 1;
        } else {
            return num * factorial(num-1);
        }
    }
}
