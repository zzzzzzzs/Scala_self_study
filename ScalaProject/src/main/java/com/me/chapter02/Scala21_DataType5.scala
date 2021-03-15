package com.me.chapter02

object Scala21_DataType5 {

    def main(args: Array[String]): Unit = {

        // java : byte b = (byte)i
        val i : Int = 65
        val c : Char = i.toChar

        val s : String = c.toString

        println(c)

    }
}
