package com.atguigu.bigdata.scala.chapter05

object Scala06_Function_NightMare1 {

    def main(args: Array[String]): Unit = {

        // TODO Scala 函数式编程 - 噩梦难度
        // Scala中函数有至简原则 ： 能省则省
        // 这里的能省则省，必须是编译器可以自动推断的场合，才能省
        def fun1(): Unit = {
            return "zhangsan"
        }

        // TODO 如果函数明确声明返回值类型为Unit，那么即使函数体中有return关键字也不起作用
        //println(fun1())

        // TODO 如果函数体中存在return语句，那么返回值类型不能省略
        def fun2() : Unit = {
            return "zhangsan"
        }

        // TODO 如果函数返回值类型为Unit，并且想要省略Unit关键字，可以采用特殊的方式
        //      可以将等号省略掉，表示这个函数肯定没有返回值
        //      一般将这样的函数称之为过程函数
        def fun3()  = {
            "zhangsan"
        }

        def fun33() {
            return "lisi"
        }

        println(fun33())

        // TODO 如果调用函数的时候，不关心函数名称，只关心函数的执行逻辑的场合，那么def,函数名可以省略
        //      将这样的函数称之为匿名函数
//        def fun4()  = {
//            println("zhangsan")
//        }
        // TODO 如果不使用def来声明函数，那么就需要采用特殊的颜文字来声明
        //      匿名函数由于没有名字，无法直接调用，需要将匿名函数赋值给变量来调用
        val test = () => {
            println("function zhangsan...")
        }

        // TODO 将匿名函数赋值给变量，那么这个变量的类型就是函数，所以可以调用。
        //val name : String = "zhangsan"
        test()




    }
}
