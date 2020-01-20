package com.flora.java;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
//call方法可以有返回值也可以抛出异常，获取异常信息
//callable是支持泛型的
//创建线程的方式三：实现callable接口
//创建一个实现callable的实现类
//实现call方法，将此线程需要执行的操作声明在call中
//创建callable接口实现类的对象
//将此对象作为参数传递到futureTask构造器中创建futureTask的对象
//get()返回值即为FutureTask构造器参数Callable实现类重写的call返回值
class NumThread implements Callable {

    @Override
    public Object call() throws Exception {
        int sum = 0;
       for(int i = 0;i<=100;i++){
           if(i%2 == 0){
               System.out.println(i);
               sum+=i;
           }
       }
       return sum;
    }
}
public class ThreadNew {
    public static void main(String[] args) {
        NumThread numThread = new NumThread();

        FutureTask futureTask = new FutureTask(numThread);
        new Thread(futureTask).start();
        try {
            //get方法返回值即为构造器参数callable实现类重写的返回值
            Object sum = futureTask.get();
            System.out.println("总和为"+sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
