package com.me.chapter07


import scala.collection.mutable

object Scala17_Collection_Map {

    def main(args: Array[String]): Unit = {

        // TODO Scala - 集合 - 映射 - Map
        // java map => 无序，存储的是 K - V 键值对对象, Key不能重复，V可以重复
        //            Entry, Node
        // Scala map => 无序，存储的是 K - V 键值对对象, Key不能重复，V可以重复
        //            k -> v
        // k - v键值对对象
        // K => V (关联，映射)
        // Scala中的键值对，k -> v
        val map = Map(
            "a" -> 1, "b" -> 2, "c" -> 3
        )
        val map1 = Map(
            "a" -> 4, "c" -> 6, "d" -> 7
        )

        val newMap: Map[String, Int] = map + ("d" -> 4)
        // 两个map集合的合并，不同key合并，相同key覆盖
        val newMap2: Map[String, Int] = map ++ map1
        val newMap1: Map[String, Int] = map - "a"

        val newMap3: Map[String, Int] = map.updated("a", 10)

        println(map)
        //println(newMap)
        //println(newMap1)
        //println(newMap2)
        println(newMap3)

    }
}
