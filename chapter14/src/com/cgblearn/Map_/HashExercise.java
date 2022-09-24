package com.cgblearn.Map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author cgb
 * @version 1.0
 */
public class HashExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        hashMap.put(1, new employ("TOM", 10000, 1));
        hashMap.put(2, new employ("CAT", 30000, 2));
        hashMap.put(3, new employ("DOG", 20000, 3));
        Set set = hashMap.keySet();
        for (Object o :set) {
           employ emp = (employ)hashMap.get(o);
           if(emp.getNum()>18000){
               System.out.println(emp.geteNum()+"-"+emp.getName());
           }
        }
        System.out.println("========");
        Set entrySet = hashMap.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry next = (Map.Entry)iterator.next();
//            这里之所以要转换，因为迭代器遍历的对象为Object类对象，所以要向下转型为Map.Entry类对象，
//            Object类中没有getVaule和getKey函数
            System.out.println(iterator.next().getClass());
            System.out.println(next.getClass());
            employ value = (employ) next.getValue();
            if(value.getNum()>18000){
                System.out.println(next.getKey()+"-"+value.getName());
            }
        }

    }
}

class employ {
    private String name;
    private int num;
    private int eNum;

    public employ(String name, int num, int eNum) {
        this.name = name;
        this.num = num;
        this.eNum = eNum;
    }

    @Override
    public String toString() {
        return "employ{" +
                "name='" + name + '\'' +
                ", num=" + num +
                ", eNum=" + eNum +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int geteNum() {
        return eNum;
    }

    public void seteNum(int eNum) {
        this.eNum = eNum;
    }
}
