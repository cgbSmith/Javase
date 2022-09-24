package com.cgb.tankGame4;

/**
 * @author cgb
 * @version 1.0
 * 炸弹
 */
public class Bomb {
    int x,y;//炸弹的坐标
    int life=9;//炸弹生命周期
    boolean isLive = true; //存活状态

    public Bomb(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //减少生命值
    public void lifeDown(){
        if(life>0){
            life--;
        }else{
            isLive=false;
        }
    }
}
