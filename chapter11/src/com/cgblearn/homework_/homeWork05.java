package com.cgblearn.homework_;

/**
 * @author cgb
 * @version 1.0
 */
public class homeWork05 {
    public static void main(String[] args) {
        new A().f1();

    }
}

class A {
    private String name ="cgblearing";
    public void f1(){
        class B{
            private final String name = "hello";
            void show() {
                System.out.println("inner name = "+name);
                System.out.println( "outer name = "+ A.this.name);
            }
        }
        B b = new B();
        b.show();
    }

}

