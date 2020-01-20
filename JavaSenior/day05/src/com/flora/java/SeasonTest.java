package com.flora.java;

public class SeasonTest {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        System.out.println(spring);
    }



}
class Season{
    private final String seasonName;
    private final String seasonDesc;
    //privatization constructor
    private Season(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;

    }
    public static final Season SPRING = new Season("spring","warm");
    public static final Season SUMMER = new Season("summer","hot");
    public static final Season AUTUMN = new Season("autumn","cold");
    public static final Season WINTER = new Season("winter","freezing");

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}