package day4;

public class TypeCasting {
    public static void main(String[] args) {
        //There are two types of Type Casting/Conversion
        //1. Implicit Type Casting -> done by compiler
        //2. Explicit Type Casting -> done by programmer

        //1.Implicit Type Casting
        byte b1 = 127;
        int i1 = b1;
        System.out.println(b1);//127
        System.out.println(i1);//127
        /*Implicit flow:
        byte -> short -> int -> long -> float -> double
        (small --> to --> big)
        value of smaller datatype can be assigned to bigger datatype through Implicit type casting
        */

        //2.Explicit Type Casting
        /*Explicit flow:
        double -> float -> long -> int -> short -> byte
        (big --> to --> small)
        value of bigger datatype can be assigned to smaller datatype through Explicit type casting/conversion
        */
        int i2 = 127;
        //byte b2 = i2; this will give error since byte is smaller than int so need to use EXPLICIT type casting
        byte b2 = (byte) i2; //Explicit TypeCasting/Conversion
        System.out.println(i2);//127
        System.out.println(b2);//127

        //ALSO
        int i3 = 200;
        byte b3 = (byte) i3;//Explicit TypeCasting
        System.out.println(i3);//200
        System.out.println(b3);//-56 Value is lost which was 200 'coz value of int is bigger than what byte can store

    }

}
