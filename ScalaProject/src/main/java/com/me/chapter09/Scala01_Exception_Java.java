package com.me.chapter09;

public class Scala01_Exception_Java {
    public static void main(String[] args) throws Exception {

        try {

            // 编译时异常： 提示性异常， 一般必须进行处理，所以try catch语法主要用于解决问题。
            //              不是为了调试错误
            // 运行时异常：可以通过编码的方式解决。

            // java中异常可以捕捉多个,捕捉顺序是从上到小，所以异常已经捕捉，那么后面的代码就执行不到
            // 捕捉顺序应该将异常范围小先捕捉，然后在捕捉范围大的异常。
            int i = 0;
            int j = 10 / i;
        } catch ( ArithmeticException e ) {
            System.out.println("算术异常。。。");
            throw e;
        } catch ( Exception e ) {
            // 异常 ： 调试错误
            e.printStackTrace();
            throw e;
        }
        System.out.println("main方法执行完毕。。。");
    }
}
