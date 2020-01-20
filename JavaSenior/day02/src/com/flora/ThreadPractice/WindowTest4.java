package com.flora.ThreadPractice;

class Window4 extends Thread{
    private static int ticket = 100;

    public void run(){
        while(true){

          show();


        }
    }
    private static synchronized void show(){//此时同步监视器是当前的类
        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "卖票：票号为" + ticket);
            ticket--;
        }
    }

}


public class WindowTest4 {
    public static void main(String[] args) {
        Window4 t1 = new Window4();
        Window4 t2 = new Window4();
        Window4 t3 = new Window4();
        t1.setName("W1");
        t2.setName("W2");
        t3.setName("W3");
        t1.start();
        t2.start();
        t3.start();
    }
}
