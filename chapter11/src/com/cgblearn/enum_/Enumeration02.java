package com.cgblearn.enum_;

/**
 * @author cgb
 * @version 1.0
 */
public class Enumeration02 {
public static void main(String[] args) {
    System.out.println(Season.SPIRNG.getDesc());
}
}

class Season{
    private String name;
    private String desc;
    public final static Season SPIRNG = new Season("春天", "温暖");
    public final static Season SUMMER = new Season("夏天", "炎热");
    public final static Season AUTUMN = new Season("秋天", "凉爽");
    public final static Season WINTER = new Season("冬天", "寒冷 ");

    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
}

