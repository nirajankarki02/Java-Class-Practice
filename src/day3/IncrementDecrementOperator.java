package day3;

public class IncrementDecrementOperator {
    public static void main(String[] args) {
        //Operators:

        //3. Increment/Decrement Operator:
        /*
        ++ --
        post: a++ a--
        pre: ++a --a
         */

        int a = 5;
        System.out.println(a);
        a++;
        //OR a = a+ 1;
        // OR ++a;
        //All three gives same value when there is one increment
        System.out.println(a);

        //Lets see how post and pre differs:
        //example1:
        int x = 7;
        System.out.println(x);//x=7
        System.out.println(++x);//x=8
        System.out.println(x);//x=8

        //example2:
        int m = 8;
        int n = m++;//n = m = 8 then m increases but the value of n is 8
        System.out.println(m);//m = 9; here value of m incremented after assigning n the original value of m
        System.out.println(n);//n = 8; n was assigned the original value of m

    }
}
