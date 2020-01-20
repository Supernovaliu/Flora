package com.flora.java;
//创建多线程的方法二：实现runnable接口
//创建一个实现了runnable接口的类
// 实现类去实现Runnable中的抽象方法run
// 创建实现类的对象
// 将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
// 通过Thread类的对象调用start
//创建线程方式的比较：开发中，优先选择实现接口的方式
//没有单继承的局限性，实现的方式更适合来处理多个线程共享数据的情况




class MThread implements Runnable{

    @Override
    public void run() {
      for(int i = 0;i<99;i++){
          if(i%2 == 0){
              System.out.println(i);
          }
      }
    }
}
public class ThreadTest2 {
    public static void main(String[] args) {
        MThread m = new MThread();
        Thread t1 = new Thread(m);
        t1.start();
        Thread t2 = new Thread(m);
        t2.start();
    }
}

