package com.cgb.event;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author cgb
 * @version 1.0
 * 演示小球通过键盘控制上下左右的移动，讲解Java的事件控制
 */
@SuppressWarnings({"all"})
public class BallMove extends JFrame {
    MyPanel mp = null;

    public static void main(String[] args) {
        BallMove ballMove = new BallMove();
    }

    public BallMove() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400, 300);
        //窗口JFrame对象可以监听键盘事件，即可以监听到面板发生的键盘事件
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }


}

//KeyListener是监听器，可以监听键盘事件
class MyPanel extends JPanel implements KeyListener {
    //为了让小球可以移动，将左上角坐标设置为变量
    int x = 10;
    int y = 10;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x, y, 20, 20);//默认黑色
    }

    //有字符输出时，该方法就会被触发
    @Override
    public void keyTyped(KeyEvent e) {

    }

    //当某个键被按下，该方法被触发
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println((char) e.getKeyCode() + "被按下了...");
        //根据用户按下的不同键，来吹小球的移动
        //java中会给每一个键分配一个值(int)
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            y++;
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            y--;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            x--;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            x++;
        }

        //让面板重绘
        this.repaint();
    }

    //当某个键释放(松开)，该方法会触发
    @Override
    public void keyReleased(KeyEvent e) {

    }
}
