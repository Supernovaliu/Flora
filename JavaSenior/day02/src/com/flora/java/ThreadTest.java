package com.flora.java;
//演示线程的死锁问题
//说明：死锁不会抛异常但是程序没办法运行，要避免死锁问题
//解决方法：专门的算法、原则；尽量减少同步资源的定义；尽量避免嵌套同步


public class ThreadTest {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer();

        new Thread(){
            public void run(){
              synchronized(s1){
                  s1.append("a");
                  s2.append("1");
                  try {
                      Thread.sleep(100);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
                  synchronized(s2){
                      s1.append("b");
                      s2.append("2");

                      System.out.println(s1);
                      System.out.println(s2);
                  }
              }

            }
        }.start();
        new Thread(new Runnable(){
            public void run(){
                synchronized(s2){
                    s1.append("c");
                    s2.append("3");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized(s1){
                        s1.append("d");
                        s2.append("4");

                        System.out.println(s1);
                        System.out.println(s2);
                    }
                }

            }
        }).start();
    }


}
