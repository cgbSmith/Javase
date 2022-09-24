package com.cgblearn.poly.polymaster;

public class PolyParameter {
    public static void main(String[] args) {
        Worker tom = new Worker("tom", 2500);
        Manager milan = new Manager("milan", 5000, 200000);
        PolyParameter polyParameter = new PolyParameter();
        polyParameter.showEmpAnnual(tom);
        polyParameter.testWork(tom);
        polyParameter.showEmpAnnual(milan);
        polyParameter.testWork(milan);
        String a="sada";
        a.equals("hhelo");

    }
    public void showEmpAnnual(Employee e){
        System.out.println(e.getAnnual());}
    public void testWork(Employee e){
        if(e instanceof Worker){
            ((Worker)e).work();
        }else if(e instanceof Manager){
            ((Manager) e).manage();
        }else{
            System.out.println("不做处理");
        }

    }

}
