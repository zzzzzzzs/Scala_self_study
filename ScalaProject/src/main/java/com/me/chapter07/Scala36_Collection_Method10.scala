package com.me.chapter07



object Scala36_Collection_Method10 {

    def main(args: Array[String]): Unit = {

        // TODO Scala - 集合 - 计算函数 scan
        val list = List(1,2,3,4)

        // Scala scan方法和fold方法很类似。
        // fold方法会将集合的数据最终聚合成一个结果
        val i: Int = list.fold(0)(_+_)
        // scan方法会将每一次的计算结果保存下来，形成计算结果的集合
        val ints: List[Int] = list.scan(0)(_+_)
        // scanLeft方法和foldLeft方法很类似。
        val ints1: List[Int] = list.scanLeft(0)(_-_)
        // scanRight方法和foldRight方法很类似。
        // 1, 2, 3, 4, 0
        val ints2 = list.scanRight(0)(_-_)
        println(ints2)

    }
}
