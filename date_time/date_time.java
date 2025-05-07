package date_time;
import java.time.LocalDate;
import java.util.*;
import java.time.*;

public class date_time {

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()/1000/60/60/24/365);
        // this will give you the number of years since 1970   

       //  Date date = new Date(System.currentTimeMillis()); //millis since 1970
       Date date = new Date("5/7/2025");
         System.out.println("Date: " + date.getDay()); 
         System.out.println("Date: " + (date.getYear()+1900));
         //print the current date and time


         GregorianCalendar calendar = new GregorianCalendar(); 
         calendar.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles")); 
         System.out.println(calendar.isLeapYear(2025)); 
         TimeZone tz = calendar.getTimeZone();
         System.out.println(tz.getID());

         //______________________________________________________
         Date d = new Date();
         d.setHours(18);
         System.out.println("Date: " + d);

         //LocalDate ld =  LocalDate.now();
            LocalDate ld =  LocalDate.now(ZoneId.of("America/New_York"));
            LocalDate ld2 =  LocalDate.parse("2025-05-19");

         System.out.println("LocalDate: " + ld);
         System.out.println("LocalDate custom: " + ld2);




    }
    
}
