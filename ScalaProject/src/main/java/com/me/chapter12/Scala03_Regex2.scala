package com.me.chapter12



import scala.util.matching.Regex

object Scala03_Regex2 {

    def main(args: Array[String]): Unit = {

        // TODO Scala - 正则表达式
        //println(isMobileNumber("18801234567"))
        //println(isMobileNumber("11111111111"))

        val r = """([_A-Za-z0-9-]+(?:\.[_A-Za-z0-9-\+]+)*)(@[A-Za-z0-9-]+(?:\.[A-Za-z0-9-]+)*(?:\.[A-Za-z]{2,})) ?""".r
        println(r.replaceAllIn("abc.edfjianli@gmail.com   hello@gmail.com.cn", (m => "*****" + m.group(2))))

    }
    def isMobileNumber(number: String): Boolean ={
        val regex = "^((13[0-9])|(14[5,7,9])|(15[^4])|(18[0-9])|(17[0,1,3,5,6,7,8]))[0-9]{8}$".r
        val length = number.length
        regex.findFirstMatchIn(number.slice(length-11,length)) != None
    }
}
