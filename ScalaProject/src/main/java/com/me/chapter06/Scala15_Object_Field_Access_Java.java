package com.me.chapter06;

public class Scala15_Object_Field_Access_Java {
    public static void main(String[] args) throws Exception {

        //  TODO 访问权限：方法的提供者和方法的调用者之间的关系
        //  方法的提供者：com.atguigu.bigdata.scala.chapter06.A
        //  方法的调用者：com.atguigu.bigdata.scala.chapter06.Scala15_Object_Field_Access_Java

        // 同类（X）, 同包（X）,父子类（X）

        // i = i++
        // java中的点的作用不是调用，是从属关系
        A a = new A("zhangsan");
        A a1 = new A();
       // a1.name = "lisi";
        // 调用了a对象中的clone方法。
        a.clone();
    }
}
class A implements Cloneable{
    private String name;

    public A() {

    }
    public A( String name ) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}