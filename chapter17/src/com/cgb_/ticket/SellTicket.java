package com.cgb_.ticket;

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
@SuppressWarnings({"all"})
class selltickets implements Runnable{
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
