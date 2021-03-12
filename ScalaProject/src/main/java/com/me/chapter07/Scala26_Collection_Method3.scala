package com.atguigu.bigdata.scala.chapter07

object Scala26_Collection_Method3 {

    def main(args: Array[String]): Unit = {

        // TODO Scala - 集合 - 常用方法
        val list = List(1,2,3,4)

        // TODO 集合数据的功能操作
//        val newList = for ( i <- list ) yield {
//            i * 2
//        }
//        println(newList)
        // 将集合中的每一个数据进行转换后得到新的集合
        // map => 映射 => A -> B
        def transform(i:Int): Int = {
            i * 2
        }
        //val newList: List[Int] = list.map(transform)
        //val newList: List[Int] = list.map((i:Int)=>{i*2})
        //val newList: List[Int] = list.map((i:Int)=>i*2)
        //val newList: List[Int] = list.map((i)=>i*2)
        //val newList: List[Int] = list.map(i=>i*2)
        //val newList: List[Int] = list.map(_*2)
        val newList: List[String] = list.map(_.toString)
        println(newList)


    }
}
