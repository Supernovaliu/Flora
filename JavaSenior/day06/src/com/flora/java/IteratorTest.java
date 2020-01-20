package com.flora.java;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest{
//iterator接口用来遍历collection


@Test
public void test1(){
    Collection coll = new ArrayList();
    coll.add(456);
    coll.add(123);
    coll.add(new String("Tom"));
    coll.add(false);
    coll.add(new Person("Jerry",20));
    Iterator iterator = coll.iterator();
    //有几个元素调用几个next
    //System.out.println(iterator.next());
    //System.out.println(iterator.next());
    //System.out.println(iterator.next());
    //System.out.println(iterator.next());
    //System.out.println(iterator.next());
   // for(int i = 0;i<coll.size();i++){
     //   System.out.println(iterator.next());
    //}
    while(iterator.hasNext()){
        System.out.println(iterator.next());
    }
}
@Test
    public void test3(){

    Collection coll = new ArrayList();
    coll.add(456);
    coll.add(123);
    coll.add(new String("Tom"));
    coll.add(false);
    coll.add(new Person("Jerry",20));
    Iterator iterator = coll.iterator();
    while(iterator.hasNext()){
        Object obj = iterator.next();
        if("Tom".equals(obj)){
            iterator.remove();//remove area with "Tom"from iterator
        }

    }
    Iterator i = coll.iterator();
    while(i.hasNext()){
        System.out.println(i.next());
    }




}
}
