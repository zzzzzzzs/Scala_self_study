package com.atguigu.bigdata.scala.chapter12

import scala.util.matching.Regex

object Scala02_Regex1 {

    def main(args: Array[String]): Unit = {

        // TODO Scala - 正则表达式
        // 判断字符串是不是一个电话号码(手机号码)
        // 1. 全部都应该是数字
        // 2. 长度应该为11位

        // TODO 1. 声明规则
        val r: Regex = "^\\d{11}$".r // \\d表示数字，表示一个数字
                                     //  {11} 表示之前的内容重复11次

        // TODO 2. 准备数据
        val s = "22342341234"

        // TODO 3. 匹配数据
        val maybeString: Option[String] = r.findFirstIn(s)
        if ( maybeString.isEmpty ) {
            println("没有符合规则的内容")
        } else {
            println(maybeString.get)
        }

    }
}
