package com.cgb.tankgame;

import javax.swing.*;
import java.awt.*;

/**
 * @author cgb
 * @version 1.0
 * 坦克大战的绘图区域
 */
public class MyPanel extends JPanel {
    //定义坦克
    Hero hero =null;
    public MyPanel(){
         hero = new Hero(100, 100);//初始化自己的坦克

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);//填充矩形，默认黑色
        //画出坦克-封装到方法中去画坦克
        drawTank(hero.getX(),hero.getY(),g,0,0);
        drawTank(hero.getX()+50,hero.getY(),g,0,1);

    }

    /**
     *
     * @param x 坦克的左上角x坐标
     * @param y 坦克的左上角y坐标
     * @param g 画笔
     * @param direct 坦克的方向，上下左右
     * @param type 坦克的类型，颜色的变化
     */
    public void drawTank(int x, int y,Graphics g, int direct,int type){
        switch (type){
            case 0://我们的坦克
                g.setColor(Color.cyan);
                break;
            case 1://敌人的塔克
                g.setColor(Color.red);
                break;
        }
        //根据坦克的方向，来绘制坦克
        switch (direct){
            case 0://向上的
                g.fill3DRect(x,y,10,60,false);//画出坦克的左边轮子
                g.fill3DRect(x+30,y,10,60,false);//画出坦克的右边的轮子
                g.fill3DRect(x+10,y+10,20,40,false);//画出坦克中间的矩形
                g.fillOval(x+10,y+20,20,20);//画出坦克中间的圆形
                g.drawLine(x+20,y+30,x+20,y);


                break;
            default:
                System.out.println("暂时没有处理");
        }
    }
}
