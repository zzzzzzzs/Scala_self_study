package com.me.chapter05;

public class Scala04_Function {
    public static void main(String[] args) {

        regUser("zhangsan", null);
    }

    public static void regUser( String name, String password ) {
        if ( password == null ) {
            password = "123123";
        }
    }
}
