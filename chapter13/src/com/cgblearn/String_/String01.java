package com.cgblearn.String_;

/**
 * @author cgb
 * @version 1.0
 */
public class String01 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "Hello";
        String str3 = "pinjie";
        System.out.println(str1.equals(str2));
        System.out.println("wo操".length());
        System.out.println(str1.hashCode());
        str1=str1.concat("");
        System.out.println(str1.hashCode());
        str1 = str1.concat("ads").concat("dasd");
        System.out.println(str1.hashCode());
        String name = "name name want here";
        System.out.println("-----"+name.hashCode());
        name = name.replace("name","change");
        System.out.println("--------"+name.hashCode());
//        name.split()

        String test="hello";
        System.out.println(test.hashCode());
        test = "hellp";
        System.out.println(test.hashCode());
    }
}
