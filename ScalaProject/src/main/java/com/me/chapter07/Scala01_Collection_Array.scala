package com.atguigu.bigdata.scala.chapter07

object Scala01_Collection_Array {

    def main(args: Array[String]): Unit = {

        // TODO Scala 集合

        // 数组 + 集合
        // Scala中数组也是集合，会有自己的类型
        // TODO 1. 数组定义(创建数组)
        //         scala的数组在编译时不会编译器自动转换为java的数组，并且进行优化
        // java : String[] ss = new String[2]
        val array = new Array[String](3)

        // TODO 2. 数据操作
        // scala中中括号有特殊用途，表示泛型，所以无法使用中括号访问数组的数据
        // scala采用小括号的方式来访问
        // java : ss[0] = "zhangsan"
        array(0) = "zhangsan"
        array(1) = "lisi"
        array(2) = "wangwu"

        // TODO 3. 数据遍历
        // java : for(i=0;i <size;i++), for(String s : ss)
        for ( name <- array ) {
            println(name)
        }
    }
}
