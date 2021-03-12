package com.atguigu.bigdata.scala.chapter06

object Scala06_Object_Import1 {
    def main(args: Array[String]): Unit = {
        // TODO Scala 面向对象编程 - 导入对象
        val user = new User()
        // 简化开发, 但是使用时需要考虑冲突的问题
        // 导入对象的功能，这个对象的变量必须使用val声明
        import user._
        test1()

    }

    class User {
        def test1(): Unit = {
            println("test...")
        }
    }
}


