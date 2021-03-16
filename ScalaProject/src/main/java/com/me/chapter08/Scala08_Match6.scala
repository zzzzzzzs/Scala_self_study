package com.me.chapter08



object Scala08_Match6 {

    def main(args: Array[String]): Unit = {

        // TODO 匹配对象
        // Scala为了解决匹配对象的繁琐的问题，提供了一个新的语法来简化操作
        // 专门用于模式匹配的类称之为样例类
        // 样例类会自动生成 apply, unapply
        // 样例类自动实现可序列化接口
        // 样例类的构造参数自动使用val声明
        val user: User = User("zhangsan", 10)
        val result = user match {
            case User("zhangsan", 11) => "yes"
            case _ => "no"
        }
        println(result)
    }
    case class User( name: String, age: Int){

    }
}
