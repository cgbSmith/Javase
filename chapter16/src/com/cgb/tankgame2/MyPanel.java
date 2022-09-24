package com.cgb.tankgame2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * @author cgb
 * @version 1.0
 * 坦克大战的绘图区域
 */
//为了监听键盘事件，实现KeyListener
public class MyPanel extends JPanel implements KeyListener {
    //定义坦克
    Hero hero = null;
    //定义敌人的坦克，放入到Vector中
    int enemyTankSize=3;
    Vector<EnemyTank> enemyTanks = new Vector<>();
    public MyPanel() {
        hero = new Hero(100, 100);//初始化自己的坦克
        hero.setSpeed(5);
        //初始化敌人的坦克
        for (int i = 0; i < enemyTankSize; i++) {
            EnemyTank enemyTank = new EnemyTank(100 * (i + 1), 0);
            enemyTank.setDirect(2);
            enemyTanks.add(enemyTank);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);//填充矩形，默认黑色
        //画出坦克-封装到方法中去画坦克
        drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 0);
//        drawTank(hero.getX()+50,hero.getY(),g,0,1);
        //画出敌人的坦克
        for (EnemyTank tank:enemyTanks) {
            drawTank(tank.getX(),tank.getY(),g,tank.getDirect(),1);
        }


    }

    /**
     * @param x      坦克的左上角x坐标
     * @param y      坦克的左上角y坐标
     * @param g      画笔
     * @param direct 坦克的方向，上下左右
     * @param type   坦克的类型，颜色的变化
     */
    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        switch (type) {
            case 0://我们的坦克
                g.setColor(Color.cyan);
                break;
            case 1://敌人的塔克
                g.setColor(Color.red);
                break;
        }
        //根据坦克的方向，来绘制对应形状的坦克
        //0表示向上，1表向右，2表向下，3表向左
        switch (direct) {
            case 0://向上的
                g.fill3DRect(x, y, 10, 60, false);//画出坦克的左边轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//画出坦克的右边的轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//画出坦克中间的矩形
                g.fillOval(x + 10, y + 20, 20, 20);//画出坦克中间的圆形
                g.drawLine(x + 20, y + 30, x + 20, y);
                break;
            case 1://向上的
                g.fill3DRect(x, y, 60, 10, false);//画出坦克的上边边轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//画出坦克的下边的轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//画出坦克中间的矩形
                g.fillOval(x + 20, y + 10, 20, 20);//画出坦克中间的圆形
                g.drawLine(x + 30, y + 20, x + 60, y + 20);
                break;
            case 2://向下的
                g.fill3DRect(x, y, 10, 60, false);//画出坦克的左边轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//画出坦克的右边的轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//画出坦克中间的矩形
                g.fillOval(x + 10, y + 20, 20, 20);//画出坦克中间的圆形
                g.drawLine(x + 20, y + 30, x + 20, y + 60);
                break;
            case 3://向左的
                g.fill3DRect(x, y, 60, 10, false);//画出坦克的上边边轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//画出坦克的下边的轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//画出坦克中间的矩形
                g.fillOval(x + 20, y + 10, 20, 20);//画出坦克中间的圆形
                g.drawLine(x + 30, y + 20, x, y + 20);

                break;
            default:
                System.out.println("暂时没有处理");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //处理wdsa 键按下的情况
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            //改变坦克的方向
            hero.setDirect(0);
            hero.moveUp();
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            hero.setDirect(1);
            hero.moveRight();
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            hero.setDirect(2);
            hero.moveDown();
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            hero.setDirect(3);
            hero.moveLeft();
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
