package com.flora.java;
//测试Thread中的常用方法
/*start ,启动当前线程，调用当前线程的run
* run需要重写thread类中的此方法
* currentThread返回当前执行的线程
* getName获取当前线程的名字
* setname设置当前线程的名字*
*yield释放当前CPU的执行*
*join在县城A中调用线程B的join方法（线程B的对象调用），线程A进入阻塞状态，直到线程B完全执行完以后线程A才结束阻塞状态*
*stop已过时
* sleep（long millitime）让当前线程睡眠指定的毫秒数，当前线程是阻塞状态* *
*isAlive是否还在执行
*线程的优先级
* MAX_PRIORITY:10
* MIN_PRIORITY:1
* NORM_PRIORITY:5
* 线程优先级只是提高执行概率并不一定会执行* 如何设置当前线程的优先级*
*getPriority
* setPriority(int p)
* *
* * *
* */
class HelloThread extends Thread{
    public void run(){
        for(int i = 0;i<99;i++){
            if(i%2 == 0){
                System.out.println(i);
            }
            //if(i%20 ==0) {
             //   this.yield();//释放当前CPU的执行权
           // }
        }
    }
    public HelloThread(String name){
        super(name);
    }
}
public class ThreadMethodTest {
    public static void main(String[] args) {
        HelloThread h1 = new HelloThread("Thread 1");
        h1.setPriority(Thread.MIN_PRIORITY);
       // h1.setName("Test1");
        h1.start();
        Thread.currentThread().setName("Thread:1");//给主线程命名
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        for(int i = 0;i<99;i++){
            if(i%2 == 0){
                System.out.println(Thread.currentThread().getName()+Thread.currentThread().getPriority()+""+i);
            }

        }





        }
}
