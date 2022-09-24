package com.cgblearn.HashTable;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * @author cgb
 * @version 1.0
 */
public class hashTable_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put(1, 2);
        Hashtable hashtable = new Hashtable();
        hashtable.put(2, 4);
        System.out.println(hashtable.get(2));


    }
}