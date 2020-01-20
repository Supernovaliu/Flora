package com.flora.practice;

import com.oracle.deploy.update.UpdateCheckListener;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
//区分list中remove方法

public class ListExer {
    @Test
    public void test1(){
        List list  = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        updateList(list);
        System.out.println(list);
    }

    private static void updateList(List list) {
        //list.remove(2);
        list.remove(new Integer(2));
    }
}
