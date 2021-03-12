package com.atguigu.bigdata.scala.chapter04

object Scala01_Flow {

    def main(args: Array[String]): Unit = {

        // Scala 流程控制
        // if
        val age = 20

        // 单分支
        if ( age == 20 ) {
            //println("年龄为20")
        }

        // 双分支
        if ( age == 30 ) {
            //println("年龄为30")
        } else {
            //println("年龄不为30")
        }

        // 多分支
        if ( age < 12 ) {
            println("少年")
        } else if ( age < 30 ) {
            println("青年")
        } else if ( age < 50 ) {
            println("中年")
        } else {
            println("老年")
        }

    }
}
