package com.me.chapter03;

public class Scala05_Oper_Java {
    public static void main(String[] args) {

        // 判断字符串是否非空。如果不为空，返回true,如果为空，返回false
        // 字符串如果为null，表示空，如果为空字符串，也为空。

        // & : 逻辑与， 所有条件都会判断执行
        // && : 短路与， 如果第一个条件为false，逻辑短路，不会向后执行，直接返回结果
        String s = null;
        boolean flg = isNotEmpty(s);
        System.out.println(flg);
    }
    private static boolean isNotEmpty( String s ) {
        return s != null && !s.equals("");
    }
}
