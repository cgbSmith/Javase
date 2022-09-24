package com.cgb.tankGame3;

/**
 * @author cgb
 * @version 1.0
 * 射击子弹
 */
public class shot implements Runnable {
    int x;//子弹的x坐标
    int y;//子弹的y左边
    int direct = 0;//子弹方向
    int speed = 2;//子弹速度
    boolean isLive = true;//子弹是否存活

    public shot(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    @Override
    public void run() {//射击行为
        while (true) {
            try {
                //休眠50ms
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //根据方向改变x，y坐标
            switch (direct) {
                case 0://up
                    y -= speed;
                    break;
                case 1://right
                    x += speed;
                    break;
                case 2://down
                    y += speed;
                    break;
                case 3://left
                    x -= speed;
                    break;
            }
            System.out.println("子弹x=" + x + " y=" + y);
            //子弹遇到面板的边界时，就应该销毁
            if (!(x >= 0 && x <= 1000 && y >= 0 && y <= 750)) {
                isLive =false;
                System.out.println("子弹线程退出");
                break;
            }

        }
    }
}
