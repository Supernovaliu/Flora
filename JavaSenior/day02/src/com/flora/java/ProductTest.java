package com.flora.java;
//线程通信的应用
class Clerk{
     private int productNCount = 0;
    public synchronized void produceProduct() {
    if(productNCount<20){
        productNCount++;
        System.out.println(Thread.currentThread().getName()+"开始生产第"+productNCount+"个产品");

        notify();
    }else{
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    }

    public synchronized void consumeProduct() {
      if(productNCount>0){
          System.out.println(Thread.currentThread().getName()+"开始消费第"+productNCount+"个产品");
          productNCount--;
          notify();
      }else{
          try {
              wait();
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
    }
}
class Producer extends Thread{
    private Clerk clerk;
    public Producer(Clerk clerk){
        this.clerk = clerk;
    }
    public void run(){
        System.out.println(getName()+":开始生产产品...");
        while(true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.produceProduct();
        }
    }
}
class Consumer extends Thread{
    private Clerk clerk;
    public Consumer(Clerk clerk){
        this.clerk = clerk;

    }
    public void run(){
        System.out.println(getName()+":开始消费产品...");
        while(true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.consumeProduct();
        }
    }
}
public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Producer p1 = new Producer(clerk);
        p1.setName("生产者1");

        Consumer c1 = new Consumer(clerk);
        c1.setName("消费者1");

        p1.start();
        c1.start();

            }

}
