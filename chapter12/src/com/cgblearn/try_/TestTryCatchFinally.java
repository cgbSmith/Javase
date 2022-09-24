package com.cgblearn.try_;

/**
 * @author cgb
 * @version 1.0
 */
public class TestTryCatchFinally {
    public static void main(String[] args) {
        int n=10;
        int m=0;
        try {
            int sum =n/m;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally execute");
        }
    }
}
