package com.cgb_.homework;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author cgb
 * @version 1.0
 */
public class homework01 {
    public static void main(String[] args) {
        printA A = new printA();
        printB B = new printB(A);
        A.start();
        B.start();
    }
}

class printA extends Thread {
    private boolean loop = true;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        while (loop) {
            //打印100以内的整数
            System.out.println((int) (Math.random() * 100 + 1));
            //休眠一秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class printB extends Thread {
    private printA a;
    private Scanner scanner = new Scanner(System.in);

    public printB(printA a) {
        this.a = a;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("请输入你的指令,Q表示退出");
            char key = scanner.next().toUpperCase().charAt(0);
            if (key == 'Q') {
                //已通知的方式结束A线程
                a.setLoop(false);
                System.out.println("printB线程退出");
                break;
            }
        }
    }
}
