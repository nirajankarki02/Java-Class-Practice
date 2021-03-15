package day16;

import java.util.Scanner;

public class ExceptionHandle2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = input.nextInt();
        System.out.println("Enter b: ");
        int b = input.nextInt();

        //Handle ArithmeticException with try, catch and finally
        //When there is no exception, code goes inside try executes the statements within 'try' and then escapes 'catch'
        //then goes to inside finally and then goes to next

        //Now when there is EXCEPTION

        try{
            System.out.println("try STARTS");//When exception is given, the code comes till here and
            int div = divide(a,b);// here it realise the EXCEPTION and then escapes everything else inside try, jumps directly inside CATCH
            System.out.println("Division of two numbers is : "+div);
            System.out.println("try ENDS");
        }catch (ArithmeticException ae){ //During exception it enters here and then completes statements inside catch then goes to finally
            System.out.println("Inside CATCH");
        }finally { //During exception it enters here after catch then goes to next line
            //So finally always RUNS, regardless of EXCEPTION
            //in finally we usually write codes to close resources such as input.close()
            System.out.println("inside FINALLY");
            input.close();
        }
        System.out.println("EXIT");

    }

    public static int divide(int a, int b){
        return a/b;
    }
}
