package com.flora.java.java2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/*
* |-----collection interface
*        |----list  orderly,duplicated data
*             |---ArrayList,LinkedList,Vector
*        |----set    disorderly,unduplicated data
*             |---HashSet,LinkedHashSet,TreeSet
*  |------Map
*         |---HashMap,LinkedHashMap,TreeMap,HashTable,Properties
*
*
*
*
*
* */
public class CollectionTest {
    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add("AA");
        coll.add("BB");
        coll.add(123);
        coll.add(new Date());
        System.out.println(coll.size());

        Collection coll1 = new ArrayList();
        coll1.add(456);
        coll1.add("CC");
        coll1.addAll(coll);
        System.out.println(coll.size());
        System.out.println(coll1.size());
        System.out.println(coll1);

        //isEmpty
        System.out.println(coll1.isEmpty());
        coll1.clear();
        System.out.println(coll1.isEmpty());


    }

}
