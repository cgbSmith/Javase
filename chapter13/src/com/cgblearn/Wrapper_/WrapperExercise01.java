package com.cgblearn.Wrapper_;

/**
 * @author cgb
 * @version 1.0
 */
public class WrapperExercise01 {
    public static void main(String[] args) {
        Object obj = true? new Integer(1):new Double(2.0);
        System.out.println(obj);
        String str ="123";
        Integer i = new Integer(str);
    }
}
