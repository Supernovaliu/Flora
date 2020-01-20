package com.flora.exer;

public class Employee implements Comparable<Employee>{
    private String name;
    private int age;
    private MyDate  birthday;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    public Employee(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public int compareTo(Employee o) {
        return this.getName().compareTo(o.getName());
    }

    /*@Override
    public int compareTo(Object o) {
        if(o instanceof Employee){
            Employee obj = (Employee)o;
            return this.getName().compareTo(obj.getName());
        }else{
            throw new RuntimeException("Data type not match");
        }
    }*/
}
