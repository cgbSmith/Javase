package com.cgb_.syn;

/**
 * @author cgb
 * @version 1.0
 */
public class SellTicket {
    public static void main(String[] args) {
//        SellTicker01 sellTicker01 = new SellTicker01();
//        SellTicker01 sellTicker02 = new SellTicker01();
//        SellTicker01 sellTicker03 = new SellTicker01();
//        sellTicker01.start();
//        sellTicker02.start();
//        sellTicker03.start();
        selltickets selltickets = new selltickets();
        new Thread(selltickets).start();
        new Thread(selltickets).start();
        new Thread(selltickets).start();
    }
}

//使用Thread方式
class SellTicker01 extends Thread {
    private static int TicketsNum = 100;

    @Override
    public void run() {
        while (true) {
            if (TicketsNum <= 0) {
                System.out.println("售票结束...");
                break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口 " + Thread.currentThread().getName() + " 售出一张票"
                    + " 剩余票数= " + (--TicketsNum));
        }
    }
}


//使用实现接口方式
//会用synchronized实现线程同步
@SuppressWarnings({"all"})
class selltickets implements Runnable {
    private static int TicketsNum = 100;
    private boolean loop = true;
    public synchronized void sell() {//同步方法，同一时刻，最多只能有一个线程来执行run方法
        if (TicketsNum <= 0) {
            System.out.println("售票结束...");
            loop=false;
            return;
        }
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("窗口 " + Thread.currentThread().getName() + " 售出一张票"
                + " 剩余票数= " + (--TicketsNum));
    }

    @Override
    public void run() {
        while (loop) {
            sell();
        }
    }
}
