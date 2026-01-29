import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

/*
Using java 8 date/time api:

1. WAP to get two dates from user and print if the first date occurs bfore or after the second date supplied by the user.

2. WAP to print current date and time in 3 different time zones.
 */
class Ten_Quesion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking input both date
        System.out.println("Enter First Date (yyyyy-mm-dd): ");
        LocalDate date1 = LocalDate.parse(sc.next());

        System.out.println("Enter Second Date (yyyyy-mm-dd): ");
        LocalDate date2 = LocalDate.parse(sc.next());


        //checking using if else condition using .isBefore and after methods of Date Time api
        if (date1.isBefore(date2)){
            System.out.println("Date1 is before Date2");
        } else if(date1.isAfter(date2)){
            System.out.println("Date1 is after Date2");
        } else {
            System.out.println("Both Dates Are Same");
        }


        // Now 2nd Question to print different time zone

        ZonedDateTime india = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime usa = ZonedDateTime.now(ZoneId.of("America/ NewYork"));
        ZonedDateTime london = ZonedDateTime.now(ZoneId.of("Europe/London"));

        System.out.println("India Time : "+india);
        System.out.println("India Time : "+usa);
        System.out.println("India Time : "+london);

    }
}
