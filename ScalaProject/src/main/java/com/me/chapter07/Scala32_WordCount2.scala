package com.atguigu.bigdata.scala.chapter07

import scala.math.Ordering

object Scala32_WordCount2 {

    def main(args: Array[String]): Unit = {

//        val list : List[String] = List(
//            "Hello Scala Spark Flink",
//            "Hello Scala Spark",
//            "Hello Scala",
//            "Hello"
//        )

        // TODO 下划线使用的问题
        //   1. 在匿名函数中，下划线主要用于简化函数参数的使用
        //      “能”省则省
        //   2. 在匿名函数中，如果函数的参数只“使用”了一次。可以使用下划线来代替参数
        //   3. 下划线可以将函数作为整体来使用， 所以在使用过程中，如果函数传递的参数不做处理，直接返回
        //      那么这种情况下，是不能使用下划线代替
        //   4. 下划线代替参数，是要严格按照参数的顺序使用
        //      (x, y) => y + x => _+_ (X)
        //   5. 下划线的逻辑操作不要放置在内部函数的传参上
        //   6. 下划线的简化操作主要用于简单逻辑，如果复杂逻辑不要简化

        val list1 = List(1,2,3,4)

        //list1.foreach((num:Int)=>{println(num)})
        //list1.foreach((num:Int)=>println(num))
        //list1.foreach((num)=>println(num))
        //list1.foreach(num=>println(num))
        //list1.foreach(println(_))
        // ******************************************
        def test( num:Int ): Unit = {
            println(num)
        }

        list1.foreach(test _)
        list1.foreach(test)


//        list
//            //TODO
//            // .flatMap( word => { word.split(" ") } )
//            .flatMap(_.split(" "))
//            // TODO
//            //   .groupBy(_) (X)
//            .groupBy(word=>word)
//            .map(
//                kv => {
//                    (kv._1, kv._2.size)
//                }
//            )
//            .toList
//            .sortBy(_._2)(Ordering.Int.reverse)
//            .take(3)
//            .foreach(println)

    }
}
