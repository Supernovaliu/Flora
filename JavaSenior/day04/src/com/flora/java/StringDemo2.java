package com.flora.java;

import org.junit.jupiter.api.Test;

public class StringDemo2 {
    public int getCount(String mainStr,String subStr){
     int mainLength = mainStr.length();
     int subLength = subStr.length();
     int count = 0;
     int index = 0;
     if(mainLength>=subLength){

       //  while((index = mainStr.indexOf(subStr)) != -1){
         //    count++;
           //  mainStr = mainStr.substring(index+subStr.length());
         //}
         while((index = mainStr.indexOf(subStr,index))!=-1){
             count++;
             index+=subLength;
         }


         return count;
     }else{
         return 0;
     }
    }
    @Test
    public void test1(){
        String mainStr = "abkkcadkabkebfkaabkskab";
        String subStr = "ab";
        int count = getCount(mainStr,subStr);
        System.out.println(count);
    }
}
