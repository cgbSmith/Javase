package com.cgblearn.List_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author cgb
 * @version 1.0
 */
public class ListFor {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack");
        list.add("jack1");
        list.add("jack2");
        list.add("北京烤鸭");
        list.add("鱼香肉丝");
        //遍历方式
        //第一种
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("it="+obj);
        }
        System.out.println("=================");
        //第二种，增强for
        for (Object o : list) {
            System.out.println("o="+o);
        }
        System.out.println("============");
        //第三种传统for循环
        for(int i=0;i<list.size();i++){
            System.out.println("对象="+list.get(i));
        }

    }
}
