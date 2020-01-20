package com.flora.java;
import java.util.Arrays;
public class Goods implements Comparable {
    private String name;
    private double price;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {

        return name;
    }

    public double getPrice() {
        return price;
    }

    public Goods(String name, double price){
        this.name = name;
        this.price = price;

    }
    public String toString(){
        return "Goods{"+name+'\''+",price="+price+'}';
    }
//按照价格，比较商品的大小 @Override
public int compareTo(Object o) {
    if(o instanceof Goods) {
        Goods other = (Goods) o;
       if (this.price > other.price) {
           return 1;
        } else if (this.price < other.price) {
           return -1;
      }else {
          this.name.compareTo(other.name);
       }
    }
           throw new RuntimeException("输入的数据类型不一致");
} //构造器、getter、setter、toString()方法略
}


