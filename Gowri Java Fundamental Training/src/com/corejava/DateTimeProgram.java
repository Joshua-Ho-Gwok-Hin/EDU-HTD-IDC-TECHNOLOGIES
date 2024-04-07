package com.corejava;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Date;
import java.util.Locale;

public class DateTimeProgram {

    public static void main(String[] args) {

        Date d = new Date();
        System.out.println(d);

        LocalDate localDate = LocalDate.of(2022, Month.DECEMBER, 20);
        System.out.println(localDate);


        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);


        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(dateTimeFormatter);

        String str = localDate.format(dateTimeFormatter);
        System.out.println(str);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        ZonedDateTime zonedDateTime1 = LocalDateTime.now().atZone(ZoneId.of("CET"));
        System.out.println(zonedDateTime1);

//        for (String zone : ZoneId.getAvailableZoneIds()) {
//            System.out.println(zone);
//
//
//        }
        System.out.println(LocalDateTime.now().getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.US));
    }
}
