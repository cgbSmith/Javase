package com.cgblearn.Date_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author cgb
 * @version 1.0
 */
public class Date01 {
    public static void main(String[] args) throws ParseException {
        Date d1 =new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String nae = sdf.format(d1);
        System.out.println(nae);
        String s ="1996年01月01日 10:20:30 星期一";
        Date parse = sdf.parse(s);
        System.out.println("parse "+ sdf.format(parse));
    }
}

class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void cry(){

    }
    class Air{

    }
    public void setHello(String asda){

    }
}
