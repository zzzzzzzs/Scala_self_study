package com.me.chapter06;

public class Scala09_Object_Class_Java {
    public static void main(String[] args) throws Exception {

        Thread t1 = new Thread();
        Thread t2 = new Thread();

        t1.start();
        t2.start();
        // TODO Thread线程中sleep方法和wait的区别？
        // 核心区别在于两个方法的字体不同
        //   IDEA当识别出方法是静态的时候，会以斜体的方式展示
        // TODO sleep方法是静态的，而wait方法是成员方法
        //   1. 静态方法和类型相关，和对象无关，所以静态方法sleep和对象t1没有任何关系
        //      当前休眠的线程不是t1, 哪个线程中调用了sleep方法，哪个线程休眠
        //      当前休眠的线程其实应该main线程
        //   2. wait方法是成员方法，和对象相关，所以成员方法wait和对象t2有关系
        //      当前等待的线程就是t2线程。
        //   3. sleep和类型相关，和对象无关，哪来的的对象锁，所以不可能释放对象锁
        //      wait和对象相关，所以就可以获取对象锁，那么也就可以释放对象锁
        t1.sleep(1000);
        t2.wait();
    }
}