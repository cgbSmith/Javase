package com.cgblearn.homework_;

/**
 * @author cgb
 * @version 1.0
 */
public class homeWork04 {
    public static void main(String[] args) {
       new Cellphone().testWork(new ifc(){
            @Override
            public void work(double n1,double n2) {

                System.out.println("result is :" +(n1+n2));
                System.out.println("手机工作ing");
            }
        },10,20);
    }
}

interface ifc{
   void work(double n1,double n2);
}

class Cellphone {

    public void testWork(ifc ifci,double n1,double n2){
        ifci.work(n1,n2);
    }
}
