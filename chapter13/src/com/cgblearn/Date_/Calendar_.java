package com.cgblearn.Date_;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;

/**
 * @author cgb
 * @version 1.0
 */
public class Calendar_ {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR));

    }
}
