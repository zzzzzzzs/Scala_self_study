package com.me.chapter07


object Scala22_Collection_Tuple1 {

    def main(args: Array[String]): Unit = {

        // Scala 集合
        // 如果元组中的元素只有2个，那么称之为对偶元组，也称之为键值对对象

        // 元组其实有类型，Tuple2， 这里的2表示元组中元素的数量
        val t : Tuple2[String, Int] = ( "a", 1 )
        val t1 : (String, Int) = ( "a", 1 )
        val map = Map( ("a", 1), ("b", 2), ("c",3) )
        //println(map)

        // -> 其实是一个方法，会返回Tuple2, 形成键值对对象
        //"a" -> 1

        for ( kv <- map ) {
            println(kv._1 + " = " + kv._2)
        }

    }
}
