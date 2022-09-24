package com.cgblearn.innerclass_;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        AnonymousInnerClass anonymousInnerClass = new AnonymousInnerClass();
        anonymousInnerClass.m1();
        System.out.println("外部类调用对象的hashcode为"+anonymousInnerClass);
    }

    private int n=100;
    public  void m1() {
        IA ia = new IA() {
            private int n=200;
            @Override
            public void cry() {
                System.out.println("IA 内部类嗷嗷叫");
                System.out.println("内部类的n"+n);
                System.out.println("外部类的n"+AnonymousInnerClass.this.n);
                System.out.println("内部类调用对象的hashcode是"+AnonymousInnerClass.this);
            }
        };
         new bee("jack") {
            @Override
            public void shout() {
                System.out.println("bee 内部类嗷嗷叫");
            }
        }.shout();
        ia.cry();
    }
}

interface IA {
    public void cry();
}

class bee {
    public bee(String name) {
        System.out.println("bee name is" + name);
    }

    public void shout() {
    }

}

class Tiger implements IA {

    @Override
    public void cry() {
        System.out.println("老虎在叫。。。");
    }
}