package com.me.chapter02


object Scala02_Var {

    def main(args: Array[String]): Unit = {

        /*
              Scala - 变量

           1. 类变量 - 属性

           2. 局部变量 - 方法内部

              java  =>  int i = 10;
              scala =>  var 变量名称 : 变量类型 = 变量值

         */

        // 声明变量
        // 问题： scala的源码应该会编译为java的字节码class文件
        //        那么java的class文件中不应该有var操作,所以scala编译的class文件发生了什么？
        // 回答： scala在语法上有var关键字，但是编译后没有，和java的一致的。
        //       所以scala和java的核心区别在编译器的编译规则。
        var username : String = "zhangsan"

        // 使用变量
        println(username)


    }
}
