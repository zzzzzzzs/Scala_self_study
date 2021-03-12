package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable

object Scala18_Collection_Map1 {

    def main(args: Array[String]): Unit = {

        // TODO Scala - 集合 - 映射 - Map - 可变
//        val map1 = Map(
//            "a" -> 1, "b" -> 2, "c" -> 3,
//            "d" -> 1, "e" -> 2, "f" -> 3
//        )
//        println(map1)
        val map = mutable.Map(
            "a" -> 1, "b" -> 2, "c" -> 3
        )

        // put可以增加数据，其实也可以修改数据
        map.put("d", 4)
        map.put("d", 6)

        //map + ("d" -> 5)

        map.update("a", 10)
        map("b") = 20

        // updated方法会产生新的map集合
        //val newMap: mutable.Map[String, Int] = map.updated("c", 30)

        map.remove("b")
        //map - "c"
        map.clear()

        println(map)
        //println(newMap)



    }
}
