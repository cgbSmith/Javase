package com.cgblearn.enum_;

/**
 * @author cgb
 * @version 1.0
 */
public class EnumExercise01 {
    public static void main(String[] args) {
        Gender boy = Gender.BOY;
        System.out.println(boy);
        System.out.println(Gender.GIRL);
    }
}
enum Gender{
    BOY,GIRL("hello");
    private Gender(){}
    private Gender(String name){this.name = name;}
    private String name;
}
