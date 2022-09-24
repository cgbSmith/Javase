package com.cgblearn.collection_;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author cgb
 * @version 1.0
 */
public class Collections_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("tom");
        list.add("tam");
        list.add("smith");
        list.add("king");
        list.add("milan");
        Collections.reverse(list);
        System.out.println("List="+list);
//        for (int i = 0; i < 5; i++) {
//            Collections.shuffle(list);
//            System.out.println("List="+list);
//        }
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o2).length()-((String)o1).length();
            }
        });
        System.out.println("字符串长度大小排序="+list);

        Collections.swap(list,1,2);
        System.out.println(list);
        System.out.println("最大的元素="+Collections.max(list));
        Object max = Collections.max(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        System.out.println("长度最大的元素"+max);

        System.out.println("Tom出现的次数="+Collections.frequency(list,"tom"));
    }
}
