package com.atguigu.bigdata.scala.chapter07

import scala.math.Ordering

object Scala29_Collection_Method6 {

    def main(args: Array[String]): Unit = {

        // TODO Scala - 集合 - 功能函数
        // TODO 1. map
        //        表示将集合中的每一个元素转换成新的数据返回到新的集合中
        //        map方法返回的其实还是一个集合，只不过其中的元素都是转换后
        //        map方法强调的是元素的变化，而不是集合的变化
//        val list : List[Int] = List(1,2,3,4)
//        val strings: List[String] = list.map(_.toString)
//        list.toSet
//        println(list eq strings)
//
//        val set : Set[Int] = Set(1,2,3,4)
//        val strings1: Set[String] = set.map(_.toString)
//        set.toList

        // TODO 2. flatMap 扁平化
        // flatten只能对外层集合进行扁平化操作
//        val list = List(
//            List(
//                List(1,2), List(3,4)
//            ), List(
//                List(5,6), List(7,8)
//            )
//        )

        // List(1,2), List(3,4),List(5,6), List(7,8)
        // 1,2,3,4,5,6,7,8
        //println(list.flatten.flatten)
        //val list1 = List("Hello Scala")
        // TODO flatMap 函数需要传递一个参数，这个参数是一个函数
        //      这个函数的输入是集合中的每一个元素（1）
        //      这个函数的输出是可迭代的集合对象（N）
        //list1.flatMap()
//        val list2 = List(
//            List(1,2),List(3,4)
//        )
//        println(list2.flatMap(list => list))

        // TODO 下面的集合从原理上来讲，不能进行扁平化操作
        // 扁平化： 将整体拆分成个体
        //          集合 => Element
        //          Tuple => Element
        //          Object => Field
        // TODO 从代码API的角度，可以进行扁平化
//        val list3 = List(1,2,3)
//        println(list3.flatMap(
//            num => List(num)
//        ))

        // TODO 3. filter 过滤
        // contains方法用于判断集合中是否包含数据，但是要求类型相同
        // 数据清洗
        val list = List(1,2,3,4)
//        val list1 = List("2", "3")
//        println(list.filter(
//            num => {
//                list1.contains(num.toString)
//            }
//        ))

        // TODO 4. groupBy
        // groupBy返回结果是一个map集合，map中的key其实就是分组的key
        println(list.groupBy(num => num))

        // TODO 5. sortBy
        // 默认的排序规则是升序.
        list.sortBy(num=>num.toString)(Ordering.String.reverse)
        // User(age, salay)
        list.sortWith(
            (left, right) => {
                left > right
            }
        )

        val user1 = new User()
        user1.age = 20
        user1.salary = 20
        val user2 = new User()
        user2.age = 20
        user2.salary = 10
        val user3 = new User()
        user3.age = 40
        user3.salary = 30

        val list1 = List(user1, user2,user3)
        // TODO Scala中Tuple默认就是可以比较的。
        //      先比较第一个数据大小，相同时，比较第二个
        println(list1.sortBy(
            user => (user.age, user.salary)
        )(Ordering.Tuple2( Ordering.Int.reverse, Ordering.Int  )))


    }
    class User {
        var age : Int = _
        var salary : Int = _

        override def toString: String = {
            s"User[${age}, ${salary}]"
        }
    }
}
