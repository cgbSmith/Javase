package com.cgblearn.generic;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author cgb
 * @version 1.0
 */
public class GenericExercise02 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("tom",20000,new MyDate(2000,11,11)));
        employees.add(new Employee("tom",12000,new MyDate(1978,9,1)));
        employees.add(new Employee("tom",50000,new MyDate(1990,5,3)));
        System.out.println("employees="+employees);
        System.out.println("===对雇员进行排序====");
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(!(o1 instanceof Employee && o2 instanceof Employee)){
                    System.out.println("类型不正确");
                    return 0;
                }
                int i = o1.getName().compareTo(o2.getName());
                if(i!=0){
                    return i;
                }
                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        });
        System.out.println("employee = "+ employees);


    }
}

class MyDate implements Comparable<MyDate>{
    private int year;
    private int month;
    private int day;

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

    public MyDate(int year, int month, int day) {
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

    @Override
    public int compareTo(MyDate o) {
        int year = this.year-o.getYear();
        if(year!=0){
            return year;
        }
        int month = this.month-o.getMonth();
        if(month!=0){
            return month;
        }
        return this.day-o.getDay();
    }
}

class Employee{
    private String name;
    private double sal;
    private MyDate birthday;

    @Override
    public String toString() {
        return "\nEmployee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }
}
