package com.cgblearn.try_;

import java.util.Scanner;

/**
 * @author cgb
 * @version 1.0
 */
public class TryCathExercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=0;
        while(true){
            System.out.println("请输入一个整数：");
            try {
                num = Integer.parseInt(scanner.next());
//                int temp=scanner.nextInt();
                //若没有抛出异常，说明输入的是可以转换为整数的字符串，因此直接跳出循环
                break;
//            } catch (NumberFormatException e) {
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("输入的不是整数");
            }
        }
        System.out.println("你输入的整数为："+num);

    }
}
