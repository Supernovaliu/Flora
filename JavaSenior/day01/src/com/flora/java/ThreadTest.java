package com.flora.java;
/*多线程的创建方式一：继承于Thread类*
*1.创建一个继承于Thread的子类
* 2.重写Thread类的run() 将此线程执行的操作声明在run()中* *
* 3.创建Thread类的子类对象
* 通过此对象调用start()*
*
* */
class MyThread extends Thread{
   public void run(){
       for(int i = 0;i<100;i++){
           if(i%2 == 0){
               System.out.println(Thread.currentThread().getName()+""+i);
           }
       }
   }
}
public class ThreadTest {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName()+""+i + "************");
            }
        }
    }
}
