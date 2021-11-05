package com.me.notice

/**
 * @author zs
 * @date 2021/11/5
 * TODO scala不支持一行里面有多个操作
 */
object Iter {

  def func1(): Unit ={
    val iter = Iterator("Baidu", "Google", "Runoob", "Taobao")
    // scala不支持一行里面有多个操作
    var flag: Boolean = false
    while ((flag = iter.hasNext) == true) {// TODO 这样flag一直是false，没有赋值
      println(iter.next())
    }
  }

  def func2(): Unit = {
    val iter = Iterator("Baidu", "Google", "Runoob", "Taobao")
    while (iter.hasNext) {
      println(iter.next())
    }
  }

  def main(args: Array[String]): Unit = {
//    func1()
    func2()
  }
}
