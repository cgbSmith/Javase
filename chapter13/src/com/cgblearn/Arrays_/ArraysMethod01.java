package com.cgblearn.Arrays_;

import sun.java2d.pipe.AAShapePipe;

import java.util.Arrays;

/**
 * @author cgb
 * @version 1.0
 */
public class ArraysMethod01 {
    public static void main(String[] args) {
        Integer arr [] ={1,32,123,123,-123};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
