package com.flora.java;

import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringTest1 {
    @Test//与byte之间的转换
    //编码：调用String的getByte方法
    //解码：调用string的构造器




    public void test3() throws UnsupportedEncodingException {
    String str1 = "abc123def";
    byte[] bytes = str1.getBytes();
        System.out.println(Arrays.toString(bytes));
        byte[] gbks = str1.getBytes("gbk");

        String str2 = new String(bytes);
        System.out.println(str2);
        String str3 = new String(gbks);
        System.out.println(str3);
        String str4 = new String(gbks,"gbk");
        System.out.println(str4);
    }
    @Test
    public void test2(){
        String str1 = "abc123";
        char[] charArray = str1.toCharArray();
        for(int i =0;i<charArray.length;i++){
            System.out.println(charArray[i]);
        }
        char[] arr = new char[]{'h','e','l','l','o'};
        String str2 = new String(arr);
        System.out.println(str2);
    }
}
