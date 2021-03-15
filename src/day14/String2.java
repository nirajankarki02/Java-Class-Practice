package day14;

public class String2 {

    public static void main(String[] args) {
        String s1 = "Nepal";
        String s2 = "Nepal";
        String s3 = new String ("Nepal");
        String s4 = new String ("Nepal");

        System.out.println(s1 == s2);//true
        System.out.println(s1 == s3);//false
        System.out.println(s3 == s4);//false

        //to check the content
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s3.equals(s4));//true

        String s5 = "nepal";
        System.out.println(s1.equals(s5));//false (Nepal != nepal)

        //to check if the content is same regardless of cases
        System.out.println(s3.equalsIgnoreCase(s5));//true
    }
}
