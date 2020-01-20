package com.flora.java;
//synchronized 和lock的异同
//都可以解决线程安全问题
//synchronized机制在执行完相应的同步代码以后自动释放监视器
//lock需要手动同步，结束也需要手动实现
import java.util.concurrent.locks.ReentrantLock;

//解决线程安全问题的方式三：LOCK锁
class Window implements Runnable{
    private int ticket = 100;
    private ReentrantLock lock = new ReentrantLock();//实例化
    public void run(){
        while(true){
            try{
                //调用锁定lock方法
                lock.lock();
                if(ticket>0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"售票，票号为"+ticket);
                }else{
                    break;
                }
            }finally{
                lock.unlock();//调用解锁的方法
            }

        }
    }
}
public class LockTest {
    public static void main(String[] args) {
        Window w = new Window();
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);
        t1.start();
        t2.start();
        t3.start();
    }

}
