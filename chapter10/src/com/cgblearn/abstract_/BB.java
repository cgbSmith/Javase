package com.cgblearn.abstract_;

public class BB extends Template{
    @Override
    public void job() {
        long num = 0;
        for (long i = 1; i <= 8000000; i++) {
            num *= i;
        }
    }
}
