package com.atguigu.bigdata.scala.chapter10

object Scala05_Transform4 {

    def main(args: Array[String]): Unit = {

        // TODO 隐式转换 - 方式
        def regUser( implicit password : String = "000000" ): Unit = {
            println("注册用户，默认密码：" + password)
        }

        regUser( "zhangsan" )
        regUser()
        //regUser // 函数的参数列表如果没有参数，或没有声明参数列表，那么可以在调用时省略小括号

        // 如果函数的参数预计是有可能需要修改的。不确定，可以使用隐式参数来声明
        // TODO 隐式参数：在函数的参数前增加关键字 implicit
        //      可以在编译的时候，可以将隐式变量自动传递到参数中
        // TODO 隐式变量：在变量前增加关键字 implicit
        // 如果使用隐式参数，那么就好像没有声明参数列表一样，那么这个参数列表就可以省略
        // 如果调用函数时，使用了小括号，那么意味着不使用隐式参数，而是使用参数列表中参数值
        implicit val pswd = "123123"
        regUser()
        regUser

//        val list = List(1,2,3,4)
//        list.sortBy(num=>num)(Ordering.Int.reverse)
//        list.sortBy(num=>num)


    }

}
