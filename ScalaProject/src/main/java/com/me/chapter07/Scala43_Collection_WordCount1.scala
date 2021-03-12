package com.atguigu.bigdata.scala.chapter07

object Scala43_Collection_WordCount1 {

    def main(args: Array[String]): Unit = {

        // TODO Scala - WordCount
//        val dataList1 = List(
//            "Hello Scala Spark Hive",
//            "Hello Scala Spark",
//            "Hello Scala ",
//            "Hello"
//        )
        val dataList = List(
            ("Hello Scala", 4), ("Hello Spark", 2)
        )

        // TODO 1. 思路： 将元组数据转换为 字符串
        // ("Hello Scala", 4) => "Hello Scala Hello Scala Hello Scala Hello Scala"

        val bigStringList = dataList.map(
            kv => {
                val str = kv._1
                val count = kv._2
                (str + " ") * count
            }
        )

        val wordList = bigStringList.flatMap(_.split(" "))

        val map: Map[String, List[String]] = wordList.groupBy(word=>word)

        val wordToCount: Map[String, Int] = map.map(
            kv => {
                (kv._1, kv._2.size)
            }
        )
        println(wordToCount)


    }
}
