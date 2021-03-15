package com.me.chapter02


object Scala06_Identifier {

    def main(args: Array[String]): Unit = {

        // Scala 标识符
        // Scala中标识符基本上和java是保持一致的。
        val name = "zhangsan" // ok
        val name1 = "zhangsan" // ok
        //val 1name = "zhangsan" // error
        val name$ = "zhangsan" // ok
        val $name = "zhangsan" // ok
        // 虽然在java和scala中$可以作为标识符使用，但是一般不用。
        // 因为scala语法中对$有特殊的操作，避免冲突。
        val $ = "zhangsan" // ok
        val name_ = "zhangsan" // ok
        val _name = "zhangsan" // ok
        // 下划线可以作为标识符，但是一定不要独立使用，因为独立的下划线功能
        // 在scala中会有很多的用途，容易混乱
        val _ = "zhangsan" // ok
        //println(_)

        // scala中的关键字不能作为标识符使用
        //val object = "zhangsan" // error

    }
}
