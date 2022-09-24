package com.cgb.tankGame4;

import javax.swing.*;

/**
 * @author cgb
 * @version 1.0
 */
public class CgbTankGame04 extends JFrame {
    MyPanel mp = null;
    public static void main(String[] args) {
        CgbTankGame04 cgbTankGame01 = new CgbTankGame04();


    }
    public CgbTankGame04(){
        mp = new MyPanel();
        //将mp放入到Thread中，并启动
        Thread thread = new Thread(mp);
        thread.start();
        this.add(mp);
        this.setSize(1200,950);
        this.addKeyListener(mp);//让JFrame监听map的键盘事件
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
