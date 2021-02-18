package day3;

public class ArithmeticOperator {
    public static void main(String[] args) {
        //Operators:

        /* 1. Arithmetic Operator:
              + - * / %
              Precedence: + - (low)
                          * / % (high)
        //Associativity from left to right*/

        int a = 4 + 5 - 3 * 2 + 4 / 2 - 7 % 3;

        System.out.println(a); // will print 4

        /*Precedence and Associativity works as follows in the compiler
         int a = 4 + 5 - 6 + 4 / 2 - 7 % 3; (3*2=6)
         int a = 4 + 5 - 6 + 2 - 7 % 3; (4/2=2)
         int a = 4 + 5 - 6 + 2 - 1;(7%3=1)
         int a = 9- 6 + 2 - 1;(4+5=9)
         int a = 3 + 2 - 1;(9-6=3)
         int a = 5 - 1;(3+2=5)
         int a = 4; (5-1=4)
        */


    }
}
