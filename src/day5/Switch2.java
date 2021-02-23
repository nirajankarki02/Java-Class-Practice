package day5;

import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Choice: ");
        char choice = input.next().charAt(0);

        switch (choice) {
            case '+':
                System.out.println("this is addition");
                break;
            case '-':
                System.out.println("this is subtraction");
                break;
            case '*':
                System.out.println("this is Multiplication");
                break;
            case '/':
                System.out.println("this is division");
                break;
            default:
                System.out.println("wrong choice");
        }
    }
}
