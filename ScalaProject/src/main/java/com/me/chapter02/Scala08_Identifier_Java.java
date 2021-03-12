package com.me.chapter02;

import java.lang.reflect.Field;

public class Scala08_Identifier_Java {
    public static void main(String[] args) throws Exception {

        // Java访问对象，需要创建对象或通过类名进行访问
        // Scala使用object关键字声明的类会产生两个类文件
        //new Scala08_Identifier2();
        //new Scala08_Identifier2$();

        // 由于scala编译器的编译规则，那么产生的类文件不太一样。
        // 所以java程序如果想要访问scala的对象，需要特殊的方式。
//        System.out.println(Scala08_Identifier2$.MODULE$);

    }
}
