package com.flora.ThreadPractice;
/*
*卖票过程中出现重票和错票问题就是线程不安全
* 当某个线程操作的过程中，另一个线程也进来执行导致阻塞*
*如何解决：当一个线程在操作ticket的时候其他的线程不能进来，当当前线程操作
* 结束之后其他线程才可以进来*
*在java中，通过同步机制来解决线程安全
*方式一：同步代码块*
*synchronized（同步监视器）{
* 需要被同步的代码
* }
* 说明：操作共享数据的代码即为需要被同步的代码
* 共享数据：多个线程共同操作的变量（数据），比如，ticket就是共享数据*
* 同步监视器：俗称锁。任何一个类的对象都可以来充当锁*
* 要求多个线程必须共用同一把锁*
* * *方式二：同步方法*
*如果操作共享数据的额带吗完整的声明在一个方法中*
* 同步方式的好处：解决了线程安全问题*
*坏处：只能有一个线程参与，相当于单线程*
*
* */
class Window1 implements Runnable{
    private int ticket = 100;


public void run(){
while(true){
    synchronized (this) {
        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "卖票：票号为" + ticket);
            ticket--;
        } else {
            break;
        }
    }
}
}
}

public class WindowTest1 {
    public static void main(String[] args) {
        Window1 w=new Window1();
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();

    }
}
