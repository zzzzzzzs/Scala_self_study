package com.me.chapter07


object Scala05_Collection_Array4 {

    def main(args: Array[String]): Unit = {

        // TODO Scala 集合 - 数组
        //[1,2,3]
        //[4,5,6]
        //[7,8,9]
        // 多维数组
//        var myMatrix = Array.ofDim[Int](3,3)
//        //myMatrix.foreach(list=>list.foreach(println))
//        myMatrix.foreach(array=>{
//            println(array.mkString(","))
//        })

        // 合并数组
//        val array1 = Array(1,2,3,4)
//        val array2 = Array(5,6,7,8)
//
//        val array3: Array[Int] = Array.concat(array2, array1)
//
//        println(array3.mkString(", "))

        // 创建指定范围的数据数组（从0到2（不包含））
//        val array1: Array[Int] = Array.range(0,2)
//        array1.foreach(println)

        // 填充
        val arr8:Array[Int] = Array.fill[Int](5)(-1)
        arr8.foreach(println)


    }
}
