package com.me.chapter05


object Scala20_Function_Recursion {

    def main(args: Array[String]): Unit = {

        // TODO Scala 函数 - 递归
        //   1. 函数调用自身
        //   2. 函数存在退出递归的逻辑
        //   3. 函数在调用过程中，传递的数据应该有规律
        //      5!
        //   4. 递归函数的返回值类性一定要显示地声明

        // 阶乘 : 一个大于1的数的阶乘等于这个数乘以这个数减一的阶乘
        // 编译器如果能推断出来，那么可以省略相应的部分。
        // 如果推断不出来，那么就绝对不能省略
        def factorial( num:Int ):Int = {
            if ( num <= 1  ) {
                1
            } else {
                num * factorial(num-1)
            }
        }

        println(factorial(5))


    }
}
