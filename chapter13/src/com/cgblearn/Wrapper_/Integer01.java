package com.cgblearn.Wrapper_;

/**
 * @author cgb
 * @version 1.0
 */
public class Integer01 {
    public static void main(String[] args) {
        int n =100;
        Integer integer=n;
        int n1= integer;
        String s = integer.toString();
        System.out.println(s);
        char n2='1';
        System.out.println(Character.isDigit(n2));
    }
}
