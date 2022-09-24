package com.cgb_.threaduse;

/**
 * @author cgb
 * @version 1.0
 */
public class Thread01 {
    public static void main(String[] args) throws InterruptedException {
        //创建Cat对象，当做线程使用
        Cat cat = new Cat();
        cat.start();
        System.out.println("主线程会继续执行"+Thread.currentThread().getName());
       //主线程和子线程会交替执行
        for (int i = 0; i < 60; i++) {
            System.out.println("主线程i = " + i);
            Thread.sleep(1000);
        }
    }
}
//当一个类继承了Thread类，该类可以当做线程使用。
//重写run方法，写上自己的业务代码
//run Thread类实现了 Runable 接口的run方法
class Cat extends Thread{
    int times = 0;
    @Override
    public void run() {//往往会重写run方法，写上自己的业务逻辑
        while (true) {
            System.out.println("喵喵，我是小猫咪"+(++times)+"线程名="+
                    Thread.currentThread().getName());
            //线程休眠1秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(times == 80){
                //退出while循环，这时候线程也就退出
                break;
            }
        }
    }
}