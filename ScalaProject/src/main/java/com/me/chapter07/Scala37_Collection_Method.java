package com.atguigu.bigdata.scala.chapter07;
import java.util.*;
public class Scala37_Collection_Method {
    public static void main(String[] args) {

        Map<String,Integer> A = new HashMap<String, Integer>();
        A.put("a", 1);
        A.put("b", 2);
        A.put("c", 3);
        Map<String,Integer> B = new HashMap<String, Integer>();
        B.put("a", 4);
        B.put("d", 5);
        B.put("c", 6);

        // TODO 以一个集合（A）为中心，保持不变。另外一个集合(B)循环变量每一个元素（KV）
        //   1. 判断B中的KV中K在A中是否存在
        //   2. 如果A中不存在对应K，那么在A中添加对应KV
        //   3. 如果A中存在对应K，那么从A取出对应Value，然后增加后再更新到A中

        final Iterator<String> iterator = B.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Integer b_val = B.get(key);

            final Integer a_val = A.get(key);
            if ( a_val == null ) {
                A.put(key,b_val);
            } else {
                A.put(key,b_val + a_val);
            }
        }

        System.out.println(A);

    }
}
