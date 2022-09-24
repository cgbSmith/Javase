package com.cgblearn.encap;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("jackdddddddd");
        person.setAge(300);
        person.setSalary(10000);
        System.out.println(person.info());



    }
}

class Person{
    public String name;
    private int age;
    private double salary;
  //使用快捷键


    public Person() {
    }

    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        //将set方法写在构造器中，仍然可以验证
        this.setSalary(salary);
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()>=2&&name.length()<=6){
        this.name = name;
        }else{
            System.out.println("名字长度不对，使用默认名字");
            this.name="noname";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=1&&age<=120){
        this.age = age;
        }else{
            System.out.println("年龄需要在2-120");
            this.age=18;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //写方法，返回属性信息
    public String info(){
        return "信息为 name="+name+" age="+age+
                " salary="+salary;
    }
}