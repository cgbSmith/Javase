package com.cgblearn.enum_;

/**
 * @author cgb
 * @version 1.0
 */
public class Enumeration03 {
    public static void main(String[] args) {
        System.out.println(Season2.SPRING);

    }
}
enum Season2{
    SPRING("春天", "温暖"),WINTER("冬天", "寒冷 "),
    AUTUMN("秋天", "凉爽"),SUMMER("夏天","炎热");
    private String name;
    private String desc;
    private Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }



    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season2{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
