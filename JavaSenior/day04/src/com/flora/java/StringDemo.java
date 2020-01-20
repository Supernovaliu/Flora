package com.flora.java;

import org.junit.jupiter.api.Test;

import java.lang.annotation.Target;

public class StringDemo {
    public String reverse(String str,int startIndex,int endIndex){
        if(str!=null&&str.length()!=0){
            char[] arr = str.toCharArray();
            for(int x = startIndex,y = endIndex;x<y;x++,y--){
                char temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;

            }
            return new String(arr);
        }
        return null;
    }

    public String reverse2(String str,int startIndex,int endIndex){
        if(str!= null&&str.length()!=0) {
            String reverseStr = str.substring(0, startIndex);
            for(int i = endIndex;i>=startIndex;i--){
                reverseStr+= str.charAt(i);
            }
            reverseStr+=str.substring(endIndex+1);
            return reverseStr;
        }
        return null;
    }
    public String reverse3(String str,int startIndex,int endIndex){
        if(str!= null&&str.length()!=0) {
            StringBuilder builder = new StringBuilder(str.length());
            builder.append(str.substring(0, startIndex));
            for (int i = endIndex; i >= startIndex; i--) {
                builder.append(str.charAt(i));
            }
            builder.append(str.substring(endIndex + 1));
            return builder.toString();
        }
        return null;
    }

    @Test
    public void test1(){
     String str = "abcdefg";
     String reverse = reverse2(str,2,5);
        System.out.println(reverse);
    }
}
