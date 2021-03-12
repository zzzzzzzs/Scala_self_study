package com.atguigu.bigdata.scala.chapter07

import scala.math.Ordering

object Scala30_WordCount {

    def main(args: Array[String]): Unit = {

        // TODO Scala - 小练习 - WordCount
        // TODO 需求 ： 统计单词出现的次数，并且按照次数的大小取前3名
        // TODO 1. 准备数据
        val list : List[String] = List(
            "Hello Scala Spark Flink",
            "Hello Scala Spark",
            "Hello Scala",
            "Hello"
        )

        // TODO 2. 将数据拆成一个一个单词（分词）(flatMap)
        // string => word
        // flatMap可以将数据变得多一些
        val words : List[String] = list.flatMap(
            str => {
                str.split(" ")
            }
        )

        // TODO 3. 将相同的单词放置在一个组中，方便统计(groupBy)
        // word => Map(  word -> (word, word, word) )
        val groupWordMap: Map[String, List[String]] = words.groupBy(word=>word)

        // TODO 4. 将分组后的数据进行结构的转换(map)
        // (word, list) =>（word, count)
        val wordToCountMap: Map[String, Int] = groupWordMap.map(
            kv => {
                (kv._1, kv._2.size)
            }
        )

        //println(wordToCountMap)

        // TODO 5. 将统计后的结果按照count进行排序(sort)(降序)
        val wordToCountList: List[(String, Int)] = wordToCountMap.toList
        val sortList: List[(String, Int)] = wordToCountList.sortBy(kv=>kv._2)(Ordering.Int.reverse)

        // TODO 6. 将排序后的结果取前3名。(take)
        val top3List: List[(String, Int)] = sortList.take(3)

        // TODO 7. 将结果打印在控制台(foreach)
        top3List.foreach(println)

    }
}
