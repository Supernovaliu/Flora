package com.flora.java;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericTest2 {
    @Test
    public void test2(){
        List<Object> list1 = null;
        List<String> list2 = null;

        List<?>list = null;
        list = list1;
        list = list2;

        List<String> list3 = new ArrayList<>();
        list3.add("AA");
        list3.add("BB");
        list3.add("CC");
        list = list3;     //List<?>除了null，不能向其中添加数据
//允许读取数据，读取的数据类型是Object
        list.add(null);
        Object o = list.get(0);
        System.out.println(o);

    }
    public void print(List<?>list){
        Iterator<?>iterator = list.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }
    @Test
    public void test1(){
        Object obj = null;
        String str = null;
        obj = str;
        Object[] arr1 = null;
        String[] arr2 = null;
        arr1 = arr2;

        List<Object> list1 = null;
        List<String> list2 = null;
        //此时list1和list2不具有子父类关系
        //list1 = list2;





    }
}
