package com.atguigu.bigdata.scala.chapter05

// 在网络中传输，类应该可以序列化
class Task extends Serializable {
    var data : Int = 10
    var logic = (x:Int)=>{x * 2}

    /**
      * 计算
      */
    def compute() = {
        logic(data)
    }
}
