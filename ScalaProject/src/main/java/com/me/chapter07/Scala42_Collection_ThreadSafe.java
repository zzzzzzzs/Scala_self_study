package com.me.chapter07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Scala42_Collection_ThreadSafe {
    public static void main(String[] args) {

        // TODO 1. 有几个线程？
        //         2 (t1, t2)+ 1（main） = 3 线程
        // TODO 2. 哪个线程先执行？
        //         main线程先执行
        //         t1.start并不能保证t1一定优于t2执行
        //         本机模式下，程序处理速度非常快，一般先启动的会先执行。
        //         main -> t1 -> t2
        // TODO 3. 执行后打印的内容是什么？
        //         main方法执行完毕 => 1000s(zhangsan) => 1000(lisi)

        // TODO 所谓的线程安全问题 :
        //     其实就是在多线程并发执行时，对共享内存（堆内存，方法区内存）中的共享对象的属性
        //     进行修改所导致的数据冲突问题
        //     解决方案：
        //      1. 串行 ： 性能太低，不推荐
        //      2. 对象不保存到共享内存中：栈上分配，逃逸分析。
        //      3. 如果多线程访问的不是共享对象
        //      4. 如果多线程不修改属性，只是访问这个属性。

        User user = new User();

        Thread t1 = new Thread(
            new Runnable() {
                @Override
                public void run() {
                    //User user = new User();
                    user.name = "zhangsan";
                    try {
                        Thread.sleep(1000);
                    } catch ( Exception e ) {
                        e.printStackTrace();
                    }
                    System.out.println(user.name);
                }
            }
        );
        Thread t2 = new Thread(
            new Runnable() {
                @Override
                public void run() {
                    //User user = new User();
                    user.name = "lisi";
                    try {
                        Thread.sleep(1000);
                    } catch ( Exception e ) {
                        e.printStackTrace();
                    }
                    System.out.println(user.name);
                }
            }
        );

        t1.start();
        t2.start();

        System.out.println("main方法执行完毕");

    }
}
class User {
    public String name;
}
