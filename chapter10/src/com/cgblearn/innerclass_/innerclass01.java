package com.cgblearn.innerclass_;

public class innerclass01 {
    public static int n=1;

    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.m1();
    }
}

class Outer02{
    private int n1=100;
    private void m2(){
        System.out.println("outer m2()");
    }
    public void m1(){
        final class inner02{
            public void f1(){
                System.out.println("n1 = "+n1);
                m2();
            }
        }
        inner02 inner02 = new inner02();
        inner02.f1();
    }
}
