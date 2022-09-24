package com.cgblearn.Debug;

import java.util.Arrays;

public class debug02 {
    public static void main(String[] args) {
        int[]arr = {1, -1, 23, 123, 41, 231};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"\t");
        }
    }
}
