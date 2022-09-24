package com.cgblearn;

/**
 * @author cgb
 * @version 1.0
 */
public class homeWork02 {
    public static void main(String[] args)  {
        try {
            test();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void test() throws Exception {
        throw new Exception();
    }
}
