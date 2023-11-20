package org.example;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.from(localDateTime);
        localDate = localDate.plusWeeks(2);
        System.out.println(localDate);
        LocalDate localDate1 = LocalDate.of(2023,2,12);
        System.out.println(dateBiggerThan(localDate,localDate1));

        LocalDateTime localDateTime2 = ChronoUnit.WEEKS.addTo(localDateTime,2);
        LocalDateTime ldt1 = LocalDateTime.of(1991,9,14,0,0,0,0);
        LocalDateTime ldt2 = LocalDateTime.of(2023,11,20,0,0,0,0);
        long days = ChronoUnit.DAYS.between(ldt1,ldt2);
        System.out.println(days);

        Animal animal = new Animal("Bello", ZonedDateTime.of(LocalDate.of(2010,12,24),LocalTime.of(10,15,22), ZoneId.of("GMT")));
        int thisYear = ZonedDateTime.now().getYear();
        long daysToBirthdayOfAnimal = ChronoUnit.DAYS.between(ZonedDateTime.now(),animal.getBirthday().withYear(thisYear));

        System.out.println(daysToBirthdayOfAnimal);


    }

}