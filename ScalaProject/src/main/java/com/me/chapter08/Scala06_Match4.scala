package com.me.chapter08



object Scala06_Match4 {

    def main(args: Array[String]): Unit = {

        // TODO 模式匹配的关键字在使用时，根据场景的不同是可以省略的。
        // TODO 匹配元组
        val (id, name, age) = (1, "zhangsan", 30)

//        println(id)
//        println(name)
//        println(age)

        val map = Map(
            ("a", 1), ("b", 2), ("c", 3)
        )


        for ( (k, v) <- map ) {
            println(k + "=" + v)
        }
    }
}
