package day16;

import java.util.Scanner;

public class ExceptionHandle1 {
//Exceptions are USUALLY handled with mainly two ways
    //1. try => {} block
    //2. catch => block

//BUT there are more ways as well:

    //3.finally => block
    //throw => statement
    //throws => clause
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = input.nextInt();
        System.out.println("Enter b: ");
        int b = input.nextInt();

        //Handle ArithmeticException with try and catch
        //When there is no exception, code goes inside try executes the statements within 'try' and then escapes 'catch' and goes to next

        try{
            System.out.println("try STARTS");//When exception is given, the code comes till here and
            int div = divide(a,b);// here it realise the EXCEPTION and then jumps directly into CATCH
            System.out.println("Division of two numbers is : "+div);
            System.out.println("try ENDS");
        }catch (ArithmeticException ae){ //During exception it enters here and then completes statements inside catch then goes out
            System.out.println("Inside CATCH");
        }
        System.out.println("EXIT");// This time this line will be executed even whe ArithmeticException is given

    }

    public static int divide(int a, int b){
        return a/b;
    }
}
