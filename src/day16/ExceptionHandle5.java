package day16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandle5 {
    //Lets look in Multiple CATCH
    //if the EXCEPTIONS are of same level we can handle those exception with multiple catch:

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
            System.out.println("try STARTS");
            System.out.println("Enter a: ");
            int a = input.nextInt();
            System.out.println("Enter b: ");
            int b = input.nextInt();
            int div = divide(a,b);
            System.out.println("Division of two numbers is : "+div);
            System.out.println("try ENDS");
        }catch (ArithmeticException  | InputMismatchException ie) { //MULTIPLE catch
            System.out.println("ae");
        }
        System.out.println("EXIT");

    }

    public static int divide(int a, int b){
        return a/b;
    }
}
