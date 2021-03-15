package com.me.chapter07



object Scala44_Collection_WordCount2 {

    def main(args: Array[String]): Unit = {

        // TODO Scala - WordCount
        val dataList = List(
            ("Hello Scala", 4), ("Hello Spark", 2)
        )

        // TODO 2. 思路： 将元组数据转换为 (word, count)
        //     ("Hello Scala", 4) => (Hello, 4), (Scala, 4)
        //      Hello => (Hello, 4)
        //      Scala => (Scala, 4)

        // TODO 对数据进行扁平化处理
        val wordToCountList: List[(String, Int)] = dataList.flatMap(
            kv => {
                val str = kv._1
                val count = kv._2

                val words = str.split(" ")
                words.map(word => (word, count))
            }
        )

        // TODO 将数据根据单词进行分组
        // hello -> List[ (hello, 4), (hello, 2) ] -> List[4,2] -> sum
        // hello -> 6
        val groupMap: Map[String, List[(String, Int)]] = wordToCountList.groupBy(_._1)

//        val wordToSumMap: Map[String, Int] = groupMap.map(
//            kv => {
//                val word = kv._1
//                val list = kv._2
//
//                val countList: List[Int] = list.map(_._2)
//
//                (word, countList.sum)
//            }
//        )
        // TODO 如果在数据处理中，数据类型为KV类型，那么当K保持不变，只对V进行操作时。
        //      可以采用集合的mapValues方法
        val wordToSumMap = groupMap.mapValues(
            list => {
                list.map(_._2).sum
            }
        )

        println(wordToSumMap)



    }
}
