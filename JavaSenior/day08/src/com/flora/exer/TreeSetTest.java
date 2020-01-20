package com.flora.exer;

import org.junit.jupiter.api.Test;


import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
    @Test
    public void test1(){
        TreeSet<Employee> set = new TreeSet<Employee>();
        set.add(new Employee("Jack",12,new MyDate(1991,2,6)));
        set.add(new Employee("Tasha",13,new MyDate(1991,12,5)));
        set.add(new Employee("Miranda",16,new MyDate(2014,5,20)));
        set.add(new Employee("Natali",28,new MyDate(1991,2,15)));
        set.add(new Employee("Tom",31,new MyDate(1989,6,13)));
        Iterator<Employee> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    @Test
    public void test2(){
        Comparator com = new Comparator<Employee>(){
            @Override
            public int compare(Employee o1, Employee o2) {
                MyDate b1 = o1.getBirthday();
                MyDate b2 = o2.getBirthday();
                return b1.compareTo(b2);
            }

            //   @Override
           /// public int compare(Object o1, Object o2) {
              //  if(o1 instanceof Employee && o2 instanceof Employee){
                //    Employee obj1 = (Employee)o1;
                  //  Employee obj2 = (Employee)o2;
                    //MyDate b1 = obj1.getBirthday();
                    //MyDate b2 = obj2.getBirthday();

                   /* if(b1.getYear()-b2.getYear()!=0){
                        return b1.getYear()-b2.getYear();
                    }else if (b1.getMonth()-b2.getMonth() != 0){
                        return b1.getMonth()-b2.getMonth();
                    }else{
                        return b1.getDay()-b2.getDay();
                    }*/
                   //return b1.compareTo(b2);

                //}
                //throw new RuntimeException("Data type not match");
            //}
        };
        TreeSet set = new TreeSet(com);
        set.add(new Employee("Jack",12,new MyDate(1991,2,6)));
        set.add(new Employee("Tasha",13,new MyDate(1991,12,5)));
        set.add(new Employee("Miranda",16,new MyDate(2014,5,20)));
        set.add(new Employee("Natali",28,new MyDate(1991,2,15)));
        set.add(new Employee("Tom",31,new MyDate(1989,6,13)));
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
