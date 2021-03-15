package day15;

import java.util.StringTokenizer;

public class String6 {
    public static void main(String[] args) {
        String s1 = "Hello, I am Nirajan, I live in San Antonio, I am learning Java, I am looking for job currently.";
        System.out.println(s1);

        //String [] ss = s1.split(",");
        //StringTokenizer st = new StringTokenizer(s1);//splits on space
        StringTokenizer st = new StringTokenizer(s1, ",");//splits on ','
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }


    }
}
