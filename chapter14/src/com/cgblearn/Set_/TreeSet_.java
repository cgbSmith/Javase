package com.cgblearn.Set_;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author cgb
 * @version 1.0
 */
public class TreeSet_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
//        TreeSet treeSet = new TreeSet(c);
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).compareTo((String)o2);
            }
        });
        treeSet.add("jcak");
        treeSet.add("bbk");
        treeSet.add("xxxak");
        treeSet.add("xxxak");
        treeSet.add("iiik");


        System.out.println("treeset="+treeSet);



    }

}
