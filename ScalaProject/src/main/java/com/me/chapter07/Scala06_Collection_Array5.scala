package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable.ArrayBuffer

object Scala06_Collection_Array5 {

    def main(args: Array[String]): Unit = {

        // TODO Scala - 集合 - 可变数组
        // Scala默认提供的集合都是不可变的。
        // 可变数组
        // TODO 1. 创建数组
        // java : StringBuffer
        // java 默认无参构造方法
        // scala中默认无参的构造方法是主构造方法（X）
        // 默认初始化的容量为16

        // Scala学习集合的时候，一般不关系集合的内部处理结构
        // Scala学习集合的时候，主要掌握集合的特性以及集合方法的使用，传参，返回
        val array = new ArrayBuffer[String]()

        // TODO 2. 数据操作
        // 添加数据
        array.append("a")
        array.insert(0, "b", "c")

        // 修改数据
        //array.update(2, "d")
        //array(2) = "d"
        // 如果超出索引的范围，会发生错误
        //array.update(3, "d")

        // 删除数据
        //array.remove(1)
        //array.remove(1,2)
        // 删除数据的时候，数量不能超出限制,如果超出，那么会发生错误
        array.remove(1,3)

        // TODO 3. 数据遍历和访问
        // 如果是Array数组，打印时会产生hashCode的字符串，如果是ArrayBuffer，
        // 那么会将集合的数据直接打印出来
        println(array)

    }
}
