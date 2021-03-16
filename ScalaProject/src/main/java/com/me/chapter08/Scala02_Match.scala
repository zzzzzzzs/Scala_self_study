package com.me.chapter08



object Scala02_Match {

    def main(args: Array[String]): Unit = {

        // TODO Scala中模式匹配语法类似于Java的switch语法
        //  Scala中采用match进行匹配
        //  1. 使用 => 代替冒号
        //  2. 满足条件处理中不需要使用break,自动跳出
        //  3. 如果没有一个case条件成立，应该设置默认值(下划线)
        //     这里的下划线表示任意值
        //  4. 匹配顺序为从上到下
        //  5. 如果match进行匹配时，没有一个能够匹配上，那么会发生错误
        //     所以推荐使用下划线进行默认处理,但是最好放置在最后一行中
        val i : Int = 5

        i match {
            case 5 => {
                println("i = 5")
            }
            case 10 => {
                println("i = 10")
            }
            case _ => println("i为任意值")
        }

        println("main..")

    }
}
