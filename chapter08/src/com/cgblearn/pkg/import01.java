package com.cgblearn.pkg;

import java.util.Arrays;

public class import01 {
    public static void main(String[] args) {
        int[] arr={-1,20,2,31,123,41,132};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        
    }
}
