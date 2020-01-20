package com.flora.ThreadPractice;
/*
*例子：创建三个窗口买票，总票数为100张
*存在线程安全问题待解决
*在继承创建多线程的方式中，慎用this充当线程锁
*要精确包含需要同步的代码*
*
* *
*
*
* * * */
class Window extends Thread{
    private static int ticket = 100;
    private static Object obj = new Object();
    public void run(){
        while(true){
            synchronized (Window.class) {     //Window只会加载一次
                 if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName() + "卖票：票号为" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }

        }
    }
}

public class WindowTest {
    public static void main(String[] args) {
        Window t1 = new Window();
        Window t2 = new Window();
        Window t3 = new Window();
        t1.setName("W1");
        t2.setName("W2");
        t3.setName("W3");
        t1.start();
        t2.start();
        t3.start();
    }
}
