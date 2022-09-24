package com.cgblearn.try_;

/**
 * @author cgb
 * @version 1.0
 */
public class TryCatchDetails {
    public static void main(String[] args) {
        try {
            String str = "chen";
            int a = Integer.parseInt(str);
            System.out.println("数字："+a);
        } catch (NumberFormatException e) {
            System.out.println("异常信息"+e.getMessage());
        }finally {
            System.out.println("finally代码块被执行");
        }
        System.out.println("程序继续执行");
    }
}
