package com.cgblearn.innerclass_;

import com.sun.javaws.IconUtil;

public class InnerClassExercise02 {
    public static void main(String[] args) {
        new Cellphone().alarmClock(new Bell(){
            @Override
            public void ring() {
                System.out.println("懒猪起床啦");
            }
        });
        new Cellphone().alarmClock(new Bell(){
            @Override
            public void ring() {
                System.out.println("小伙伴上课了");
            }
        });
    }
}

interface Bell{
    public void ring();
}
class Cellphone{
    public void alarmClock(Bell bell){
        bell.ring();
    }
}