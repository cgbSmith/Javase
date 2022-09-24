package com.cgblearn.innerclass_;

/**
 * @author cgb
 * @version 1.0
 */
public class TestTheMaker {
    public static void main(String[] args) {
        Father father = new Father("jack"){
//            super.Father("jack");
            public void test(){
                System.out.println("重写的test方法");
            }};
        father.test();
            new Father(){
              public void test(){
                    System.out.println("无参数Father类的内部类创建");
                }
            }.test();


        };
    }


class Father{
    public Father(String name){
        System.out.println("接收到name="+name);
    }
    public Father(){
        System.out.println("father无参构造函数");
    }
    public void test(){}
}
