package com.cgb.tankgame2;

import javax.swing.*;

/**
 * @author cgb
 * @version 1.0
 */
public class CgbTankGame02 extends JFrame {
    MyPanel mp = null;
    public static void main(String[] args) {
        CgbTankGame02 cgbTankGame01 = new CgbTankGame02();


    }
    public CgbTankGame02(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(1000,750);
        this.addKeyListener(mp);//让JFrame监听map的键盘事件
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
