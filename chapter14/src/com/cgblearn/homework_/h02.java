package com.cgblearn.homework_;

import java.util.*;

/**
 * @author cgb
 * @version 1.0
 */
public class h02 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        hashMap.put("jack",600);
        hashMap.put("tom",1200);
        hashMap.put("smith",2900);
        System.out.println(hashMap);
        hashMap.put("jack",2600);
        Set set = hashMap.keySet();
        for (Object o :set) {
            hashMap.put(o,(Integer)hashMap.get(o)+100);
        }
        System.out.println(hashMap);
        Set entrySet = hashMap.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry next = (Map.Entry)iterator.next();
            System.out.println(next.getKey()+"-"+next.getValue());
        }

    }
}
