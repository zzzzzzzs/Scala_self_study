package com.atguigu.bigdata.scala.chapter11

import com.atguigu.bigdata.scala.chapter11.bean._

object Scala07_Generic3 {

    def main(args: Array[String]): Unit = {

        // TODO Scala的上下文限定，主要用于隐式转换和泛型结合的操作
        def f[A : Test](a: A) : Unit = {
            println(a)
        }
        implicit val test : Test[Child] = new Test[Child]
        // 如果出现如下的错误：（...）标红线，原因是隐藏参数没有找到对应隐式变量
        f( new Child() )


    }
    class Test[T] {
    }
}
