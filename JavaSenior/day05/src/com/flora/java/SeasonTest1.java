package com.flora.java;

public class SeasonTest1 {
    public static void main(String[] args) {
        Season1 summer = Season1.SUMMER;
        System.out.println(summer);
        //extend from Enum class by default
        System.out.println(Season1.class.getSuperclass());
        Season1[] values = Season1.values();
        for(int i  = 0;i<values.length;i++){
            System.out.println(values[i]);
            values[i].show();
        }
        Thread.State[] values1 = Thread.State.values();
        for(int i  = 0;i<values1.length;i++){
            System.out.println(values1[i]);

        }
        Season1 winter = Season1.valueOf("WINTER");
        System.out.println(winter);
        winter.show();
    }
}
interface Info{
    void show();
}
enum  Season1 implements Info{
    //use coma to separate each object and end with ;
      SPRING ("spring","warm"){
          @Override
        public void show(){
              System.out.println("spring is coming");
          }
    },
     SUMMER("summer","hot"){
          @Override
         public void show(){
              System.out.println("summer is coming");
          }
     },
     AUTUMN ("autumn","cold"){
          public void show(){
              System.out.println("autumn is coming");
          }
     },
     WINTER ("winter","freezing"){
          public void show(){
              System.out.println("winter is coming");
          }
     };
    private final String seasonName;
    private final String seasonDesc;
    //privatization constructor
    private Season1(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;

    }


    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

   // @Override
    //public String toString() {
       // return "Season1{" +
        //        "seasonName='" + seasonName + '\'' +
              //  ", seasonDesc='" + seasonDesc + '\'' +
              //  '}';
   // }
    //@Override
   // public void show(){
      //  System.out.println("This is a season");
    //}
}