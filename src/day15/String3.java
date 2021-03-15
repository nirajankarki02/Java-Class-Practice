package day15;

import java.util.Arrays;
import java.util.Collections;

public class String3 {

    public static void main(String[] args) {
        String s1 = "good morning";

        //In context of immutability of String, all these steps creat different object, s1 never changes, alys remains "good morning"
        System.out.println(s1);//good morning
        System.out.println(s1.substring(5));//morning
        System.out.println(s1.length());//12
        System.out.println(s1.substring(0,4));//good
        System.out.println(s1.toUpperCase());//GOOD MORNING
        System.out.println(s1.indexOf('m'));//5
        System.out.println(s1.charAt(5));//m
        System.out.println(s1.concat(" hello, "));//good morning hello,
        System.out.println("hello, ".concat(s1));//hello, good morning
        System.out.println(s1.isEmpty());//false
        System.out.println(s1.replace("morning", "evening"));//good evening

        //Convert String to Array
        char[] ch = s1.toCharArray();
        System.out.println(ch);
        //Collections.reverse(ch);

        String s2 = " Good Morning, How are You? ";
        System.out.println(s2);//{SPACE}Good Morning, How are You?{SPACE}
        System.out.println(s2.trim());//Good Morning, How are You? -- this takes white space away from beginning and end of the String


        if (s1.compareTo("good ") == 0){
            System.out.println("same");
        }
        else {
            System.out.println("not same");
        }


    }
}
