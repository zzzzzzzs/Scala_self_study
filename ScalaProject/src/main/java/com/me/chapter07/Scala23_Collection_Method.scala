package com.me.chapter07



object Scala23_Collection_Method {

    def main(args: Array[String]): Unit = {

        // TODO Scala - 集合 - 常用方法
        val list = List(1,3,2,4,1,2,3,4)

        // TODO  获取集合的长度
        //println(list.size)
        //println(list.length)
        //println(list.isEmpty)

        // TODO 集合的遍历
        //println(list.iterator)
       // println(list.mkString(","))
        //list.foreach(println)

        // TODO 集合数据的判断和获取
        println(list.contains(2))
        // 获取数据
        println("take => " + list.take(2))
        println("takeRight => " + list.takeRight(2))
        println("drop => " + list.drop(2))
        println("dropRight => " + list.dropRight(2))

        // TODO 集合操作
        // 1,2,3,4
        // 4,3,2,1
        println("反转集合(不排序) => " + list.reverse)
        println("去重 => " + list.distinct)

    }
}
