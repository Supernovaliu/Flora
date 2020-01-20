package com.flora.java1;

import org.junit.jupiter.api.Test;

import java.util.Date;

public class DateTimeTest {
    @Test
    public void Test2() {
        Date date1 = new Date();
        System.out.println(date1.toString());//显示当前的年月日
        System.out.println(date1.getTime());
        Date date2 = new Date(1578716866714L);
        System.out.println(date2);
        Date date6 = new Date();
        java.sql.Date date7 = new java.sql.Date(date6.getTime());
    }

    @Test
    public void test1() {
        long time = System.currentTimeMillis();
        System.out.println(time);//1970.01.01到现在的时间差    }
    }
}
