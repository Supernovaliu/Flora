package com.flora.java1;
//Set:disorderly,unduplicapable data
//HashSet:unsafe thread
//LinkedHashSet: extends from hashSet
//TreeSet:可以按照添加对象的指定属性，进行排序
//无序：存储的数组在底层数组中并非按照索引的顺序添加，而是根据hash值决定
//不可重复性:保证添加的元素按照equals()判断时，不能返回true
//添加元素的过程，以hashset为例
//我们向HashSet中添加元素a，首先调用元素a所在类的hashCode()方法，
//此哈希值接着通过某种算法计算出在HashSet底层数组中的存放位置
//判断数组此位置上是否已经有元素，如果此位置没有其他元素，则元素a添加成功
//如果此位置上有其他元素b（或以链表形式存在的多个元素），则比较元素a 与b的哈希值
//如果哈希值不相同，则元素a添加成功
//如果哈希值相同，则调用equals方法比较，true则添加失败，false则添加在链表尾部
//HashSet底层：数组+链表的结构
//像Set中添加的数据，其所在的类一定要重写hashCode和equals方法
//重写的hashCode和equals尽可能保持一致性，相等的对象必须具有相等的散列码







import com.flora.java.Person;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest {

    @Test
    public void test1(){
        Set set = new HashSet();
        set.add(456);
        set.add(123);
        set.add("AA");
        set.add("CC");
        set.add(new User("Tom",20));
        set.add(new User("Tom",20));
        set.add(129);
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    //LinkedHashSet作为HashSet的子类，在添加数据的同时，还维护了两个引用
    //记录数据的添加顺序
    //对于频繁的遍历操作，LinkedHashSet效率高于HashSet


    @Test
    public void test2() {
        Set set = new LinkedHashSet();
        set.add(456);
        set.add(123);
        set.add("AA");
        set.add("CC");
        set.add(new User("Tom", 20));
        set.add(new User("Tom", 20));
        set.add(129);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());


        }
    }
}
