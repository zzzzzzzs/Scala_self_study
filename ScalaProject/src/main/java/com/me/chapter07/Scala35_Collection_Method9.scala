package com.me.chapter07


object Scala35_Collection_Method9 {

    def main(args: Array[String]): Unit = {

        // TODO Scala - 集合 - 计算函数
        val list = List(1,2,3,4)

        // reduce, reduceLeft, reduceRight 集合内部数据的聚合
        // 但是在某些情况下，需要将集合之外的数据和集合内部的数据进行聚合
        // 所以reduce, reduceLeft, reduceRight这些方法不太适用，可以采用折叠的方式来实现。
        // fold
        // 折叠的方法其实就是将集合之外的数据和集合内部的数据进行两两计算
        // 所以集合之外的数据称之为zero（初始值）

        // fold方法底层调用的其实就是foldLeft
        // fold, foldLeft其实是将初始值作为x使用, 放置在集合的左边
        val i: Int = list.fold(10)(_-_)
        val j: Int = list.foldLeft(10)(_-_)
        // reversed.foldLeft(z)((x, y) => op(y, x))
        // 1, 2, 3, 4
        // 5, 4, 3, 2, 1
        // (1, (2, (3, (4, 10))))
        // foldRight其实是将初始值作为y使用, 放置在集合的右边
        val k: Int = list.foldRight(10)(_-_)
        println(i + "," + j + ", " + k)

    }
}
