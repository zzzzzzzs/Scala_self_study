package com.me.chapter11;

import com.me.chapter11.bean.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Scala03_Generic_Java2 {
    public static void main(String[] args) {

        // TODO 4. 泛型的使用
        //         泛型不可变 ： 定义好泛型后，是不能被随意改变的。
        //Test<User> test1 = new Test<User>();
        //Test<User> test2 = new Test<Child>();
        //Test<User> test3 = new Test<Parent>();

        // TODO 为了在数据处理中，泛型使用起来更加的方便，提供了泛型边界进行类型的约束

        // TODO 泛型边界 上限 : ? extends User => 当前类和它的子类
        //Test<User> test1 = new Test<User>(); // (OK)
       // Test<Parent> test2 = new Test<Parent>(); // (X)
        //Test<Child> test3 = new Test<Child>(); // (OK)
        // TODO 泛型边界 下限 : ? super User
        //      不能用于类型的声明
        //      首先上限是用于【获取】数据时约定（限制）数据类型
        //      下限的主要作用设定【传递】数据时的数据类型

        Consumer<Child> c = new Consumer<Child>();
        final Message<? extends User> message = c.consumer();
        final User data = message.data;

        //Producer<User> p = new Producer<User>();
        //p.produce(new Message<User>());
        //p.produce(new Message<Child>());
        //p.produce(new Message<Parent>());

    }
}
class Producer<T> {
    public void produce( Message<? super T> m ) {

    }
}
class Consumer<T> {
    public Message<? extends T> consumer() {
        return null;
    }
}
class Message<T> {
    public T data;
}
