package com.atguigu.bigdata.scala.chapter08

object Scala04_Match2 {

    def main(args: Array[String]): Unit = {

        // TODO 模式匹配的匹配是有规则的
        // TODO 1. 匹配常量
        def describe(x: Any) : String = {
            val result = x match {
                case 5 => "Int five"
                case "hello" => "String hello"
                case true => "Boolean true"
                case '+' => "Char +"
            }
            result
        }

//        println(describe(5))
//        println(describe("hello"))
//        println(describe(true))
//        println(describe('+'))
//        println(describe(1))

        // TODO 2. 匹配类型
        // 当数据类型不确定时，可以通过类型匹配进行操作
        // 如果类型匹配成功，那么类型前面的变量用于相应类型的操作
        // 如果所有类型都不匹配，那么会执行最后的那个下划线的case
        // 如果使用下划线，那么无法使用变量，所以可以使用变量名来代替下划线
        // x : Any => i: Int => i + 10
        // x.isInstanceOf[Int] => x.asInstanceOf[Int]
        // TODO 匹配类型的场合下，不考虑泛型的。
        // TODO Array[Int]这里的Int不是泛型
        // Scala Array[Int] => Java int[]
        // Scala List[Int]  => Java List<Integer>
        // 泛型 => Java
        def describe1(x: Any) : String = {
            x match {
                case i: Int => "Int"
                case s: String => "String hello"
                case m: List[_] => "List"
                case c: Array[Int] => "Array[Int]"
                case someThing => "something else " + someThing
            }
        }

//        println(describe1(1))
//        println(describe1("hello"))
//        println(describe1(new User()))
        println(describe1(Array(1,2,3,4)))
        println(describe1(Array("1","2","3","4")))
        //println(describe1(List("1","2","3","4")))
        //println(describe1(List(1,2,3,4)))


    }
    class User {

    }
}
