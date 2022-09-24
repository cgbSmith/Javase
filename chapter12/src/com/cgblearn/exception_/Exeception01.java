package com.cgblearn.exception_;

/**
 * @author cgb
 * @version 1.0
 */
public class Exeception01 {
    public static void main(String[] args) {

        int num1=10;
        int num2=0;
        try {
            int res = num1 / num2;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
