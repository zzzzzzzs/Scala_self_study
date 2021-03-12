package com.atguigu.bigdata.scala.chapter07

object Scala27_Collection_Method4 {

    def main(args: Array[String]): Unit = {

        // TODO Scala - 集合 - 常用方法
        //val list = List(1,2,3,4)
        val list: List[List[Int]] = List(
            List(1, 2), List(3, 4)
        )

        // TODO 集合数据的功能操作

        // TODO 将一个整体拆分成一个一个的个体来使用
        //      扁平化
        // List[List[Int]]
        // List[Int]
        val newList: List[Int] = list.flatten

        //println(list.size)
        //println(newList.size)
        //println(newList)

        // TODO 将字符串中的单词扁平化 : 分词
        val wordList = List( "Hello Scala", "Hello Hadoop" )

        // Hello
        // Scala
        // Hello
        // Hadoop
        // 字符串默认会被编译器识别为字符数组
        //val flatten: List[Char] = wordList.flatten
        //println(flatten)

        // Scala提供了自定义扁平化同时可以进行映射转换的操作
        // map + flatten
        // flatMap(  元素 => 拆分后的迭代集合 )
        val newWordList = wordList.flatMap(
            str => {
                str.split(" ").map(_*2)
            }
        )
        println(newWordList)

    }
}
