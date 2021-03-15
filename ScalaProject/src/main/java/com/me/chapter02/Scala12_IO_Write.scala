package com.me.chapter02


import java.io.{File, PrintWriter}

import scala.io.BufferedSource

object Scala12_IO_Write {

    def main(args: Array[String]): Unit = {
        val writer = new PrintWriter(new File("ScalaProject/output/test.txt" ))
        writer.write("Hello Scala")
        writer.close()
    }
}
