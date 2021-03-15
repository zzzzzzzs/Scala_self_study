package com.me.chapter06;

public class Scala32_Object_Interface_Java {
    public static void main(String[] args) throws Exception {

        //CC cc = new AA();
        //AA aa = new BB();
        //System.out.println(cc);
        //System.out.println(aa);

        // 多态的传递
        CC cc = new BB();
        //System.out.println(cc);

        // BB没有实现CC接口
        // 因为接口和类是两个不同的体系
        System.out.println(BB.class.getInterfaces().length);


    }
}
interface CC {
}
class TT {

}
class AA extends TT implements CC {
}
class BB extends AA {
}