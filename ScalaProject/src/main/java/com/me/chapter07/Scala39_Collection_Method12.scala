package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable

object Scala39_Collection_Method12 {

    def main(args: Array[String]): Unit = {

        // TODO Scala - 两个Map集合的合并
        val A = mutable.Map( "a"->1, "b"->2, "c"->3 )
        val B = mutable.Map( "a"->4, "d"->5, "c"->6 )

        val A1 = 0
        val B1 = List(1,2,3,4)
        // TODO fold方法要求初始值的数据类型和集合中的数据类型要保持一致
        //val result: Int = B1.fold(A1)(_+_)
        // TODO foldLeft方法的初始值的数据类型和集合中的数据类型可以不一致。
        //      最终的计算结果的数据类型应该和初始值保持一致.
        //B1.foldLeft(A1)(_+_)

        val newMap = B.foldLeft(A)(
            ( map, kv ) => {

                val k = kv._1
                val v = kv._2

                val v1 = map.getOrElse(k, 0)
                map.update(k, v + v1)

                map
            }
        )

        println(newMap)



    }
}
