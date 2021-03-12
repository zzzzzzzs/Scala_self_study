package com.atguigu.bigdata.scala.chapter07

object Scala03_Collection_Array2 {

    def main(args: Array[String]): Unit = {

        // TODO Scala 集合 - 数组
        // 默认情况下，Scala提供的集合都是不可变集合
        // 对集合的操作都会产生新的集合，原有的集合不会发生变化。
        val array1 = Array(1,2,3,4)
        val array2 = Array(5,6,7,8)

        // TODO 添加数据, 产生新的集合
        // 数组的末尾增加数据
        //val newArray: Array[Int] = array1.:+(5)
        //val newArray: Array[Int] = array1 :+ 5
        // 数组的开始增加数据
        //val newArray1: Array[Int] = array1.+:(6)
        // Scala中运算符的操作中有一个特殊的规则：
        // 如果运算符以冒号结尾，那么运算规则从右向左运算
        //val newArray1: Array[Int] = array1 +: 6 （X）
        //val newArray1: Array[Int] = 6 +: array1

        // TODO 添加集合
        val newArray2: Array[Int] = array1 ++: array2

        //println(array1 eq newArray)

        //展示数据
        println(array1.mkString(", "))
        //println(newArray.mkString(", "))
        //println(newArray1.mkString(", "))
        println(newArray2.mkString(", "))


    }
}
