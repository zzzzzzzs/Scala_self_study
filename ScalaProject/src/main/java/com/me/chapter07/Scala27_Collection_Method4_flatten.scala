package com.me.chapter07

object Scala27_Collection_Method4_flatten {

    def main(args: Array[String]): Unit = {
        // flatten 脱去2个集合（该集合内部必须还有同样类型的集合，如List(List(...)), 取出内部的元素，如果还有集合就不取出内部的元素了），返回的元素会加上一个List集合
        List(
            List(List(1, 2, 3)),
            List(1,2),
            List(3,4, List(5, 6)),
            List("Hello", "World"),
        ).flatten.foreach(println)
    }
}
