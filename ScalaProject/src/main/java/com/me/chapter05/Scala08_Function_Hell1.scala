package com.me.chapter05


object Scala08_Function_Hell1 {

    def main(args: Array[String]): Unit = {

        // TODO Scala 函数式编程 - 地狱难度

        // TODO 函数是Scala中最重要的内容, 可以将函数看作对象来使用
        // TODO 1. 可以将这个对象赋值给其他变量来使用
        //         变量就可以当作函数来使用
        def test(): Unit = {
            println("test...")
        }

        def test1( i : Int ): String = {
            i.toString
        }
        def test2( i : Int, j: Int ): String = {
            i.toString
        }
        def test3( i : Int, j: String ): Int = {
            i
        }

        // 将函数赋值给变量，那么这个变量就是一个函数。就可以被调用
        // 如果函数的参数列表的个数只有一个或没有，那么调用时可以省略小括号
        // TODO 在下面的代码中，编译器会认为需要执行test函数，然后将函数的返回结果赋值给变量t
        //      由于test函数的返回值为Unit，所以变量t赋值为Unit，不是方法，所以不能调用
        //val t = test
        //val t = test()

        // TODO 如果想要将函数作为一个整体的对象赋值给变量，需要使用下划线的方式
        //      当使用下划线时，编译器不会执行函数本身，而是将函数作为整体赋值给变量
        //      变量就会变成函数类型，那么就可以被调用
        //      这里的函数类型为 ：() => Unit
       // val f = test _
        //val f1 = test1 _  // (Int) => String
       // val f2 = test2 _  // (Int, Int) => String
        //val f3 = test3 _  // (Int, String) => Int

        // 函数调用
        //f()
        //println(f3(10, "zhangsan"))

        // TODO 如果不使用下划线，也希望将函数作为整体赋值给变量
        //      之前不加下划线之所以会执行函数，因为需要执行函数后才能推断出变量的类型，所以需要执行
        //      如果不想要执行函数，那么就必须明确变量的类型，不能省略，也不能使用自动推断。
        //      如果变量明确使用类型声明，那么赋值的函数需要匹配类型。
        //val f = test _

        val f11 : (Int) => String = test1
        val f22 : (Int, Int) => String = test2
        val f33 : (Int, String) => Int = test3
        println(f11(20))
        println(f22(20, 40))
        println(f33(20, "lisi"))





    }
}
