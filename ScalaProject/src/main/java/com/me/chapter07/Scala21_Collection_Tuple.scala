package com.me.chapter07


import scala.collection.mutable

object Scala21_Collection_Tuple {

    def main(args: Array[String]): Unit = {

       // Scala 集合
        // Scala可以将无关的数据当成一个整体来使用，那么可以采用特殊的集合
        // 元组（Tuple）,使用小括号包含即可
        // 元素的组合
        // 1， zhangsan, 30
        val t = (1, "zhangsan", 30, true)
        //val t1 = (1,2,3,4,5,6,7,8,9,0, 1,2,3,4,5,6,7,8,9,0,1,2)

        // 访问数据
        // 如果想要获取某个数据，那么需要根据数据的顺序号访问
        // 元组中的元素的个数最多只能有22个
        // 元组中的22个数据不限定类型
        println(t._1)
        println(t._2)
        println(t._3)
        println(t._4)

        // 遍历数据
        val iterator: Iterator[Any] = t.productIterator
        while( iterator.hasNext ) {
            println(iterator.next())
        }

        // 索引定位
        t.productElement(0)

        // 元组中的数据不允许修改
        //t._1 = 2



    }
    class User {
        var id : Int = _
        var name : String = _
        var age : Int = _
    }
}
