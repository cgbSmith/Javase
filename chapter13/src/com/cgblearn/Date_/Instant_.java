package com.cgblearn.Date_;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.time.Instant;

/**
 * @author cgb
 * @version 1.0
 */
public class Instant_ {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println("---"+now);
        Date date = Date.from(now);
        System.out.println("-----"+date);
        Instant instant = date.toInstant();
        System.out.println("instant"+instant);
        System.out.println(Date.from(now));
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime localDateTime1 = localDateTime.plusDays(3);
        System.out.println("增加的时间是："+dateTimeFormatter.format(localDateTime1));



    }
}
