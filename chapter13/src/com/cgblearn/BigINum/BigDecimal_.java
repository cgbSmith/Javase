package com.cgblearn.BigINum;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author cgb
 * @version 1.0
 */
public class BigDecimal_ {
    public static void main(String[] args) {
        BigDecimal d=new BigDecimal("88888888888888888888899.12222222222222222222222222222222222222222222222222222222222222212312312312314138327434371231231");
        System.out.println(d);
        System.out.println(d.add(new BigDecimal("9123123123")));
    }
}
