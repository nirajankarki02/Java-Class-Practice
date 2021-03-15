package day16;

public class Exception2 {

    public static void main(String[] args) {
        String s2 = "1213";
        //to change String to int
        int i = Integer.parseInt(s2);
        System.out.println(s2);

        //lets change s2 a little and call it s3
        String s3 = "1213ab";
        //to change String to int
        int j = Integer.parseInt(s3); //This will output NumberFormatException
        System.out.println(s3);
    }
}
