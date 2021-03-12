package com.atguigu.bigdata.scala.chapter08

object Scala12_Match10 {

    def main(args: Array[String]): Unit = {

        // Scala - 模式匹配 - 偏函数
        // map函数是全量函数，对集合中所有的数据都会进行操作，不能进行过滤。
        // 偏函数在当前就可以使用

        // TODO  将该List(1,2,3,4,5,6,"test")中的Int类型的元素加一，并去掉字符串
        //  1. 集合中的Int数据加1
        //  2. 将字符串过滤掉
        val list: List[Any] = List(1,2,3,4,5,6,"test")
//        val newlist = list.map(
//            data => {
//                data match {
//                    case i:Int => i+1
//                    case d => d
//                }
//            }
//        )
//        //val newlist1 = newlist.filter(data=>{!data.isInstanceOf[String]})
//        println(newlist)

        // 采用偏函数的方式来实现需求
        // collect 采集方法可以传递一个偏函数实现功能
        // 使用case操作函数就是偏函数
        // 不是所有的函数都支持偏函数，如果函数的类型为PartialFunction，那么就是偏函数
        // 可以使用case语法操作
        val newlist = list.collect{
            case i:Int => i + 1
        }
        println(newlist)
    }
}
