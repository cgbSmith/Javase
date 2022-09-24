package com.cgb.draw_;

import com.sun.deploy.panel.JavaPanel;
import oracle.jrockit.jfr.JFR;

import javax.swing.*;
import java.awt.*;

/**
 * @author cgb
 * @version 1.0
 * 画出圆形
 */
public class DrawCircle extends JFrame {//JFrame对应窗口,可以裂解为一个画框
    private MyPanel mp = null;

    public static void main(String[] args) {
        new DrawCircle();
    }

    public DrawCircle() {   //  构造器
        mp = new MyPanel();
        this.add(mp);
        this.setSize(600, 600);
        //点击窗口小×，程序完全退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

//定义一个面板，继承JPanel类，画图形
class MyPanel extends JPanel {
    @Override
    //Graphics g可认为是一支画笔
    //Graphics 提供很多方法
    public void paint(Graphics g) {//绘图方法
        super.paint(g);//调用父类方法，完成初始化
        System.out.println("paint被调用");
//        g.drawOval(100, 100, 100, 100);
        //演示绘制不同的图形..
//        g.drawLine(10,10,100,100);
//        g.drawRect(10,10,90,90);
//        g.setColor(Color.blue);
//        g.fillRect(10,10,20,20);
//        g.setColor(Color.red);
//        g.fillOval(10,10,200,200);
        //1.获取图片资源
//        Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bg.png"));
//        g.drawImage(image,10,10,175,221,this);
            g.setColor(Color.red);
            g.setFont(new Font("隶书",Font.BOLD,50));
            g.drawString("北京你好",100,100);//x,y为字符串的左下角的点
    }
}
