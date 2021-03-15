package day16;

public class Exception1 {
    public static void main(String[] args) {
        int a = 4;
        int b = 0;
        int r = a/b; //4/0 - Error : ArithmeticException
        System.out.println(r);//This gives error "ArithmeticException"
        //Once the exception is recognized code after this will not run

        //Once the exception is realized, the below lines will not even be read by compiler
        String s1 = null;
        s1.toCharArray();

        String s2 = "1213";
        //to change String to int
        int i = Integer.parseInt(s2);
        System.out.println(s2);

    }
}
