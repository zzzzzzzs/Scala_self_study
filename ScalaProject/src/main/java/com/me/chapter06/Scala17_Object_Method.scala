package com.atguigu.bigdata.scala.chapter06


object Scala17_Object_Method {

    def main(args: Array[String]): Unit = {

        // TODO Scala 面向对象 - 方法
        // Scala中方法其实就是函数，只是声明在类中,遵循方法的规则：重写 & 重载
        // 如果方法声明在class类中，那么必须通过对象才可以在外部访问,称之为成员方法
        //new User().test()
        // 如果方法声明在object类中，那么可以通过类名直接访问，简单理解为静态方法
        //Scala17_Object_Method.main()

        // TODO 默认情况下，类中存在哪些方法？
        //  1. Object类中提供的方法，对象都有。能否使用需要考虑访问权限。
        //  2. Scala提供的一些方法
        val user = new User()
        // 将对象转换为指定类型
        user.asInstanceOf[User]
        // 判断对象是否为某一个类型的实例
        user.isInstanceOf[User]
        // 判断两个对象是否相等（其实编译时就是双等号）
        user.eq(new User())
        // 获取类型信息（反射）
        val clazz: Class[_ <: User] = user.getClass
        val unit: Class[User] = classOf[User]


    }
    class User {
        override def equals(obj: Any): Boolean = {

            if ( obj.isInstanceOf[User] ) {
                val otherUser = obj.asInstanceOf[User]
                this.hashCode() == otherUser.hashCode()
            } else {
                false
            }

            /*
               java :

               if ( obj instanceOf User ) {
                   User otherUser = (User)obj;
               }
             */
        }
    }
}



