import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class DateTimeAPI {

    public static void main(String[] args) {

        // Local Date class in Java

        LocalDate today = LocalDate.now(); // By using now function we can find our todays date according to our system clock.
        LocalDate customDate = LocalDate.of(1990, 02 , 04); 

        // We can use different functions using the today variable
        System.out.println(today.getDayOfMonth()); // Get the Day of the current month
        System.out.println(today.getMonthValue()); // Get the number of the current Month
        System.out.println(today.getYear()); // Get present year

        LocalDate yesterday = today.minusDays(1); // minusDays function will minus number of days from our current date and then provide the ans
        System.out.println(yesterday);

        LocalDate pastDate = today.minusMonths(100); // minusMonths function will minus number of months from our current month and then provide the ans
        System.out.println(pastDate);

        // LocalTime class in java

        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalTime customTime = LocalTime.of(14,30); // We can create our own custom time using the of(hour, min, sec, nanoSec) function
        LocalTime parsedTime = LocalTime.parse("15:30:45"); // converts our own custom String time into a LocalTime
        // System.out.println(parsedTime);
        LocalTime timeBefore1Hour = time.minusHours(1); // Same we can minus number of hours also. No rocket science!
        System.out.println(timeBefore1Hour);
        

        // Local DateTime class in Java

        LocalDateTime todayDateTime = LocalDateTime.now();
        System.out.println(todayDateTime);

        // Same .of() method is also exist for creating our custom datetime
        // Same parse method also exist that convert a date written in String format into a local date

        LocalDateTime parsedDateTime = LocalDateTime.parse("2025-02-12T08:30:45");
        System.out.println(parsedDateTime);


        // Zoned dateTime class in Java

        ZonedDateTime indiaTime = ZonedDateTime.now();
        System.out.println(indiaTime);

        Set<String> availableZones = ZoneId.getAvailableZoneIds();
        // availableZones.forEach(System.out::println);


        // Instant Class in Java 

        long currentMiliSeconds = System.currentTimeMillis();
        System.out.println(currentMiliSeconds);

        Instant currentConvertedDateTimeFromMiliSeconds = Instant.now();
        System.out.println(currentConvertedDateTimeFromMiliSeconds);

        // Duration class in Java

        Instant start = Instant.now();

        int sum = 0;
        for(int i = 0; i < 10000000; i++){
            sum += i;
        }

        Instant end = Instant.now();

        Duration betweenStartAndEnd = Duration.between(start, end);
        System.out.println("Duration Between Start and End = "+betweenStartAndEnd);

        // Another method for creating duration

        Duration d2 = Duration.ofMillis(1); // Other methods also available
        System.out.println(d2);


        // Period class in java

        LocalDate date1 = LocalDate.now();
        LocalDate customDate2 = LocalDate.of(1970, 02 , 07);

        Period p1 = Period.between(date1, customDate2);
        System.out.println("Time Period Between both the times is = "+p1);


        // date Time formatter class in java

        // Suppose our date comes in this format (i.e. 27/02/2025) then by simply parsing it it will throw an error, as a result if we want to make our own date formatter then we can do this with the help of DateTimeFormatter Class in java
        
        String date = "27/02/2025";

        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");        


        LocalDate parseddate = LocalDate.parse(date, myFormatter);
        System.out.println(parseddate);




    }
    
}