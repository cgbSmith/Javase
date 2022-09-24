package com.cgblearn.innerclass_;

public class MemberInnerClass {
    public static void main(String[] args) {
        outer outer = new outer();
        outer.use();
        outer.Inner08 inner08 = outer.new Inner08();
        inner08.say();
    }
}

class outer{
    private int n=10;
    public String name ="jacll";
    final class Inner08{
        public void say(){
            System.out.println("hello "+outer.this.name);
        }
    }
    public void use(){
        new Inner08().say();
    }
}