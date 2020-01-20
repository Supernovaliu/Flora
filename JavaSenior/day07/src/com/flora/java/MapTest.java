package com.flora.java;
//Map:存储Key-value对的数据
/*
*Map
*    HashMap:线程不安全，效率高
*    *        LinkedHashMap:可以实现有顺序遍历map，对于频繁的遍历操作，效率高于HashMap*
*
*    TreeMap:按照添加 的key-value进行排序，进行排序遍历
*             底层使用的是红黑树
*     Hashtable：线程安全，效率低，不能存储null的key和value
*     *        Properties：常用来处理配置文件，key和value都是String类型
*    *    *
*HashMap底层：最初是数组加链表
*             后面是数组+链表+红黑树*
*
*
*Map中的key是无序的不可重复的（key所在的类要重写equals和hashcode方法），value也是无序的但是是可重复的
* key-value构成一个entry
* entry是无序的不可重复的，用set存储*
* JDK 7
*在实例化以后，底层创建了长度是16的一维数组Entry[]table
* * *map.put(ley1,value)
* 首先，调用key1所在类的hashcode()计算key1的哈希值，此哈希值经过某种算法计算后，得到在entry数组中的存放位置
* *
*如果此位置上的数据为空，此时key1-value添加成功
* 如果不为空，则此位置上一个或多个数据（以链表形式存在），比较key1和已经存在的多个数据的哈希值
* 如果key1的哈希值与已经存在的数据的哈希值都不相同，则key1-value添加成功
* 如果哈希值相同，则调用key1所在类的equals方法比较* *
* 如果equals返回false，则添加成功
* 如果返回true,则用value2代替value1*
*在添加过程中会涉及到扩容。当超出临界值且要存放的位置不为空时，就会扩容。默认的扩容方式是扩容为原来容量的2倍，并将所有数据复制过来
*JDK 8的不同
* 实例化的时候没有创建一个长度为16的数组，同时，此时entry是node类型的数组
* 首次调用put方法时，底层创建长度为16的数组* *
*JDK7：数组+链表 JDK 8 ：数组+链表+红黑树
* 当数组的某一个索引位置上的元素以链表形式存在的数据个数大于8且数组的长度大于64时，
* 此时此索引位置上的所有数据改为使用红黑树存储*
*
* */
import org.junit.jupiter.api.Test;

import java.lang.annotation.Target;
import java.util.*;

public class MapTest {
    @Test
    public void test5(){
        Map map = new HashMap();
        //添加

        map.put("AA",123);
        map.put(45,123);
        map.put("BB",56);
//遍历key
        Set set= map.keySet();
        Iterator iterator  = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //遍历value
        Collection values = map.values();
        for(Object obj:values){
            System.out.println(obj);
        }
        //遍历key-value：entrySet
        Set entrySet = map.entrySet();
        Iterator iterator2  = entrySet.iterator();
        while(iterator2.hasNext()){
            Object o = iterator2.next();
            //entrySet集合中的元素都entry
            Map.Entry entry = (Map.Entry)o;
            System.out.println(entry.getKey() + "---"+entry.getValue());
        }
        Set keySet1 = map.keySet();
        Iterator iterator3 = keySet1.iterator();
        while(iterator3.hasNext()){
            Object key1 = iterator3.next();
            Object value  = map.get(key1);
            System.out.println(key1+""+value);
        }
    }
    @Test
    public void test4(){
        Map map = new HashMap();
        //添加

        map.put("AA",123);
        map.put(45,123);
        map.put("BB",56);
        System.out.println(map.get(45));
        boolean bb = map.containsKey("BB");
        System.out.println(bb);
        boolean containsValue = map.containsValue(123);
        System.out.println(containsValue);
        map.clear();
        System.out.println(map.isEmpty());


    }
    @Test
    public void test3(){
       Map map = new HashMap();
       //添加

       map.put("AA",123);
       map.put(45,123);
       map.put("BB",56);
       //修改
        map.put("AA",87);
        Map map1 = new HashMap();
        map1.put("CC",123);
        map1.put("DD",123);
        map.putAll(map1);
        System.out.println(map);

       Object obj =  map.remove("CC");
        System.out.println(obj);
        System.out.println(map);

        map.clear();
        System.out.println(map.size());
        System.out.println(map);




    }
@Test
public void test1(){
    Map map = new HashMap();
    map.put(null,123);
}
@Test
    public void test2(){
    Map map = new LinkedHashMap();
    map.put(123,"AA");
    map.put(456,"BB");
    map.put(12,"CC");
    System.out.println(map);

}
}
