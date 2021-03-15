package com.me.chapter01

object Scala01_HelloWorld {
    /**
      1. object 是执行程序的一个固定写法
         java :

         class Test {
              public String name = "zhangsan";
              public static void main( String[] args ) {

              }
         }

      2. object 后面紧接着的是类名，类似于java中class

      3. def : scala语言中声明方法的关键字

      4. main : 其实就是执行的主程序方法, 如果名称发生变化，那么程序无法执行

      5. 小括号 : 方法名后面跟着的小括号表示参数列表

      6. args: Array[String] => 声明参数

            java  : String[] args
            scala : args: Array[String]

            java是一个强类型语言，更看重类型，所以需要直接了当，先声明类型
            scala 认为在开发中应该更关注名称，而不是类型，所以名称应该放置在前，一目了然。
                  先声明名称，再声明类型，中间使用冒号隔开。

      7. Array[String]
                 在scala语法中表示数组
                 java并不是完全面向对象的语言，所以其中包含了很多不是面向对象的语法
                 基本类型，静态，数组
                 scala语言是基于java语言开发的，所以是完全面向对象的语言。
                 所以数组也有自己的类型。
                 []表示泛型，String就表示数组中存放数据的类型

      8. main() : Unit

            java  : void main()    => 方法的返回值类型  方法名称（参数列表）
            scala : main() : Unit  => 方法名称（参数列表）: 方法的返回值类型

            void 在java中表示方法没有返回值。但是它是一个关键字。不是类型
            scala是完全面向对象的语言, void采用Unit类型来代替。也表示没有返回值

      9. 等号 ：赋值

            将一段逻辑赋值给方法，那么方法在执行时就可以执行逻辑。

      10. System.out.println("Hello Scala")

         scala语言是基于java语言开发的，所以在scala代码中可以直接调用java的api
         java中的类库可以直接在scala中使用

      11. println("Hello Scala")

         scala中有很多自己的语法
              a. println（打印）

              b. 代码的结束没有使用分号结尾
                 scala语言认为很多不必要的操作是可以省略了，由编译器决定是否允许省略。
                 scala认为代码只要换行了，就表示两段不同的逻辑，所以不需要分号也可以识别出来。
                 如果将两段逻辑放置在一行中，但是没有使用分号分隔开，那么编译器无法正确识别，会发生错误。
                 这个时候，就应该显示地增加分号。


     */
    // 类的主体内容
    def main(args: Array[String]): Unit = {
        // 方法的主体内容
        //new java.util.ArrayList();
        System.out.println("Hello Scala")
        println("Hello Scala")
    }
}
