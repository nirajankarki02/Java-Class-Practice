package day14;

//If you have "final" in the class, that class cannot be inherited by other class
public class String1 {
    //even if String does not have 'final' in its class, it is final class So the class is Immutable
    //String is library class which is in java.lang package
    //object of string is immutable sequence of character

    public static void main(String[] args) {
        //Ways to create String in java
        //1. Implicit Creation (Compiler is creating object). It is also called Literal way of creating string
        String s1 = "Nepal";
        System.out.println(s1);

        //2.Explicit Creation (coder is creating object)
        String s2 = new String();//by using blank constructor
        System.out.println(s2);

        //3.
        String s3 = new String("Nepal");
        System.out.println(s3);

        //4.
        char[] ch = { 'e', 'f', 'g'};
        String s4 = new String(ch);
        System.out.println(s4);

        //5.
        byte [] bb = {65, 75, 85};
        String s5 = new String (bb);
        System.out.println(s5);

    }
}
