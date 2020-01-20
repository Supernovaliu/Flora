package com.flora.java;
/*
*线程通信*
*wait():一旦执行此方法，当前线程就进入阻塞状态，并释放同步监视器
* * notify():一旦执行此方法就会唤醒被wait的线程
* * notifyAll():唤醒所有被wait的线程*
*这些方法必须在同步方法中或同步代码块调用*
*这三个方法的调用者必须是同步代码块或同步方法中的同步监视器，否则会出现异常*
*这三个方法都定义在Object类中
* sleep和wait的异同
* 相同：一旦执行都可以使当前线程进入阻塞状态
* 不同：声明的位置不同，Thread类中声明sleep,Object声明wait
* sleep任何场景都可以调用，wait必须使用在同步代码块或同步方法中
* 关于是否释放同步监视器：如果都使用在同步代码块或方法中，sleep不会释放锁，wait会释放锁* *
*
*
*
* */

class Number implements Runnable{
    private int number = 1;
    public void run(){
        while(true) {
            synchronized(this){
                notify();
            if (number < 100) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + ":" + number);
                number++;
                try {
                    //使得调用此方法的线程进入阻塞状态，同时释放锁
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                break;
            }
        }
        }
    }
}
public class CommunicationTest {
    public static void main(String[] args) {
        Number number = new Number();
        Thread t1 = new Thread(number);
        Thread t2 = new Thread(number);

        t1.setName("Thread1");
        t2.setName("Thread2");
        t1.start();
        t2.start();
    }
}
