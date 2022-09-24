package com.cgblearn.BigINum;

import java.math.BigInteger;

/**
 * @author cgb
 * @version 1.0
 */
public class BigNumTest {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("9999999999999999999999999999999999999999999999999999999999999999999999999999999");
        BigInteger bigInteger1 = new BigInteger("998");
        System.out.println(bigInteger);
        BigInteger add = bigInteger.add(bigInteger1);
        System.out.println(add.getClass());
    }
}
