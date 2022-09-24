package com.cgb_.exit_;

/**
 * @author cgb
 * @version 1.0
 */
public class ThreadExit {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.start();
        //main线程控制t线程终止，必须可以修改loop
       Thread.sleep(10*1000);
        t.setLoop(false);
    }
}

/**
 *
 */
class T extends Thread{
    int count =0;
    private boolean loop = true;
    @Override
    public void run() {
        while(loop){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 运行中..."+(++count));
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}