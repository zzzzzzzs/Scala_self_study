package com.me.chapter07

object Scala27_Collection_Method4_map {

    def main(args: Array[String]): Unit = {
        // map 就去掉一个最外层集合，返回元素的时候加上一个List集合
        List(
            1, 2, 3,
              List(1, 2, 3),
            List(5, 6),
            (1, 2, "Hello"),
            "Hello",
            "World"
        ).map(e => e).foreach(println)
    }
}
