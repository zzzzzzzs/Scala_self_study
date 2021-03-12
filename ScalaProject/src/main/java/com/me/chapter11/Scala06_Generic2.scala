package com.atguigu.bigdata.scala.chapter11
import com.atguigu.bigdata.scala.chapter11.bean._

object Scala06_Generic2 {

    def main(args: Array[String]): Unit = {

        // TODO Scala 中的泛型的应用
        //val list = List(1,2,3,4)
        val userList : List[User] = List(
            new User(),new User(), new User()
        )
//        val parent: Parent = userList.reduce[Parent](
//            (x, y) => x
//        )
//        val child: Child = userList.reduce[Child](
//            (x, y) => x
//        )

//        println(child)


    }
}
