package com.atguigu.bigdata.scala.chapter06

object Scala39_Object_Interface7 {

    def main(args: Array[String]): Unit = {

        // 特质混入时，初始化的顺序先父类，然后在当前类的多个特质从左到右依次初始化
        // 当执行特质的功能方法时，如果多个特质具有相同的方法，那么执行顺序为从右到左

        // 什么情况下考虑使用特质？
        //  使用特质主要考虑功能扩展

        // 如果想要改变特质默认的功能执行顺序，那么需要在super关键字后增加中括号，指明执行的顺序

        // 特质在实现功能叠加时，super并不是上一级的概念，而在编译时，会形成方法名称，实现功能调用

        // java中的super关键字在使用时其实也是一种引用，编译时，会自动转换为应用的对象
        val mysql = new MySQL()
        mysql.operData()

    }
    trait Operate {
        def operData(): Unit = {
            println("操作数据")
        }
    }
    trait DB extends Operate {
        override def operData(): Unit = {
            print("向数据库中")
            //super[Operate].operData()
            super.operData()
        }
    }

    trait Log extends Operate {
        override def operData(): Unit = {
            print("向日志文件中")
            // 特质中的super表示的含义不是父类的引用，表示上一个
            super.operData()
        }
    }

    class MySQL extends Log with DB {
        // 向日志文件中向数据库中操作数据
        // 向数据库中向日志文件中操作数据
        // 向数据库中操作数据
    }
}




