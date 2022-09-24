package com.cgb_.threaduse;

/**
 * @author cgb
 * @version 1.0
 */
public class Thread02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        //创建Thread对象，把dog对象(实现了Runnable)放入Thread中
        //底层使用了设计模式（代理模式）
        Thread thread = new Thread(dog);
        thread.start();

    }
}

class Dog implements Runnable{
    int count = 0;
    @Override
    public void run() {
        while(true){
            System.out.println("小狗汪汪叫..hi"+(++count)+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(count==10){
                break;
            }
        }
    }
}