package com.cgb.tankGame4;

import java.util.Vector;

/**
 * @author cgb
 * @version 1.0
 * 自己的坦克
 */
@SuppressWarnings({"all"})
public class Hero extends Tank {
    //定义shot对象
    com.cgb.tankGame4.shot shot = null;
    // 可以发射多颗子弹
//    Vector<shot>shots=new Vector<>();
    public Hero(int x, int y) {
        super(x, y);
    }
    public void shotEnemyTank(){
        //最多只能发射五颗子弹
//        if(shots.size()==5){
//            return;
//        }
        switch (getDirect()){//得到hero对象的方向
            case 0://up
                shot = new shot(getX()+20,getY(),0);
                break;
            case 1://right
                shot = new shot(getX()+60,getY()+20,1);
                break;
            case 2://down
                shot = new shot(getX()+20,getY()+60,2);
                break;
            case 3://left
                shot = new shot(getX(),getY()+20,3);
                break;
        }
        //把新建的一个子弹加入到线程中。
//        shots.add(shot);
        //启动我们的shot线程
        new Thread(shot).start();
    }
}
