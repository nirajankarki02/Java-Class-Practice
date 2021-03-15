package day16;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Throws {

    public static void main(String[] args) {
        parseDateToString();
        //Calling Method with 2nd way of handling the exception
        /*
        try {
            parseStringToDate();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        */

    }

    public static void parseDateToString(){
        //Date
        Date d = new Date();
        System.out.println(d);//OUTPUT:  Sun Mar 14 17:17:16 CDT 2021

        //Converting Date to String
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
        String formattedDate = sdf.format(d);
        System.out.println(formattedDate);//OUTPUT: 2021-03-14 17:18:13 PM
    }

    public static void parseStringToDate(){
        String s = "2021-03-14 17:18:13 PM";
        System.out.println(s);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
        //sdf.parse(s); this lines, without handling gives error (compile time exception), there are two ways to handle it
        //1. Surround with try and Catch
        try {
            sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
    //2. Is by changing the Method to "public static void parseStringToDate () throws ParseException"
    /*
    public static void parseStringToDate() throws ParseException {
        String s = "2021-03-14 17:18:13 PM";
        System.out.println(s);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
        Date d = sdf.parse(s);

    }

     */

}
