package day16;

import java.util.Scanner;

public class Exception3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");//If user input abc instead of 1213, it will throw an exception
        int n = input.nextInt();
        System.out.println(n);// Error: InputMismatchException
    }
}
