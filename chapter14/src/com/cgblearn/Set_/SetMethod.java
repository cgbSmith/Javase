package com.cgblearn.Set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author cgb
 * @version 1.0
 */
public class SetMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Set hashset = new HashSet();
        hashset.add("join");
        hashset.add("lucy");
        hashset.add("join");
        System.out.println(hashset.add("john"));
        hashset.add("null");
        hashset.add("null");
        System.out.println("set="+hashset);
        for (Object o :hashset) {
            System.out.println("o="+o);
        }
        System.out.println("==============");
        Iterator iterator = hashset.iterator();
        while(iterator.hasNext()){
            Object next = iterator.next();
            System.out.println("obj="+next);
        }



    }
}

class Node{
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
