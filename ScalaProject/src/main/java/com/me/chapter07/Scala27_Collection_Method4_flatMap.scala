package com.me.chapter07

import java.util

object Scala27_Collection_Method4_flatMap {


    def main(args: Array[String]): Unit = {
        // flatMap是flatten + map。需要满足flatten特性（该集合内部必须还有同样类型的集合，如List(List(...)）。
        // 去掉2个集合。取出的元素然后进行map操作，返回的元素加上List集合
        List(
            List(1, 2, 3),
            List(5, 6)
        ).flatMap(e => e).foreach(println)

        // 因为这里的e还是一个集合List（虽然只有一个元素），所以使用map，取出单独的元素
        List(
            List(1, 2, 3),
            List(5, 6)
        ).flatMap(e => {
            e.map(_ * 2)
        }).foreach(println)
    }
}
