package com.cgblearn.Arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author cgb
 * @version 1.0
 */
public class TestBubble {
    public static void main(String[] args) {
        Integer arr[] = {1, -1, 7, 0, 89};
        int a[]={12,12,3,1,2};

        bubble(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int n1 = (Integer)o1;
                int n2 =(Integer)o2;
                return n1-n2;
            }
        });

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(arr));
    }
    public static void bubble(Integer[] arry, Comparator c){
        int temp =0;
        for (int i = 0; i < arry.length-1; i++) {
            for(int j=0;j<arry.length-1-i;j++){
                if(c.compare(arry[j],arry[j+1])>0){
                    temp=arry[j];
                    arry[j]=arry[j+1];
                    arry[j+1]=temp;
                }
            }
        }
    }
}
