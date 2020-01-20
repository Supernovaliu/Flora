package com.flora.java;

import org.junit.jupiter.api.Test;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//currentTimeMillis()
//java.util.Date/java.sql.Date
//SimpleDateFormat
//Calendar
public class DateTimeTest {
    @Test
    public void testSimpleDateFormat() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date d1 = new Date();
        String f1 = sdf.format(d1);
        System.out.println(f1);
        String str = "2020-1-12 上午9:44";
        Date date1 = sdf.parse(str);

        SimpleDateFormat format1 = new SimpleDateFormat("YYYY-MM-DD hh:mm:ss");
        String f2 = format1.format(d1);
        System.out.println(f2);


    }

    @Test
    public void Test2() throws ParseException {
        String birth = "2019-10-08";
        SimpleDateFormat sdf1 = new SimpleDateFormat("YYYY-MM-DD");
        Date date2 = sdf1.parse(birth);
        //java.sql.Date birthDate = new java.sql.Date(date2.getTime());
        //System.out.println(birthDate);
        System.out.println(date2);
    }
    @Test
    public void testCalendar(){
        Calendar c1 = Calendar.getInstance();
        int days = c1.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
        c1.set(Calendar.DAY_OF_MONTH,22);
        days = c1.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
        c1.add(Calendar.DAY_OF_MONTH,3);
        days = c1.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
        Date date = c1.getTime();
        System.out.println(date);
        Date date1 = new Date();
        c1.setTime(date1);
        days = c1.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);


    }
}
