package com.flora.practice;
/*
*创建两个线程，一个遍历偶数，一个遍历奇数*
*
* */
public class ThreadDemo {
    public static void main(String[] args) {
        //MyThread t = new MyThread();
        // MyThread2 t2 = new MyThread2();
        //t.start();
        //t2.start();
        //创建Thread类的匿名子类的方式
       new Thread(){
           public void run(){
               for(int i = 0;i<99;i++){
                   if(i%2 ==0){
                       System.out.println(i);
                   }
               }
           }


       }.start();


    }
}
class MyThread extends Thread{
public void run(){
    for(int i = 0;i<100;i++){
        if(i%2 == 0){
            System.out.println(i);
        }
    }
}
}
class MyThread2 extends Thread{
public void run(){
    for(int i = 0;i<100;i++){
        if(i%2!=0){
            System.out.println(i);
        }
    }
}
}