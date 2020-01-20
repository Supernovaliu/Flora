package com.flora.java;
//what's the difference between ArrayList,LinkedList and Vector?
//all implement List interface
//ArrayList list = new ArrayList() 第一次调用add时，底层才创建长度为10的数组
//LinkedList list = new LinkedList()声明了node类型的first和last属性
//List接口中常用方法
//常用方法：
//增：add(object obj)
//remove
//set
//get
//add(int index,object o)
//size
//Iterator/foreach

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {
@Test
    public void test1(){
    ArrayList list = new ArrayList();
    list.add(123);
    list.add(456);
    list.add("AA");
    list.add(new Person("Tom",20));
    list.add(456);

    System.out.println(list);
    list.add(1,"BB");
    System.out.println(list);
    List<Integer> integers = Arrays.asList(1, 2, 3);
    list.addAll(integers);
    System.out.println(list.size());
    System.out.println(list.get(1));
}
 @Test
    public void test2(){
     ArrayList list = new ArrayList();
     list.add(123);
     list.add(456);
     list.add("AA");
     list.add(new Person("Tom",20));
     list.add(456);

     int i = list.indexOf(456);//如果不存在，返回值都是-1
     System.out.println(i);
     System.out.println(list.lastIndexOf(456));
     Object remove = list.remove(0);
     System.out.println(remove);
     System.out.println(list);

     Object set = list.set(1, "CC");
     System.out.println(list);
     List subList = list.subList(2, 4);
     System.out.println(subList);

 }
 @Test
    public void test3(){
     ArrayList list = new ArrayList();
     list.add(123);
     list.add(456);
     list.add("AA");
     Iterator iterator  = list.iterator();
     while(iterator.hasNext()){
         System.out.println(iterator.next());
     }
     for(Object obj:list){
         System.out.println(obj);
     }
     for(int i = 0;i<list.size();i++){
         System.out.println(list.get(i));
     }
 }
}
