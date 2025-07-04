import java.time.*;

import static java.time.LocalDateTime.*;


public class TryDates {
     public static void main(String[] args) {
          LocalDateTime localDateTime = MAX;
          // 11:59:59.999999999 PM on December 31 of AD 999,999,999
          System.out.println("localDateTime = " + localDateTime);
          localDateTime = MIN;
          // midnight on January 1 of 999,999,999 BC
          System.out.println("localDateTime = " + localDateTime);

          // current date and time in the time zone the computer is configured
          localDateTime = now();
          System.out.println("localDateTime = " + localDateTime);

          // reasonable date
          localDateTime = LocalDateTime.of(2017,
                  Month.APRIL,
                  10,
                  9,
                  21,
                  0);
          System.out.println("localDateTime = " + localDateTime);

          // throws an exception-- there was no 2/29 in 2019
          // Exception in thread "main" java.time.DateTimeException: Invalid date 'February 29' as '2019' is not a leap year
/*          localDateTime = LocalDateTime.of(2019, Month.FEBRUARY, 29, 0, 0, 0);
          System.out.println("localDateTime = " + localDateTime);*/

          // 4/10/17 was a Monday
          DayOfWeek dow = localDateTime.getDayOfWeek();
          System.out.println("dow = " + dow);
          // 4/10/17 was the 100th day of the year
          int doy = localDateTime.getDayOfYear();
          System.out.println("doy = " + doy);

          LocalDateTime today = LocalDate.now().atStartOfDay();

          LocalDate start = LocalDate.of(2017, 4, 10);
          LocalDate end = LocalDate.of(2025, 7, 4);
          // from the end to the start
          // 2025 to 2017 is going backward, so -8 years, -2 months, -24 days
          Period p = Period.between(end, start);
          System.out.println("p = " + p);


          // from the start to the end
          // 2017 to 2025 is going forward, so 8 years, 2 months, 24 days (no sign = positive)
          p = Period.between(start, end);
          System.out.println("p = " + p);

     }

}