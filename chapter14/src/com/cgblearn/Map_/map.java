package com.cgblearn.Map_;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author cgb
 * @version 1.0
 */
public class map {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
//        HashMap hashMap = new HashMap();
        hashMap.put("wanNi","woDe");
        hashMap.put("10","22");
        Set set = hashMap.entrySet();
        System.out.println("entryset class="+set.getClass());
//        System.out.println(hashMap);
        for (Object o :set) {
            System.out.println(o.getClass());
            Map.Entry entry =  (Map.Entry)o;
//            Map.Entry entry =  ()o;

//            System.out.println("=="+entry.getClass());
        }
        Set set1 = hashMap.keySet();
        System.out.println(set1);
        Collection values = hashMap.values();
        System.out.println(values);

    }
}
