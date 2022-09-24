package com.cgblearn.List_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cgb
 * @version 1.0
 */
public class ListMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("want");
        list.add("to");
        list.add("go");
        list.add("To");
        list.add("be");
        list.add("FREe");
        List list2 = new ArrayList();
        list2.add("我说");
        list2.add("加入");
        System.out.println(list);
        System.out.println(list2);
        list.addAll(list2);
        System.out.println(list);
        System.out.println(list.indexOf("To"));
        list.remove(0);
        System.out.println(list);
        list.set(1,"玛丽");
        System.out.println(list);
        List Lreturn = list.subList(0,3);
        System.out.println(Lreturn );

    }
}
