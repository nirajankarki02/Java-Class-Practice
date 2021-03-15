package day15;

public class String5 {

    public static void main(String[] args) {
        String s1 = "Hello, I am Nirajan, I live in San Antonio, I am learning Java, I am looking for job currently.";
        System.out.println(s1);

        String [] ss = s1.split(",");
        for (String s: ss){
            System.out.println(s);
        }

    }
}
