package com.flora.java;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionTest {
    @Test
    public void test1(){
        //contains will call equals method of present object
      Collection coll = new ArrayList();
      coll.add(123);
      coll.add(456);
      coll.add(new String("Tom"));
      coll.add(false);
      coll.add(new Person("Jerry",20));
        boolean contains = coll.contains(123);
        System.out.println(contains);
        System.out.println(coll.contains(new String("Tom")));
        System.out.println(coll.contains(new Person("Jerry", 20)));
        Collection coll1 = Arrays.asList(123,456);
        System.out.println(coll.containsAll(coll1));
        coll.remove(123);
        System.out.println(coll);
        coll.remove(new Person("Jerry",20));

        //removeAll  remove intersection
        Collection coll2 = Arrays.asList(123,4567);
        coll.removeAll(coll1);
        System.out.println(coll);



    }
    @Test
    public void test2(){

        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
        coll.add(new Person("Jerry",20));
        Collection coll1 = Arrays.asList(123,456,789);
        //get intersection
        coll.retainAll(coll1);
        System.out.println(coll);

        Collection coll2 = new ArrayList();
        coll.add(456);
        coll.add(123);
        coll.add(new String("Tom"));
        coll.add(false);
        coll.add(new Person("Jerry",20));
        System.out.println(coll.equals(coll2));


    }
@Test
    public void test3(){
    Collection coll = new ArrayList();
    coll.add(456);
    coll.add(123);
    coll.add(new String("Tom"));
    coll.add(false);
    coll.add(new Person("Jerry",20));
    System.out.println(coll.hashCode());
//convert to array
    Object[] objects = coll.toArray();
    for(int i = 0;i<objects.length;i++){
        System.out.println(objects[i]);
    }
    //array to collection?
    List<String> list = Arrays.asList(new String[]{"AA", "BB", "CC"});
    //iterator

}




}

