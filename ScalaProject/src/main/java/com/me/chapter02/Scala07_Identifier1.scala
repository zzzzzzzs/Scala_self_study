package com.me.chapter02


object Scala07_Identifier1 {

    def main(args: Array[String]): Unit = {

        // Scala 标识符
        // Scala是函数式编程语言。
        // Scala中可以提供大量函数，这些函数的名称可以采用特殊符号声明的。
        // Scala中可以使用特殊符号声明标识符。

        // Scala中标识符的声明规则不要记，直接写，错了再改就行。
        val + = "zhangsan"
        val - = "zhangsan"
        val * = "zhangsan"
        val / = "zhangsan"

        val ~ = "zhangsan" //ok
        //val ` = "zhangsan" // error
        val ! = "zhangsan"//ok
        //val @ = "zhangsan"// error
        val @@ = "zhangsan"// ok
        //val # = "zhangsan"// error
        val ## = "zhangsan"// ok
        val % = "zhangsan"//ok
        val ^ = "zhangsan" //ok
        val & = "zhangsan" //ok
        //val ( = "zhangsan"// error
        //val ) = "zhangsan"// error
        //val { = "zhangsan"// error
        //val } = "zhangsan"// error
       // val [ = "zhangsan"// error
        //val ] = "zhangsan"// error
        val | = "zhangsan"// ok
        //val = = "zhangsan"// error



    }
}
