package com.me.chapter05


object Scala04_Function_Normal1 {

    def main(args: Array[String]): Unit = {

        // TODO Scala 函数式编程 - 普通难度

        // TODO 函数参数是不是可以无限多？
        //      函数的参数不能超过22个,如果超过22个，可以声明和使用，但是不能给别人用。
        def fun1(
                        name1 : Int,
                        name2 : Int,
                        name3 : Int,
                        name4 : Int,
                        name5 : Int,
                        name6 : Int,
                        name7 : Int,
                        name8 : Int,
                        name9 : Int,
                        name10 : Int,
                        name11 : Int,
                        name12 : Int,
                        name13 : Int,
                        name14 : Int,
                        name15 : Int,
                        name16 : Int,
                        name17 : Int,
                        name18 : Int,
                        name19 : Int,
                        name20 : Int,
                        name21 : Int,
                        //name22 : Int,
                        name23 : Int
                ): Unit = {
            println("test...")
        }

        //fun1(1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2)

        //val a = fun1 _

        // TODO 如果想要传递很多的参数，那么可以将参数的类型设定为集合类型或变为可变类型
        //      可变参数， java中使用..., 参数可能有，可能没有。
        //                 scala中使用星号*
        //      如果使用可变参数时，不传递这个参数，那么获取到的是空集合List()
        //      如果使用可变参数时，传递这个参数，那么获取到的是包装数组，数组中就是每一个参数

        def fun2( name : String* ): Unit = {
            println(name)
        }

//        fun2()
//        fun2("zhangsan")
//        fun2("zhangsan", "lisi", "wangwu")

        // TODO 可变参数应该放置在参数列表的最后
        //      参数列表中不应该有多个可变参数，就一个，而且放置在参数列表的最后
        def fun3( age : Int, name : String*): Unit = {
            println(name)
        }
        //fun3(20, "zhangsan", "lisi", "wangwu")

        // TODO 改变参数
        //      Scala中函数的参数不能改，使用val声明
        // 如果想要给函数的参数提供默认值，scala可以在参数的后面直接增加默认值
        def regUser( account : String, password : String = "123123" ): Unit = {
//            if ( password == null ) {
//               // password = "123123"
//            }
            println(s"account : $account, password : $password")
        }

        // 如果参数中有默认值，那么在调用时，可以不传递这个参数，那么会使用默认值
        regUser("zhangsan")
        // 如果参数中有默认值，那么在调用时，传递这个参数，那么会覆盖默认值
        regUser("zhangsan", "000000")

        def regUser1( account : String, password : String = "123123", tel : String ): Unit = {
            //            if ( password == null ) {
            //               // password = "123123"
            //            }
            println(s"account : $account, password : $password, tel : $tel")
        }

        // 函数的参数在调用时的匹配规则为从左到右依次匹配。
        // Scala提供了一种语法来解决参数默认值调用的问题
        // TODO 带名参数传递
        //      可以改变参数传递的顺序
        regUser1(tel = "13312341234", account = "wangwu")


    }
}
