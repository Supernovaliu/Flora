package com.flora.java;

import java.util.ArrayList;
import java.util.List;

public class Order <T>{
    String orderName;
    int orderId;

    //类的内部结构就可以使用类的泛型
    T orderT;
    public Order(){}
    public Order(String orderName,int orderId,T orderT){
        this.orderName = orderName;
        this.orderId = orderId;
        this.orderT = orderT;
    }
    public T getOrderT(){
        return orderT;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderName='" + orderName + '\'' +
                ", orderId=" + orderId +
                ", orderT=" + orderT +
                '}';
    }

    public void setOrderT(T orderT){
        this.orderT = orderT;
    }
//public static void  show(T orderT){
  //  System.out.println(orderT);
//}
    //泛型方法：泛型方法所属的类是不是泛型类没有关系
    public <E>List<E> copyFromArrayToList(E[] arr){
        ArrayList<E> list = new ArrayList<>();
        for(E e:arr){
            list.add(e);
        }
        return list;

    }


}
