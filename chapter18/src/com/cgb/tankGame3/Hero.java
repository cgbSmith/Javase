package com.cgb.tankGame3;

/**
 * @author cgb
 * @version 1.0
 * 自己的坦克
 */
public class Hero extends Tank {
    //定义shot对象
    shot shot = null;
    public Hero(int x, int y) {
        super(x, y);
    }
    public void shotEnemyTank(){
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
        //启动我们的shot线程
        new Thread(shot).start();
    }
}
