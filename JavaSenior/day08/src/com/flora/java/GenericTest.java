package com.flora.java;

import org.junit.jupiter.api.Test;

import java.util.*;
//集合或集合类已经都修改为带泛型的接口
//实例化集合或类时，可以指明泛型类型
//指明完以后，凡是定义类或接口时，指定为实例化时的泛型
//泛型的类型必须是类，不能是基本数据类型，需要用到基本数据类型的位置要拿包装类来替换
//如果实例化时没有指明泛型的类型，默认类型为java.lang.Object类型
//如何自定义泛型结构：类，接口，方法


public class GenericTest {
    @Test
    public void test1(){
        ArrayList list = new ArrayList();
        list.add(78);
        list.add(76);
        list.add(89);
        list.add(88);
        //data type is unsafe
      //  list.add("Tom");
        for(Object score:list){
            //强转可能出异常
            int stuScore = (int)score;
            System.out.println(stuScore);
        }
    }
    @Test
    public void test2(){
         ArrayList<Integer> list = new ArrayList<Integer>();
         list.add(78);
         list.add(76);
         list.add(89);
         list.add(88);
         //list.add("Tom"),在编译时就能保证数据的安全
        for(Integer score:list){
            //避免强转
            int stuScore = score;
            System.out.println(stuScore);
        }
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            int stuScore = iterator.next();
            System.out.println(stuScore);
        }
    }
    @Test
    public void test3(){
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("Tom",87);
        map.put("Jerry",87);
        map.put("Jack",67);
        Set<Map.Entry<String,Integer>> entry = map.entrySet();
        Iterator<Map.Entry<String,Integer>>iterator = entry.iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Integer>e = iterator.next();
            String key = e.getKey();
            Integer value = e.getValue();
            System.out.println(key+"----"+value);
        }
    }
}
