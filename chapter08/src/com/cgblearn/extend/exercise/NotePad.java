package com.cgblearn.extend.exercise;

public class NotePad extends Computer{
    private String color;

    public NotePad(String cpu, int memory, int disk, String color) {
        super(cpu, memory, disk);
        this.color = color;
    }
    public void printInfo(){
        System.out.println("NotePad信息如下：");
        System.out.println(getDetails()+" color="+color);
    }
}
