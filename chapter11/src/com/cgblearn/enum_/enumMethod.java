package com.cgblearn.enum_;

/**
 * @author cgb
 * @version 1.0
 */
public class enumMethod {
    public static void main(String[] args) {
        Season2 autumn = Season2.AUTUMN;
        System.out.println(autumn.name());
        System.out.println(autumn.ordinal());
        System.out.println(Season2.SPRING.ordinal());
        Season2[] values = Season2.values();
        for (Season2 season : values) {//增强for循环
            System.out.println(season);
        }
        System.out.println("----------------");
        Season2 autumn1 = Season2.valueOf("AUTUMN");
        System.out.println(autumn1);
        System.out.println(autumn==autumn1);
        //compareTo:比较两个枚举常量，比较的就是编号
        System.out.println(Season2.SUMMER.compareTo(Season2.SPRING));
    }
}