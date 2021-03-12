package com.atguigu.bigdata.scala.chapter08

import scala.util.control.Breaks

object Scala09_Match7 {

    def main(args: Array[String]): Unit = {

        // TODO Scala - 模式匹配
        val Array(first, second, _*) = Array(1, 7, 2, 9)
        //println(s"first=$first,second=$second")

        val Person(name, age) = Person("zhangsan", 16)
        //println(s"name=$name,age=$age")

        val map = Map("A" -> 1, "B" -> 0, "C" -> 3)
        for ((k, v) <- map) { //直接将map中的k-v遍历出来
            //println(k + " -> " + v) //3个
        }
        for ((k, _) <- map) { //直接将map中的k-v遍历出来
            //println(k) //3个
        }
        for ((k, 0) <- map) { //直接将map中的k-v遍历出来
            //println(k) //3个
        }

        val list = List(
            ("a", 1), ("b", 2), ("c", 3)
        )

//        println(list.map(
//            kv => {
//                (kv._1, kv._2 * 2)
//            }
//        ))
        // 如果匿名函数的参数进行模式匹配，那么不能省略case关键字
        // 如果使用模式匹配时，那么就应该将小括号改成大括号
        val newList = list.map{
            case (word, count) => {
                (word, count * 2)
            }
        }
        println(newList)
    }
    case class Person(name: String, age: Int)
}
