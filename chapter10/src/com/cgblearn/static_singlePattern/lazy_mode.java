package com.cgblearn.static_singlePattern;

public class lazy_mode {
    public static void main(String[] args) {
        System.out.println(Boy.getInstance());
    }
}
class Boy{
    public static int m=10;
    private Boy(){
        System.out.println("懒汉式构造函数执行");
    }
    private static Boy boy;
    public static Boy getInstance(){
        if(boy==null){
            boy=new Boy();
        }
        return boy;
    }
}
