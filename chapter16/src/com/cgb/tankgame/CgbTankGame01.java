package com.cgb.tankgame;

import javax.swing.*;

/**
 * @author cgb
 * @version 1.0
 */
public class CgbTankGame01 extends JFrame {
    MyPanel mp = null;
    public static void main(String[] args) {
        CgbTankGame01 cgbTankGame01 = new CgbTankGame01();


    }
    public CgbTankGame01(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(1000,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
