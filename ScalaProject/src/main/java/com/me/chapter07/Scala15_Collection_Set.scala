package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object Scala15_Collection_Set {

    def main(args: Array[String]): Unit = {

        // TODO Scala - 集合 - 集 - Set
        // java : Set 无序(插入的顺序)，不可重复
        // TODO 1. 创建集合
        val set1 = Set(1,2,3,4,5,6,7,8)
        val set2 = Set(1,2,3,4,1,2,3,4)

        // TODO 2. 操作数据
        val newSet1: Set[Int] = set1 + 9
        val newSet3: Set[Int] = set1 ++ set2
        //println(set1 eq newSet1)

        val newSet2: Set[Int] = set1 - 2

        // TODO 3. 访问数据，数据遍历
        //println(set1)
        //println(set2)
        println(newSet1)
        println(newSet2)
        println(newSet3)


    }
}
