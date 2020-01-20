package com.flora.java;
/*
*String 声明为final，不可被继承
* *String实现了Serializable接口，表示字符串是支持序列化的*
*         实现了comparable接口,表示string可以比较大小
*         string 内部定义了final char[]value用于存储字符串数据
*         string 代表不可变的字符序列*
*通过字面量的方式给字符串赋值，存在于常量池中
*常量池不会存储相同内容的字符串
* *
*
*
*
* *
* */
import org.junit.jupiter.api.Test;

public class StringTest {
    @Test
    public void Test2(){
    String s1 = "JavaEE";
    String s2 = "JavaEE";
    String s5 = "hello";
    String s6 = s5+"world";
    //经过堆空间的地址值
        String s3 = new String("JavaEE");
    String s4 = new String("JavaEE");
        System.out.println(s1 == s2);
        System.out.println(s1 == s4);
        System.out.println(s3 == s4);
        System.out.println(s1 == s3);
        System.out.println(s6);
    }




    @Test
    public void test1(){
    String s1 = "abc";//字面量的定义方式
         String s2 = "abc";
    s1 = "hello";
        System.out.println(s1);
        System.out.println(s2);
    }
}
