package com.flora.java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

//创建线程的方式四：线程池

class NumberThread implements Runnable{

    @Override
    public void run() {
        for(int i = 0;i<=100;i++){
            if(i%2 == 0){
                System.out.println(Thread.currentThread().getName()+i);
            }
        }
    }
}
class NumberThread2 implements Runnable{

    @Override
    public void run() {
        for(int i = 0;i<=100;i++){
            if(i%2 != 0){
                System.out.println(Thread.currentThread().getName()+i);
            }
        }
    }
}
public class ThreadPool {
    public static void main(String[] args) {
        //提供指定线程数量的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);
        //设置线程池的属性，便于线程的管理
        ThreadPoolExecutor  service1 = (ThreadPoolExecutor)service;
        //System.out.println(service.getClass());
        //执行指定的线程的操作，需要提供实现runnable或callable接口实现类的对象
        service.execute(new NumberThread());
        service.execute(new NumberThread2());//适合使用于runnable
        //service.submit();//适合使用于callable
        service.shutdown();
    }
}
