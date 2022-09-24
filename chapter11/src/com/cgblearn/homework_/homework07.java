package com.cgblearn.homework_;

/**
 * @author cgb
 * @version 1.0
 */
public class homework07 {
    public static void main(String[] args) {
        new Car2(60).getAir().flow();
        new Car2(-1).getAir().flow();
        new Car2(30).getAir().flow();
    }
}

class Car2{
    public Car2(int temperature) {
        this.temperature = temperature;
    }

    private int temperature;
    class Air{
       public void flow(){
            if(temperature>40){
                System.out.println("吹冷气");
            }else if(temperature<0){
                System.out.println("吹暖气");
            }else{
                System.out.println("空调关闭");
            }
        }
    }
    public Air getAir(){
        return new Air();
    }
}