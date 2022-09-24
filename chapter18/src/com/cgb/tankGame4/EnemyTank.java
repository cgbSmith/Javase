package com.cgb.tankGame4;

import java.util.Vector;

/**
 * @author cgb
 * @version 1.0
 * 敌人的坦克
 */
public class EnemyTank extends Tank implements Runnable {
    Vector<shot> shots = new Vector<>();
    boolean isLive = true;

    public EnemyTank(int x, int y) {
        super(x, y);
    }

    @Override
    public void run() {
        while (true) {
            //判断如果shots 的size（）=0,创建一颗子弹，放入到shots集合，并启动
            if (shots.size() < 3 && isLive) {
                shot s = null;
                //判断坦克的方向，创建子弹
                switch (getDirect()) {
                    case 0:
                        s = new shot(getX() + 20, getY(), 0);
                        break;
                    case 1:
                        s = new shot(getX() + 20, getY() + 20, 1);
                        break;
                    case 2:
                        s = new shot(getX() + 20, getY() + 60, 2);
                        break;
                    case 3:
                        s = new shot(getX(), getY() + 20, 3);
                        break;
                }
                shots.add(s);
                new Thread(s).start();
            }
            //根据坦克方向来继续移动
            switch (getDirect()) {
                case 0:
                    for (int i = 0; i < 30; i++) {
                        if (getY() > 0) {
                            moveUp();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 1:
                    for (int i = 0; i < 30; i++) {
                        if (getX() + 60 < 1000) {
                            moveRight();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < 30; i++) {
                        if (getY() + 60 < 750) {
                            moveDown();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < 30; i++) {
                        if (getX() > 0) {
                            moveLeft();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
            }

            //随机的改变坦克方向
            setDirect((int) (Math.random() * 4));
            //写并发程序，要考虑该线程什么时候结束！！！
            if (!isLive) {
                break;
            }


        }
    }
}
