package com.me.chapter11


import com.me.chapter11.bean._


object Scala04_Generic {

    def main(args: Array[String]): Unit = {

        // TODO Scala - 泛型
        // Java中的泛型和Scala中的泛型基本类似
        // Scala中泛型在类或方法后面增加中括号
        // TODO 1. 泛型不可变
        //val t1 : Test1[User] = new Test1[User]()
        //val t2 : Test1[User] = new Test1[Parent]() //（X）
        //val t3 : Test1[User] = new Test1[Child]()  // (X)
        // TODO 2. Scala为了让我们泛型使用起来方便，对泛型语法进行了优化
        //         让类型和泛型作为整体来使用,就产生了变化：协变，逆变
        // TODO List[泛型1] = List[泛型2]
        // TODO 协变 ： 如果泛型2是泛型1的子类型，那么就让List[泛型2]作为List[泛型1]子类型使用
        //              协变是在泛型前增加+号
        //val t1 : Test1[User] = new Test1[User]()
        //val t2 : Test1[User] = new Test1[Parent]() // （X）
        //val t3 : Test1[User] = new Test1[Child]()
        // TODO 逆变 ：如果泛型2是泛型1的父类型，那么也让List[泛型2]作为List[泛型1]子类型使用
        //             逆变是在泛型前增加-号
        //val t1 : Test1[User] = new Test1[User]()
        //val t2 : Test1[User] = new Test1[Parent]()
        //val t3 : Test1[User] = new Test1[Child]()  // （X）
    }
    class Test1[-T]{

    }
}
