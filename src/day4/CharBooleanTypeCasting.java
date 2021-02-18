package day4;

public class CharBooleanTypeCasting {
    public static void main(String[] args) {
        //BOOLEAN
        //Boolean cannot be Type Casted or converted
        //example:
        boolean bb = true;
        //int i = bb; THIS WILL GIVE AN ERROR; BOOLEAN CANNOT BE CONVERTED TO OTHER DATATYPE OR VICEVERSA


         //CHARACTER
        //Explicit
        char c1 = 96;
        byte b = (byte)c1;//96
        System.out.println(b);

        //Implicit
        char c2 = 65;
        byte b2 = 65;
        System.out.println(b2);//65
        System.out.println(c2);//A

        //ALSO
        char c3 = 'a';
        byte b3 = 'a';
        System.out.println(b3);//97
        System.out.println(c3);//a

        //ANOTHER EXAMPLE: In below examples Implicit type casting does not work, gotta do Explicit
        char c4 = 77;
        byte b4 = (byte)c4;
        System.out.println(c4);//M
        System.out.println(b4);//77

        byte b5 = 88;
        char c5 = (char)b5;
        System.out.println(c5);//X
        System.out.println(b5);//88

        //int, double AND other data types works same way as well.

    }
}
