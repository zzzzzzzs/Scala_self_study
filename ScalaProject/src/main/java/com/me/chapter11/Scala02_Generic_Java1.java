package com.me.chapter11;


import com.me.chapter11.bean.*;
import java.util.*;

public class Scala02_Generic_Java1 {
    public static void main(String[] args) {

        // TODO 2. 泛型 - 类型擦除
        //    JVM是没有泛型的概念，只是在编译器的层次起作用

        // LocalVariableTypeTable
        Test<User> test = new Test<User>();
        System.out.println(test);

        // TODO 3. 泛型的问题
        //      泛型其实在两个维度上进行操作， 不能当成整体来使用
        //      外部类型 List
        //      内部类型 <String>
        //List<String> stringList = new ArrayList<String>();
        //test(stringList); // (X) 此处的传值是不正确的。
        //test1(stringList); // (OK) 如果内部类型相同，那么外部类型可以存在上下级关系

    }
    public static void test( List<Object> list ) {

    }
    public static void test1( Collection<String> list ) {

    }
}
