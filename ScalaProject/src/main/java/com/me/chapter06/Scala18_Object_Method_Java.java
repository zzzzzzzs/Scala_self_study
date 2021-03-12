package com.atguigu.bigdata.scala.chapter06;

public class Scala18_Object_Method_Java {
    public static void main(String[] args) throws Exception {

        // TODO 方法的重载和重写

        // 方法的重写
        //  1. 存在父子类
        //  2. 父子类中都存在相同的方法
        //     方法名一致，参数列表一致，异常范围，访问权限
        AAA aaa = new AAA();
        System.out.println(aaa.sum());

        byte b = 10;
        test(b);
    }
    public static void test( byte b ) {
		System.out.println("bbb");
	}
	public static void test( short s ) {
		System.out.println("sss");
	}
    public static void test( char c ) {
        System.out.println("ccc");
    }
	public static void test( int i ) {
		System.out.println("iii");
	}
}
class AAA {
    public int i = 10;
    public int sum() {
        return i + 10;
    }
}
class BBB extends AAA {
    public int i = 20;
    public int sum() {
        return i + 20;
    }
}