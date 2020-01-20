package com.flora.exer;

public class MyDate implements Comparable<MyDate>{
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month,int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    /*@Override
    public int compareTo(Object o) {
        if(o instanceof MyDate){
            MyDate m = (MyDate)o;
            if(this.getYear()-m.getYear()!=0){
                return this.getYear()-m.getYear();
            }else if (this.getMonth()-m.getMonth() != 0){
                return this.getMonth()-m.getMonth();
            }else{
                return this.getDay()-m.getDay();
            }
        }
      throw new RuntimeException("Data type not match");
    }*/

    @Override
    public int compareTo(MyDate o) {
        int minusYear = this.getYear()-o.getYear();
        if(minusYear!=0){
            return minusYear;
        }
        int minusMonth = this.getMonth()-o.getMonth();
        if(minusMonth!=0){
            return minusMonth;
        }
        return this.getDay()-o.getDay();
    }
}
