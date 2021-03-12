package com.atguigu.bigdata.scala.chapter03

object Scala02_Oper {
    def main(args: Array[String]): Unit = {

        //        val s1 : String = "abc"
        //        val s2 : String = "abc"
        //
        //        println(s1 == s2)  // true
        //        println(s1.equals(s2)) // true

        val s3 : String = new String("abc")
        //val s3 : String = null
        val s4 : String = new String("abc")

        // Scala语言 中的双等号的作用其实进行了非空校验后进行equals操作
        // 所以 双等号不用于内存的比较
        //println(s3 == s4) // true
        //println(s3.equals(s4)) // true

        // 如果scala中想比较对象的内存地址

        // Scala中eq操作在编译时会编译为java中的双等号，所以才是真正地比较内存地址
        println(s3 eq s4)

        // TODO Scala中比较对象的内容使用 双等号
        // TODO Scala中比较对象的内存使用 eq

    }
}
