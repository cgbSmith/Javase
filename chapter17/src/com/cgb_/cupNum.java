package com.cgb_;

/**
 * @author cgb
 * @version 1.0
 */
public class cupNum {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        //获取当前电脑的cpu数量
        int cpuNums = runtime.availableProcessors();
        System.out.println("cpu核数为： "+cpuNums);

    }
}
