package day16;

import java.util.Scanner;

public class Throw {

    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        //System.out.println("Enter Your Age: ");
        //int age = input.nextInt();// <18 throws ArithmeticException, to handle that exception "throw" is used
        vote(8); //if 18 or over, works normally, if less than 18 throws exception
        System.out.println("EXIT");
    }

    public static void vote(int age){
        if (age >= 18){
            System.out.println("You can Vote...");
        }
        else {
            //throw new ArithmeticException("you cannot vote!!!!!!");//{"ArithmeticException: you cannot vote!!!!!!"}
            throw new InvalidAgeException("you cannot vote!!!!!!");//{"InvalidAgeException: you cannot vote!!!!!!"}
        }
    }
}
