package day16;

import java.util.InputMismatchException;
import java.util.Scanner;

//Even with what we did in "ExceptionHandle3" class, code can give exception, lets see the example and the handle for that:
public class ExceptionHandle4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = new int [2];

        try{
            System.out.println("try STARTS");
            System.out.println("Enter a: ");
            int a = input.nextInt();
            System.out.println("Enter b: ");
            int b = input.nextInt();
            //int div = divide(a,b);
            arr [2] = divide(a,b);
            System.out.println("Division of two numbers is : "+arr[2]);
            System.out.println("try ENDS");
        }catch (ArithmeticException ae){ //this handles "ArithmeticException"
            System.out.println("ae");
        }catch (InputMismatchException ie){//this handles "InputMismatchException"
            System.out.println(ie); //here this handles "ArrayIndexOutOfBoundsException", OR any other Exception;
            // if we are use specific exceptional handler in "catch" and then "exception" to handle every other,
            // specific handlers should be mentioned before "catch(exception e)", since exception is parent to all
        }catch (Exception e){ //If we know each and every exception that can use catch for each, if not we can call
            // "exception" within catch to handle any possible exception
            System.out.println(e);
        }

        System.out.println("EXIT");

    }

    public static int divide(int a, int b){
        return a/b;
    }
}
