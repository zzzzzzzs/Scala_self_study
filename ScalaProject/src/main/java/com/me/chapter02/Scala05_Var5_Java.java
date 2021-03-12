package com.me.chapter02;

import java.lang.reflect.Field;

public class Scala05_Var5_Java {
    public static void main(String[] args) throws Exception {

        // 可变字符串   : StringBuilder, StringBuffer
        // 不可变字符串 : String
        // Java中的字符串之所以不可变，主要原因就是:
        //   private final char value[];
        //  一旦value属性初始化后，值无法发生改变。
        //  字符数组是引用类型，所以值其实就是内存地址
        // String虽然是不可变字符串，但是主要描述的是引用地址不可变，内容可变。
        // String类没有提供任何一个改变当前字符串内容的方法。
        // String的很多方法会产生新的字符串。
        String s = " a b ";
        // trim方法返回新的字符串，去掉当前字符串的首尾半角空格
        // ,，.。
//        s = s.trim();
//        System.out.println("!"+s+"!");
        // ! a b !
        // !a b!

        // 更改字符串的内容，而不是地址
        // 正常手段无法做到，需要使用反射
        final Field value = s.getClass().getDeclaredField("value");
        value.setAccessible(true);
        final char[] cs = (char[])value.get(s);
        cs[2] = 'd';

        System.out.println("s = " + s);
    }
}
