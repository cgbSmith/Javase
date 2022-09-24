package com.cgblearn.homework_;

/**
 * @author cgb
 * @version 1.0
 */
public class homework06 {
    public static void main(String[] args) {
        Person tang = new Person("唐僧",new Boat());
        tang.common();
        tang.common();
        tang.passRiver();
        tang.passRiver();
        tang.common();
        tang.fireMoutain();

    }
}

interface Vehicles {
    void work();
}

class Horse implements Vehicles {

    @Override
    public void work() {
        System.out.println("一般情况下，使用马为交通工具");
    }
}

class Boat implements Vehicles {
    @Override
    public void work() {
        System.out.println("特殊情况下，使用船为交通工具");
    }
}
class Plane implements Vehicles{

    @Override
    public void work() {
        System.out.println("遇到火焰山，使用飞机过去");
    }
}

class Factory {
    private Factory() {
    }

    private static Horse horse = new Horse();
    //将方法做成static较为方便，不用创建对象就可以调用方法
    public static Horse getHorse() {
        return horse;
    }

    public static Boat getBoat() {
        return new Boat();
    }
    public static Plane getPlane(){
        return new Plane();
    }
}


class Person {
    private String name;
    private Vehicles vhl;

    public Person(String name, Vehicles vhl) {
        this.name = name;
        this.vhl = vhl;
    }

    //----------!!!编程思想！
    public void passRiver() {
        if (!(vhl instanceof Boat)) {
            vhl = Factory.getBoat();
        }
        vhl.work();
     }

    public void common() {
        if (!(vhl instanceof Horse)) {
            vhl = Factory.getHorse();
        }
        vhl.work();
    }

    public void fireMoutain(){
        if(!(vhl instanceof Plane)){
            vhl = Factory.getPlane();
        }
        vhl.work();
    }


}

