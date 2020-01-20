package com.flora.java;
//使用同步模式将单例懒汉式改写成线程安全的
public class BankTest {
}
class Bank{
    private Bank(){

    }
    private static Bank instance = null;
    public static  Bank getInstance(){
        if(instance == null){
            synchronized (Bank.class) {
                if (instance == null) {
                    instance = new Bank();
                }
            }
        }

            return instance;

    }
}

