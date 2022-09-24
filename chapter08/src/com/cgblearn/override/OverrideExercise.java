package com.cgblearn.override;

public class OverrideExercise {
    public static void main(String[] args) {
        Person jack = new Person("jack", 10);
        System.out.println(jack.say());
        Student smith = new Student("smith", 10, 30, 100.0);
        System.out.println(smith.say());

    }
}
