package com.flora.exer2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class DAOTest {
    public static void main(String[] args) {
        DAO<User>  dao  = new DAO<>();
        Map<String,User>map = new HashMap<>();
        dao.setMap(map);
        dao.save("1001",new User(1001,34,"Jay"));
        dao.save("1002",new User(1002,20,"Edward"));
        dao.save("1003",new User(1003,25,"Thomas"));
        dao.update("1003",new User(1003,30,"Tom"));
        dao.delete("1002");
        List<User> list = dao.list();
        System.out.println(list);
        list.forEach(System.out::println);
    }
}
