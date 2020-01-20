package com.flora.java1;

import org.junit.jupiter.api.Test;

public class StringBufferBuiderTest {
    @Test
    public void test1(){
        StringBuffer sb1= new StringBuffer("abc");
        sb1.setCharAt(0,'m');
        System.out.println(sb1);
    }
}
