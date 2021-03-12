package com.atguigu.bigdata.scala.chapter07

import scala.math.Ordering

object Scala31_WordCount1 {

    def main(args: Array[String]): Unit = {

        val list : List[String] = List(
            "Hello Scala Spark Flink",
            "Hello Scala Spark",
            "Hello Scala",
            "Hello"
        )

        list
            .flatMap(_.split(" "))
            .groupBy(word=>word)
            .map(
                kv => {
                    (kv._1, kv._2.size)
                }
            )
            .toList
            .sortBy(_._2)(Ordering.Int.reverse)
            .take(3)
            .foreach(println)

    }
}
