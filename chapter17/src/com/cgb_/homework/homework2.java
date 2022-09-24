package com.cgb_.homework;

/**
 * @author cgb
 * @version 1.0
 */
public class homework2 {
    public static void main(String[] args) {
        user user = new user();
        new Thread(user).start();
        new Thread(user).start();
    }
}

//这里设计多个线程共享资源，使用实现Runnable方式
class user implements Runnable {
    public boolean loop = true;
    int money = 10000;
    public static Object object = new Object();

    public void get() {
        if (money > 0) {
            money -= 1000;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("余额为：" + money+"线程名称为： "+Thread.currentThread().getName());
        } else {
            System.out.println("余额不足");
            loop = false;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        while (loop) {
            synchronized (this) {
                get();
            }
        }
    }
}


