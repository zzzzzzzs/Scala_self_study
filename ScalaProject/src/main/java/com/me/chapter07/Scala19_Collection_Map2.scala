package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable

object Scala19_Collection_Map2 {

    def main(args: Array[String]): Unit = {

        // TODO Scala - 集合 - 映射 - Map - 可变
        val map = mutable.Map(
            "a" -> 1, "b" -> 2, "c" -> 3
        )

        // TODO 获取数据
        // 从Map中根据Key获取数据，value可能存在也可能不存在。
        // 如果取到数据，直接进行操作，但是如果取不到，获取的结果为null，那么就有可能出现空指针异常
        // Scala中的map为了避免出现空指针异常，使用了一种特殊的类型：选项类型（Option）
        // Option类型只有2个对象：Some, None
        //    当能够获取到值的时候，就是Some
        //    如果取不到值的时候，就是None
        //val value = map.get("a") // Some(1)
        //val value1 = map.get("d") // None

        // Option类型的get方法只有在Some对象的时候可以使用
        //println(value.get)
        // 如果在None的场合使用get，会发生异常
        //println(value1.get)
        //if ( !value.isEmpty ) {
        //    println(value.get)
        //}

        // TODO 如果从map中获取数据获取不到，需要设定默认值时，scala提供了特殊的方法来使用
        val i: Int = map.getOrElse("d", 0)
        println(i)

        //map.get("a").getOrElse(0)


    }
}
