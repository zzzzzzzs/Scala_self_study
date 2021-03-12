
import java.io.ObjectOutputStream
import java.net.Socket

import com.me.chapter02.bean.User



object Scala15_DataType {

    def main(args: Array[String]): Unit = {

        // Scala 数据类型
        // java : 基本类型 & 引用类型
        //        基本类型 不是面向对象的。
        // scala : 基于java语言开发的，是一个完全面对对象的语言，所以不存在基本数据类型
        //        针对于java的基本类型，scala提供了对应的数据类型

        // 值类型
        val b : Byte = 10 // byte
        val c : Char = 'a' // char
        val s : Short = 10 // short
        val i : Int = 10 // int
        val lon : Long = 10 // long
        val f : Float = 10.0f // float
        val d : Double = 10.0 // double
        val flg : Boolean = true // boolean

        // 引用类型
        val str : String = "zhangsan"
        val user : User = new User()
        val array : Array[Int]  = new Array[Int](10)

        println(i)
    }
}
