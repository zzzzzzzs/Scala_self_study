package com.atguigu.bigdata.scala.chapter07

object Scala02_Collection_Array1 {

    def main(args: Array[String]): Unit = {

        // TODO Scala 集合

        // 数组 + 集合
        // Scala中数组也是集合，会有自己的类型
        // TODO 1. 数组定义(创建数组)
        //         scala的数组在编译时不会编译器自动转换为java的数组，并且进行优化
        // 创建数组的方式 ：new
        //val array = new Array[String](3)
        // 创建数组的方式 : apply
        // 采用伴生对象的apply方法创建Array对象
        //val array = Array.apply()
        val array : Array[Int] = Array(1,2,3,4)

        // TODO 2. 数据操作
//        array(0) = "zhangsan"
//        array(1) = "lisi"
//        array(2) = "wangwu"
        // 修改数据
        // 集合中的update方法等同于 ： 集合(索引) = 值
        array(0) = 5
        array.update(1, 6)

        // TODO 3. 数据遍历
//        for ( name <- array ) {
//            println(name)
//        }
        // 将集合数据通过特定格式转为字符串展示
        println(array.mkString(", "))
    }
}
