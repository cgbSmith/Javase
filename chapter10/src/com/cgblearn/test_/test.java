package com.cgblearn.test_;

public class test {
    public static void main(String[] args) {
        Test2 test1 = new Test2();
    }
}

class Test2{
    public Test2() {
        System.out.println("构造器执行");
    }
    {
        System.out.println("代码块执行");
    }
}