package com.me.chapter07


object Scala24_Collection_Method1 {

    def main(args: Array[String]): Unit = {

        // TODO Scala - 集合 - 常用方法
        val list = List(1,2,3,4)
        val list1 = List(3,4,5,6)
        val list2 = List("a","b", "c", "d", "e")

        // TODO 获取集合的一部分数据
        // 对于我们的集合来讲，除了头就是尾
        // 递归其实是函数式编程中用的最多的算法
        println("(头) => " + list.head)
        println("(尾) => " + list.tail)
        println("(尾)(迭代) => " + list.tails)
        println("(最后一个) => " + list.last)
        println("(初始) => " + list.init)
        println("(初始)(迭代) => " + list.inits)

        // TODO 集合之间的关联

        // 交集
        println("交集 => " + list.intersect(list1))
        // 并集
        println("并集 => " + list.union(list1))
        // 差集
        println("差集 => " + list1.diff(list))

        println("切分集合 => " + list2.splitAt(3))

        // 将集合的一部分数据当成一个整体来使用
        val list4 = List(1,2,3,4,5,6,7,8)
        // 将一个集合的一部分作为整体，其实可以称之为窗口
        // 默认情况下，窗口数据的滑动的幅度为1，可以改变
        //println("滑动 => " + list4.sliding(3))
        val iterator: Iterator[List[Int]] = list4.sliding(3,2)
        while (iterator.hasNext) {
            val ints: List[Int] = iterator.next()
            println(ints)
        }

        // 拉链
        // 将两个集合相同位置的数据关联在一起
        // 如果两个集合的数量不一致，多余的数据无法关联，省略掉
        val list5 = List(1,2,3,4,9)
        val list6 = List(5,6,7,8)

        val tuples: List[(Int, Int)] = list5.zip(list6)
        println(tuples)

        println(list5.zipWithIndex)

    }
}
