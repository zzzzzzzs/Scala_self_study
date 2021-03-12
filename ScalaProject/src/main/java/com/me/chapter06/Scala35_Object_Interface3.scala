package com.atguigu.bigdata.scala.chapter06

object Scala35_Object_Interface3 {

    def main(args: Array[String]): Unit = {

        // TODO Scala 面向对象 - 特质
        val operate: Operate = new MySQL()
        operate.oper()

        // trait中可以声明完整的方法，
        // 混入特质的类可以重写或调用这个方法。
        // 和java中的抽象类很像。

        // 可以将特质简单的理解为java中抽象类和接口的融合体
        // 特质中可以有完整的方法，也可以有抽象的方法
        // 特质中如果当成抽象类来看，那么可以继承父类

    }
    // 声明特质
    trait Operate extends Exception {
        // 抽取的特征不一定是抽象的，也可能是完整的
        def oper():Unit = {
            println("操作数据")
        }
    }

    // 一个类混入特质
    // 将特质中的抽象方法补全
    class MySQL extends Operate {
        // 重写方法
        //  1. 抽象方法 ：补充完整
        //  2. 完整方法 ：需要增加override关键字
        override def oper(): Unit = {
            print("向MySQL的表格中")
            super.oper()
        }
    }
}



