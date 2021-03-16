package com.me.chapter12


import scala.util.matching.Regex

object Scala01_Regex {

    def main(args: Array[String]): Unit = {

        // TODO Scala - 正则表达式
        // 类似于模式匹配
        // 模式匹配是对数据的规则进行匹配
        // 正则表达式对字符串的内容进行规则匹配
        // 正则表达式有自己的匹配规则
        // TODO 1. 声明规则
        //val r: Regex = "s".r
        //val r: Regex = "^s".r // 判断字符串是否以s开头
        val r: Regex = "s$".r // 判断字符串是否以s开头

        // TODO 2. 准备数据
        val s = "sascablas"

        // TODO 3. 使用规则
        val maybeString: Option[String] = r.findFirstIn(s)
        //val iterator: Regex.MatchIterator = r.findAllIn(s)
        if ( maybeString.isEmpty ) {
            println("没有符合规则的内容")
        } else {
            println(maybeString.get)
        }


    }
}
