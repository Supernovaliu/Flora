package com.flora.java1;

import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;


//TreeSet，可以按照添加对象的指定属性进行排序
public class TreeTest {
    //向TreeSet中添加的数据，要求是相同类的对象
         @Test
    public void test1(){
            TreeSet set = new TreeSet();
            set.add(34);
            set.add(-34);
            set.add(43);
            set.add(11);
            set.add(8);
            Iterator iterator = set.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }

        }

    @Test
    public void test2() {
             //自然排序（实现comparable接口）和定制排序
//自然排序中，比较两个对象是否相同的标准为：compareTo返回0，不再是equals



        TreeSet set = new TreeSet();
        set.add(new User("Tom", 12));
        set.add(new User("Jerry", 32));
        set.add(new User("Jim", 2));
        set.add(new User("Mike", 65));
        set.add(new User("Jack", 33));
        set.add(new User("Jack", 56));
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
    @Test
    public void test3(){
        Comparator com = new Comparator(){
            //按照年龄从小到大排列
            //在定制排序中，比较两个对象是否相等的标准为compare返回0

                      @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof User&& o2 instanceof User){
                    User u1 = (User)o1;
                    User u2 = (User)o2;
                    return Integer.compare(u1.getAge(),u2.getAge());
                }else{
                    throw new RuntimeException("Data type not match");
                }
           }
        };
        TreeSet set = new TreeSet(com);
        set.add(new User("Tom", 12));
        set.add(new User("Jerry", 33));
        set.add(new User("Jim", 2));
        set.add(new User("Mike", 65));
        set.add(new User("Jack", 33));
        set.add(new User("Jack", 56));
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
