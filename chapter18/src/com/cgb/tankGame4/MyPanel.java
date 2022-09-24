package com.cgb.tankGame4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * @author cgb
 * @version 1.0
 * 坦克大战的绘图区域
 */
//为了监听键盘事件，实现KeyListener
//为了让panel不停重绘子弹，需要将Mypanel实现Runnable，当做一个线程使用
public class MyPanel extends JPanel implements KeyListener, Runnable {
    //定义坦克
    Hero hero = null;
    //定义敌人的坦克，放入到Vector中
    int enemyTankSize = 3;
    Vector<EnemyTank> enemyTanks = new Vector<>();
    //定义一个Vector,存放炸弹
    //当子弹击中坦克时，加入一个Bomb对象到bombs
    Vector<Bomb> bombs = new Vector<>();
    //定义三张炸弹图片，用于显示爆炸效果
    Image image1 = null;
    Image image2 = null;
    Image image3 = null;

    public MyPanel() {
        hero = new Hero(500, 100);//初始化自己的坦克
        hero.setSpeed(5);
        //初始化敌人的坦克
        for (int i = 0; i < enemyTankSize; i++) {
            EnemyTank enemyTank = new EnemyTank(100 * (i + 1), 0);
            enemyTank.setDirect(2);
            //启动敌人坦克线程，让他动起来
            new Thread(enemyTank).start();
            //给enemyTank加入一颗子弹
            shot shot = new shot(enemyTank.getX() + 20, enemyTank.getY() + 60, enemyTank.getDirect());
            //加入enemyTank的Vector成员
            enemyTank.shots.add(shot);
            new Thread(shot).start();
            enemyTanks.add(enemyTank);
        }
        //初始化图片对象
        image1 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_1.gif"));
        image2 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_2.gif"));
        image3 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_3.gif"));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);//填充矩形，默认黑色
        //画出坦克-封装到方法中去画坦克
        if (hero != null && hero.isLive) {
            drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 0);
        }
//        drawTank(hero.getX()+50,hero.getY(),g,0,1);
        //画出敌人的坦克
        for (EnemyTank tank : enemyTanks) {
            if (tank.isLive) {//当敌人坦克是存活的，才画出该坦克
                drawTank(tank.getX(), tank.getY(), g, tank.getDirect(), 1);
                //画出敌人坦克的子弹，遍历Vector
                for (int j = 0; j < tank.shots.size(); j++) {
                    //取出子弹
                    shot shot = tank.shots.get(j);
                    //绘制子弹
                    if (shot.isLive) {
                        g.setColor(Color.red);
                        g.draw3DRect(shot.x, shot.y, 3, 3, false);
                    } else {
                        //从vector中移出子弹
                        tank.shots.remove(shot);
                    }
                }
            }

        }


        //画出射击的子弹
        if (hero.shot != null && hero.shot.isLive != false) {
            System.out.println("子弹被绘制..");
            g.setColor(Color.cyan);
            g.draw3DRect(hero.shot.x, hero.shot.y, 3, 3, false);
            //g.fill3DRect(hero.shot.x, hero.shot.y, 6, 6, false);
        }
        //画出hero设计的全部子弹，shots遍历取出绘制
//        for (int i = 0; i < hero.shots.size(); i++) {
//            shot shot = hero.shots.get(i);
//            if (shot != null && shot.isLive != false) {
//                System.out.println("子弹被绘制..");
//                g.setColor(Color.cyan);
//                g.draw3DRect(shot.x, shot.y, 3, 3, false);
////            //g.fill3DRect(hero.shot.x, hero.shot.y, 6, 6, false);
//            } else {
//                //子弹对象无效，从shots集合中拿掉
//                hero.shots.remove(shot);
//            }
//        }

        //如果bombs集合中有对象，就画出
        for (int i = 0; i < bombs.size(); i++) {
            Bomb bomb = bombs.get(i);
            if (bomb.life > 6) {
                g.drawImage(image1, bomb.x, bomb.y, 60, 60, this);
            } else if (bomb.life > 3) {
                g.drawImage(image2, bomb.x, bomb.y, 60, 60, this);
            } else {
                g.drawImage(image3, bomb.x, bomb.y, 60, 60, this);
            }
            //让炸弹生命值减少
            bomb.lifeDown();
            //如果bomb life为0，就从bombs集合中删除
            if (bomb.life == 0) {
                bombs.remove(bomb);
            }
        }


    }

    /**
     * @param x      坦克的左上角x坐标
     * @param y      坦克的左上角y坐标
     * @param g      画笔
     * @param direct 坦克的方向，上下左右
     * @param type   坦克的类型，颜色的变化
     */
    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        switch (type) {
            case 0://我们的坦克
                g.setColor(Color.cyan);
                break;
            case 1://敌人的塔克
                g.setColor(Color.red);
                break;
        }
        //根据坦克的方向，来绘制对应形状的坦克
        //0表示向上，1表向右，2表向下，3表向左
        switch (direct) {
            case 0://向上的
                g.fill3DRect(x, y, 10, 60, false);//画出坦克的左边轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//画出坦克的右边的轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//画出坦克中间的矩形
                g.fillOval(x + 10, y + 20, 20, 20);//画出坦克中间的圆形
                g.drawLine(x + 20, y + 30, x + 20, y);
                break;
            case 1://向上的
                g.fill3DRect(x, y, 60, 10, false);//画出坦克的上边边轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//画出坦克的下边的轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//画出坦克中间的矩形
                g.fillOval(x + 20, y + 10, 20, 20);//画出坦克中间的圆形
                g.drawLine(x + 30, y + 20, x + 60, y + 20);
                break;
            case 2://向下的
                g.fill3DRect(x, y, 10, 60, false);//画出坦克的左边轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//画出坦克的右边的轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//画出坦克中间的矩形
                g.fillOval(x + 10, y + 20, 20, 20);//画出坦克中间的圆形
                g.drawLine(x + 20, y + 30, x + 20, y + 60);
                break;
            case 3://向左的
                g.fill3DRect(x, y, 60, 10, false);//画出坦克的上边边轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//画出坦克的下边的轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//画出坦克中间的矩形
                g.fillOval(x + 20, y + 10, 20, 20);//画出坦克中间的圆形
                g.drawLine(x + 30, y + 20, x, y + 20);

                break;
            default:
                System.out.println("暂时没有处理");
        }
    }

    //所有的子弹，都取出和敌人的坦克进行判断
    public void hitEnemyTank() {
        //遍历我们的子弹
//        for (int j = 0; j < hero.shots.size(); j++) {
//            shot shot = hero.shots.get(j);
//            if (shot != null && shot.isLive) {//子弹还存活
//                //遍历敌人所有坦克
//                for (int i = 0; i < enemyTanks.size(); i++) {
//                    EnemyTank enemyTank = enemyTanks.get(i);
//                    hitTank(shot, enemyTank);
//                }
//            }
//        }
        //单颗子弹
        if (hero.shot != null && hero.shot.isLive) {//子弹还存活
            //遍历敌人所有坦克
            for (int i = 0; i < enemyTanks.size(); i++) {
                EnemyTank enemyTank = enemyTanks.get(i);
                hitTank(hero.shot, enemyTank);
            }
        }
    }

    //编写方法，判断敌人坦克是否击中我的坦克
    public void hitHero() {
        //遍历所有的敌人坦克
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            //遍历enemyTank的所有子弹
            for (int j = 0; j < enemyTank.shots.size(); j++) {
                //取出子弹
                shot shot = enemyTank.shots.get(j);
                //判断shot是否击中我的坦克
                if (hero.isLive && shot.isLive) {
                    hitTank(shot, hero);
                }
            }
        }
    }

    //编写方法，判断子弹是否击中敌人坦克,放在run方法中判断
    public void hitTank(shot s, Tank enemyTank) {
        //判断s是否击中坦克
        switch (enemyTank.getDirect()) {
            case 0://坦克向上放
            case 2://坦克向下放
                if (s.x > enemyTank.getX() && s.x < enemyTank.getX() + 40
                        && s.y > enemyTank.getY() && s.y <= enemyTank.getY() + 60) {
                    s.isLive = false;
                    enemyTank.isLive = false;
                    //当我们的子弹，击中敌人坦克后，将enemyTank从集合中去掉
                    enemyTanks.remove(enemyTank);
                    //创建Bomb对象，加入到bombs集合中
                    Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                    bombs.add(bomb);
                }
                break;
            case 1://坦克向右
            case 3://坦克向左
                if (s.x > enemyTank.getX() && s.x < enemyTank.getX() + 60 &&
                        s.y > enemyTank.getY() && s.y < enemyTank.getY() + 40) {
                    s.isLive = false;
                    enemyTank.isLive = false;
                    Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                    bombs.add(bomb);
                }


        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //处理wdsa 键按下的情况
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            //改变坦克的方向
            hero.setDirect(0);
            if (hero.getY() > 0) {
                hero.moveUp();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            hero.setDirect(1);
            if (hero.getX() + 60 < 1000) {
                hero.moveRight();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            hero.setDirect(2);
            if (hero.getY() + 60 < 750) {
                hero.moveDown();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            hero.setDirect(3);
            if (hero.getX() > 0) {
                hero.moveLeft();
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_J) {
            System.out.println("用户按下J键，开始射击");
            //判断hero的子弹是否消亡
            //发射一颗子弹的情况
            if (hero.shot == null || !hero.shot.isLive) {
                hero.shotEnemyTank();
            }
            //发射多颗子弹
//            hero.shotEnemyTank();
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {
        //每个一定事件，自己重绘区域
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //判断敌人坦克是否被击中
            hitEnemyTank();
            //判断敌人坦克是否击中我
            hitHero();
//            hitEnemyTank();
            this.repaint();
        }
    }
}
