package com.flora.java;

import org.junit.jupiter.api.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

public class JDK8DateTimeTest {
    @Test
    public void test1(){
        LocalDate now = LocalDate.now();
        LocalTime now1 = LocalTime.now();
        LocalDateTime now2 = LocalDateTime.now();
        System.out.println(now);
        System.out.println(now1);
        System.out.println(now2);
        LocalDateTime time = LocalDateTime.of(2020, 1, 12, 13, 43, 43);
        System.out.println(time);
        System.out.println(now2.getDayOfMonth());
        System.out.println(now2.getDayOfWeek());
        System.out.println(now2.getMonthValue());
        //set
        LocalDateTime localDateTime = now2.withDayOfMonth(22);
        System.out.println(localDateTime);
        System.out.println(now2);
        LocalDateTime chinaTime = now2.withHour(6);
        System.out.println(chinaTime);

        LocalDateTime l1 = now2.plusHours(-5);
        System.out.println(l1);
    }
    @Test
    public void test2(){
        Instant instant = Instant.now();
        System.out.println(instant);//greenwich time
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);
        long l = instant.toEpochMilli();
        System.out.println(l);
        Instant instant1 = Instant.ofEpochMilli(1578783915385L);
        System.out.println(instant1);

    }
    //DateTimeFormatter
    @Test
    public void test3(){
        DateTimeFormatter isoLocalDateTime = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        //date to string
        LocalDateTime localDateTime = LocalDateTime.now();
        String format = isoLocalDateTime.format(localDateTime);
        System.out.println(localDateTime);
        System.out.println(format);
        //string to date
        TemporalAccessor parse = isoLocalDateTime.parse("2020-01-12T12:27:32.717");
        System.out.println(parse);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        String format1 = dateTimeFormatter.format(localDateTime);
        System.out.println(format1);

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("YYYY-MM-DD  hh:mm:ss");
        String format2 = dateTimeFormatter1.format(LocalDateTime.now());
        System.out.println(format2);
        TemporalAccessor parse1 = dateTimeFormatter1.parse("2020-01-12  12:45:01");
        System.out.println(parse1);


    }




}
