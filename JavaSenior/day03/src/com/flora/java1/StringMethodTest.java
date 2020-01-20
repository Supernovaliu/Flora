package com.flora.java1;

import org.junit.jupiter.api.Test;

public class StringMethodTest {
    @Test
    public void Test3(){
        String str1= "helloworld";
        String str2 =  str1.replace('h','f');
        System.out.println(str1);
        System.out.println(str2);
        String str = "12hello34world5java7891mysql456";
        String string = str.replaceAll("\\d+", ",").replaceAll("^,|,$", "");
        System.out.println(string);

        String str8 = "12345"; //判断str字符串中是否全部有数字组成，即有1-n个数字组成
        boolean matches = str8.matches("\\d+");
        System.out.println(matches);
        String tel = "0571-4534289"; //判断这是否是一个杭州的固定电话
        boolean result = tel.matches("0571-\\d{7,8}");
        System.out.println(result);



    }
    @Test
    public void Test2(){
        String str1 = "helloworld";
        boolean b1 = str1.endsWith("ld");
        System.out.println(b1);
        boolean b3 = str1.startsWith("ll",2);
        System.out.println(b3);
        System.out.println(str1.indexOf("lo"));
        System.out.println(str1.indexOf("lo",5));
        System.out.println(str1.lastIndexOf("or",5));

    }
    @Test
    public void test1(){
        String s1 = "HElloworld";
        System.out.println(s1.length());
        System.out.println(s1.charAt(0));

        System.out.println(s1.isEmpty());
        String s2 = s1.toLowerCase();
        System.out.println(s1);
        System.out.println(s2);
        String s3 = "     he     l l o w o r l d      ";
        System.out.println(s3.trim());
        System.out.println(s3);
        String s4 = "helloworld";
        System.out.println(s1.equalsIgnoreCase(s4));
        String s5 = s1.concat("def");
        System.out.println(s5);
        String  s6 = "abc";
        String s7 = new String("def");//涉及到字符串排序
             System.out.println(s6.compareTo(s7));
        System.out.println(s4.substring(2));
        System.out.println(s4.substring(2,5));//左闭右开
    }
}
