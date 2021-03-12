package com.atguigu.bigdata.scala.chapter07

import scala.math.Ordering

object Scala33_Collection_Method7 {

    def main(args: Array[String]): Unit = {

        // TODO Scala - 集合 - 计算函数
        val list = List(1,2,3,4)

        // TODO 想要对集合中的数据进行计算，但是计算的逻辑不确定?
        //      一般情况下，计算都应该产生计算结果。
        //      List => map => Result (X)
        //      List => filter => Result (X)
        //      List（N） => 简化，规约（reduce） => Result(1)
        // TODO Reduce方法的表示数据处理的规则
        //      为了使用方便，所有scala集合中数据处理基本上都是两两操作
//        val result: Int = list.reduce(
//            (x:Int, y:Int) => {
//                x * y
//            }
//        )

        //val result: Int = list.reduce((x:Int, y:Int) => {x * y})
        //val result: Int = list.reduce((x:Int, y:Int) =>x * y)
        //val result: Int = list.reduce((x, y) =>x * y)
        val result: Int = list.reduce(_ * _)
        println(result)

    }
}
