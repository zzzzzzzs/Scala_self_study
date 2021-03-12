package com.atguigu.bigdata.scala.chapter10

object Scala04_Transform3 {

    def main(args: Array[String]): Unit = {

        val s = "zhangsan"
        val a = Array("a", "b")

//        s.charAt(0)
//        s.substring(0,1)
//        s.toCharArray()(0)

        // 类名()
        //User() => User.apply()
        // 对象名()
        //user() => obj.apply()
        // s

        // user -> update(Ext)         => User -> Ext
        // string => apply(StringOps)  => String -> StringOps
        // TODO Import
        //    java.lang._
        //    scala._
        //    scala.Predef(静态导入)
        // StringOps类可以理解为String的扩展类，由Scala编译器自动进行转换。
        //s.apply(0)
        s(0)
        //println(s(0))
        //println(a(0))
    }

}
