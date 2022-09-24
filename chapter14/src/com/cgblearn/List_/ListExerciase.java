package com.cgblearn.List_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 * @author cgb
 * @version 1.0
 */
public class ListExerciase {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
         List list = new ArrayList();
        for (int i = 0; i < 12; i++) {
            list.add("hello"+i);
        }
        System.out.println("list="+list);
        System.out.println("=======");
        list.add(1,"韩顺平教育");
        System.out.println("list="+list);
        System.out.println("list number five=" + list.get(4));
        list.remove(5);
        System.out.println("list after remove "+ list);
        list.set(6,"三国演义");
        System.out.println(list);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj="+obj);
        }

        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add("jcak");
        arrayList.add("null");
        System.out.println("arraylist="+arrayList);
        System.out.println(Objects.isNull(arrayList.get(0)));
        System.out.println(arrayList.get(2).getClass());

    }
}
