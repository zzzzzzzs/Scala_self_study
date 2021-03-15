package com.me.chapter07


object Scala46_Collection_Map {

    def main(args: Array[String]): Unit = {

        // TODO Scala - map
        val list = List(
            ("a", 1), ("b", 2), ("c", 3)
        )

        val map = Map(
            ("a", 1), ("b", 2), ("c", 3)
        )
        // K - V
        //map.mapValues()
        println(list.map(
            (t) => (t._1, t._2 * 2)
        ))

        // 函数的声明中包含：
        //    函数名（输入）：输出
        // map中传递的匿名函数没有名称，关心的就只有输入，输出
        // （t） => B
        //    输入：Tuple
        //    输出：B




    }
}
