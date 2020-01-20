package com.flora.java;
//关于自定义泛型类、接口


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class GenericTest1 {
    @Test
    public void test3(){
        Order<String>order = new Order<>();
        Integer[] arr = new Integer[]{1,2,3,4};
        //泛型方法在调用时，指明泛型参数的类型

        List<Integer> list = order.copyFromArrayToList(arr);
    }
    @Test
    public void test2(){
        ArrayList<String>list1 = null;
        ArrayList<Integer>list2 = null;
        //list1 = list2; 不能互相赋值

    }
    @Test
    public void test1(){
        Order o = new Order();//如果定义了泛型类，实例化没有指明则默认为Object类型
        o.setOrderT(123);
        o.setOrderT("ABC");

        Order<String>order1 = new Order<String>("AA",1001,"order:AA");


    }
}
