package com.cgblearn.enum_;

/**
 * @author cgb
 * @version 1.0
 */
public class EnumExercise02 {
    public static void main(String[] args) {
        Week[] values = Week.values();
        for(Week i : values){
            System.out.println(i.getClass());
            System.out.println(i.toString());
        }
    }

}
enum Week{
    MONDAY("星期一",1),
    TUESDAY("星期二",2),
    WEDNESDAY("星期三",3),
    THURSDAY("星期四",4),
    FRIDAY("星期五",5),
    SATURDAY("星期六",6),
    SUNDAY("星期天",7)
    ;
    private String day;
    private int num;

    Week(String day, int num) {
        this.day = day;
        this.num = num;
    }

    @Override
    public String toString() {
        return  day +", "+num;
    }
}


