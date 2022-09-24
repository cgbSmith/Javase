package com.cgblearn.innerclass_;

public class StaticInnerClass {
    public static void main(String[] args) {
        Outer2 outer = new Outer2();
        outer.m1();
        System.out.println("##############");
        //外部其他类访问内部类方法
        Outer2.Inner10 inner10 = new Outer2.Inner10();
        inner10.say();
        Outer2.Inner10 inner101 = outer.getInner10();
        inner101.say();

        Outer2.getInner10_().say();

    }
}

class Outer2 {
    private int n = 10;
    private static String name = "张三";
    //可以访问外部类的静态成员，不能访问外部类的非静态成员
    public static class Inner10 {
        private String name ="hello";
        public void say() {
            System.out.println(name+"-------"+"外部类的name为： "+Outer2.name);

        }
    }

    public void m1() {
        Inner10 inner10 = new Inner10();
        inner10.say();
    }
    public Inner10 getInner10(){
        return new Inner10();
    }
    public static Inner10 getInner10_(){
        return new Inner10();
    }
}
