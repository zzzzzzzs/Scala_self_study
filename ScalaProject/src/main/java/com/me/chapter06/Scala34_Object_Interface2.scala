package com.me.chapter06


object Scala34_Object_Interface2 {

    def main(args: Array[String]): Unit = {

        // TODO Scala 面向对象 - 特质
        val operate: Operate = new MySQL()
        operate.oper()

        // 在Scala编译时，会将特质编译为interface
        // 一个类混入特质时，等同于实现这个接口。


    }
    // 声明特质
    trait Operate {
        // 声明抽象方法
        def oper():Unit
    }

    // 一个类混入特质
    // 将特质中的抽象方法补全
    class MySQL extends Operate {
        // 重写方法
        //  1. 抽象方法 ：补充完整
        //  2. 完整方法 ：需要增加override关键字
        override def oper(): Unit = {
            println("执行MySQL数据操作")
        }
    }
}



