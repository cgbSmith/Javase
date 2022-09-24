package com.cgb.tankGame3;

import javax.swing.*;

/**
 * @author cgb
 * @version 1.0
 */
public class CgbTankGame03 extends JFrame {
    MyPanel mp = null;
    public static void main(String[] args) {
        CgbTankGame03 cgbTankGame01 = new CgbTankGame03();


    }
    public CgbTankGame03(){
        mp = new MyPanel();
        //将mp放入到Thread中，并启动
        Thread thread = new Thread(mp);
        thread.start();
        this.add(mp);
        this.setSize(1000,750);
        this.addKeyListener(mp);//让JFrame监听map的键盘事件
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
