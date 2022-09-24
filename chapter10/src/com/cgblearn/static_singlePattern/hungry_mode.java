package com.cgblearn.static_singlePattern;

public class hungry_mode {
    public static void main(String[] args) {
        System.out.println(GirlFriend.n);
    }
}

class GirlFriend {
    public static int n = 10;
    private static GirlFriend gf = new GirlFriend();

    private GirlFriend() {
        System.out.println("饿汉式构造函数执行");
    }

    public static GirlFriend getInstance() {
        return gf;
    }


}