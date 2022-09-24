package com.cgblearn.static_;

public class childGame {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        childGame cgk =new childGame();
        child child1 = new child("白骨精");
        child1.join();
        child1.count++;
        child child2 = new child("狐狸精");
        child2.join();
        child2.count++;
        child child3 = new child("老鼠精");
        child3.join();
        child3.count++;
        System.out.println("共有"+child1.count+"各孩子在玩");
    }
}

class child{
    private String name;
    public static int count;
    public child(String name) {
        this.name = name;
    }
    public void join(){
        System.out.println(name+" join the ganme");
    }
}