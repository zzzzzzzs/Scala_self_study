package com.atguigu.bigdata.scala.chapter03;

public class Scala06_Oper_Java {
    public static void main(String[] args) {
        //new String();
        //1;
        // 按位与
        // 1 + 111 1111 => 8位数据中负数的最大值 => -1
        // 1 + 000 0000 => 8位数据中负数的最小值 => -128
        // 1000 0001 => 1000 0000 + 1 => -127

        //   0101 0101
        // &
        //   0011 0011
        //-------------
        //   0001 0001

        /*

HashMap :
1. 极限情况下，向hashMap中放置多少条数据，会形成红黑二叉树？
   JDK1.8 HashMap底层数据结构增加一种红黑二叉树

   11条

   8(16) => 9(16*2=>32) => 10(32*2=>64) => 11(Tree)


2. HashMap为什么扩容是2倍，而不是1.5？

    如果扩容不是2倍，而是1，5或是其他，那么容量就不是2的N次方

    判断数据存储位置算法：

    hash(key.hashCode) & (tables.length - 1)


    0111 1111
   &
    0000 1111
    ---------
    0000 0000 => 0
    0000 0101 => 5
    0000 0111 => 7
    0000 1111 => 15

    (0 , 15)


    （0， ，，，4）

    0111 0101
   &
    0000 0100
    ---------
    0000 0000 => 0

         */
    }

}