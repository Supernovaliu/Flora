package com.flora.java;
//操作set,list,map的工具类


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {
    @Test
    public void test1(){
        List list  =  new ArrayList();
        list.add(123);
        list.add(43);
        list.add(765);
        list.add(-97);
        list.add(0);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);
        Collections.shuffle(list);
        Collections.sort(list);
        System.out.println(list);

    }
}
