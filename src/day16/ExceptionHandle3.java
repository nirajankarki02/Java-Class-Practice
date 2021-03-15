package day16;
//MULTI Level CATCH
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandle3 {

    //If user gives 'abc' instead of '123', for any one (a or b), it will throw InputMismatchException
    //to handle such exception we can put lines to ask input from user inside "try" AND
    //in catch we can put "InputMismatchException ae"

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
        }catch (ArithmeticException ae){ //this handles "ArithmeticException"
            System.out.println("ae");
        }catch (InputMismatchException ie){//this handles "InputMismatchException"
            System.out.println(ie);
        }

        System.out.println("EXIT");

    }

    public static int divide(int a, int b){
        return a/b;
    }
}
