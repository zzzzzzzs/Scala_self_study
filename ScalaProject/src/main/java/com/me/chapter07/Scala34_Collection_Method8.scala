package com.me.chapter07


object Scala34_Collection_Method8 {

    def main(args: Array[String]): Unit = {

        // TODO Scala - 集合 - 计算函数
        val list = List(1,2,3,4,5)

        // TODO reduce 方法要求计算时参数类型和结果类型保持一致
        //      reduce方法的底层其实就是reduceLeft
        // (A1, A1) => A1
        //list.reduce()
        // TODO reduceLeft方法要求第一个参数和结果的参数类型保持一致，第二个参数就是当前集合数据的类型
        //      第一个参数类型和第二个参数类型之间有关系。
        // [B >: Int]
        // (B, Int) => B
        // TODO 当处理的数据类型一致时，那么reduce可以代替reduceLeft

        // 1, 2, 3, 4, 5
        //  -1  3
        //    -4   4
        //      -8  5
        //       -13

        //val result1 = list.reduceLeft(_-_)
        //println(result1) // -13
        // (Int, B) => B
        // TODO reduceLeft是将集合中的数据从左边两两计算
        // TODO reduceRight是将集合中的数据从右边两两计算

        // 1, 2, 3, 4, 5
        // reversed.reduceLeft[B]((x, y) => op(y, x))
        // TODO reduceRight实现原理
        //   1. 集合数据反转
        //        5, 4, 3, 2, 1
        //   2. 调用reduceLeft
        //          5, 4
        //   3. 两两计算时，会交换参数的顺序
        //           5, 4 => 4, 5 => -1
        //          -1, 3 => 3, -1 => 4
        //           4, 2 => 2, 4 => -2
        //          -2, 1 => 1, -2 => 3
         val result2: Int = list.reduceRight(_-_)
        println(result2) // 3

        // TODO 如何分析reduceLeft, reduceRight的计算结果?
        //      采用加括号的方式即可
        //  reduceLeft ： 从左边两两加括号
        //  ((((1，2)，3)，4)，5) => _-_ => -13
        //  reduceRight ： 从右边两两加括号
        //  (1，(2，(3，(4，5)))) => _-_ => 3

        //val s = new String("abc")
        //s.intern()

    }
}
