package com.me.chapter01

object Scala02_HelloJava {
    /**
      1. scala要想执行，也需要编译成class文件，如果平台不变，scala编译后的字节码文件
          应该和java编译的字节码文件的规则一样。
          java : public static void main   => XXXXXXX
          scala :  def main : Unit         => XXXXXXX

      2. classpath : 类路径(类文件的存放路径)

         windows dos 窗口：以当前的位置作为classpath
         idea : 项目基于maven创建的，所以classpath遵循maven的规则，在target/classes目录中
                idea展示class文件时，采用特殊的方式。

      3. scala的程序在编译后会产生两个class文件

         第一个class文件 ： 当前类名 + .class
         第二个class文件 ： 当前类名 + $ + .class，使用object关键字声明的类文件

         使用class关键字声明类，会产生当前类的class文件
         使用object关键字声明类，会产生当前类的class文件和一个特殊的class文件

      4. 如果向查看class文件

         a.  使用javap工具可以查看字节码文件

         b.  可以使用反编译工具 ： class => java

            b.1   第三方工具 ： jd-gui.exe
            b.2   IDEA自带的反编译工具 ： 右键点击类文件 => Decompile Scala to Java

      5. 通过反编译，可以看到，生成的字节码文件中其实包含了如下内容

        a.   public static void main( String[] args )

        b.   a = new 当前类$.class 对象

        c.   a.main => 调用scala中main方法

        d.  在scala的main方法中调用了代码：System.out.println("Hello Java")
     */
   def main( args : Array[String] ) : Unit = {
       System.out.println("Hello Java")
       println("Hello Java")
   }
}
