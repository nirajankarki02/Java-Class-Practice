package day21;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class Java8Demo5 {

    public static void main(String[] args) {
        System.out.println(new Date());
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(sdf.format(new Date()));

        System.out.println(Instant.now());

        //All above in Java8 can be done with:
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDate.now());
    }
}
