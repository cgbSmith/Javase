package com.cgblearn.Date_;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author cgb
 * @version 1.0
 */
public class LocalTime_ {
    public static void main(String[] args) {
        LocalDateTime d =LocalDateTime.now();
        System.out.println(d);
        System.out.println(d.getYear());
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = dateTimeFormatter.format(d);
        System.out.println("格式化的时期是： "+format);
    }
}
