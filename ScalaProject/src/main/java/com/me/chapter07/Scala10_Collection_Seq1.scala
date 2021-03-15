package com.me.chapter07


object Scala10_Collection_Seq1 {

    def main(args: Array[String]): Unit = {

        // TODO Scala - 集合 - 序列
        // 空集合, 一般用于产生新的集合
        //List()
//        val nil = Nil
//        println(nil)
        // 产生新的集合
        //val list: List[Int] = 1 :: 2 :: 3 :: Nil
        //println(list)

        val list = List(1,2)
        // 当前场合，将list集合作为一个整体放到Nil中
        val list1: List[Any] = 3 :: 4 :: list :: Nil

        // 如果想要将list集合中的每一个元素拆分开放到Nil中，需要采用特殊的处理
        // 扁平化:将一个整体拆分成一个一个的个体使用
        val list2 = 3 :: 4 :: list ::: Nil

        println(list1)
        println(list2)
    }
}
