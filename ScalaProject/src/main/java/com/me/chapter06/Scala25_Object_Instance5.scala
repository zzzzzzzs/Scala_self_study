package com.atguigu.bigdata.scala.chapter06

object Scala25_Object_Instance5 {

    def main(args: Array[String]): Unit = {

        // TODO 构造对象
        // 1. new => 等同于调用类的构造方法
        //val user = new User()
        // 2. apply => 等同于调用伴生对象的apply方法
        val user1 = User()
        // 3. 反序列化
        // 4. 反射
        val clazz: Class[User] = classOf[User]
        val user2: User = clazz.newInstance()

    }

    // 在构造方法前增加private关键字，表示构造方法私有化
    class User private(){

    }
    object User {
        def apply(): User = new User()
    }
}



