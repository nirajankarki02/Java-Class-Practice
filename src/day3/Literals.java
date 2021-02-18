package day3;

public class Literals {
    public static void main(String[] args) {
        //Literals are source code representative of foxed value and datatype

        //1. Integer Literal:
        byte b = 127;//max value
        short s = 32767;//max value
        int i = 2147483647;//max value
        long l = 9223372036854775807L;//max value

        //2. Floating Literal:
        float f = 45.76F;
        double d = 45.76;

        //3. Boolean Literals:
        boolean b1= true;
        boolean b2 = false;

        //4. Character Literal:
        //'a', '1'
        char c1 = '1';
        char c2 = 'a';
        //within single quote, java does not take more than one character
        char c3 = '\u0000'; /*this is unicode 0 for java 1 is \u0001.
        Need to start with  with in single quote for more than 1 character*/

        //5. String Literal:
        //"saf"
        String s1 = "Nirajan";
        String s2 = "abs123^%";
        String s3 = "";
        String s4 = " ";
        String s5 = "123";
        String s6 = "34.45";
        String s7 = "true";
        String s8 = "Hello World. You are about to End.";

        //6. Null Literal:
        String s9 = null;

        Literals obj = new Literals(); //java object

        Literals ob = null;






    }

}
