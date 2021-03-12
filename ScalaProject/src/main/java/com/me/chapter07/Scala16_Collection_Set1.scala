package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable

object Scala16_Collection_Set1 {

    def main(args: Array[String]): Unit = {

        // TODO Scala - 集合 - 集 - Set - 可变
        val set = Set() // 不可变Set集合
        val set1 = mutable.Set(1,2,3,4) // 可变Set集合

        set1.add(5)
        //set1.append()
        //set1.insert()

        // update方法主要用于更新整个集合
        //set1.update(6, true)
        //set1.update(3, false)

        set1.remove(2)

        println(set1)

    }
}
