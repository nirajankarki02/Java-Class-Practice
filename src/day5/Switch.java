package day5;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Choice: ");
        int choice = input.nextInt();

        switch (choice)
        {
            case 1:
                System.out.println("this is addition");
                break;
            case 2:
                System.out.println("this is subtraction");
                break;
            case 3:
                System.out.println("this is Multiplication");
                break;
            case 4:
                System.out.println("this is division");
                break;
            default:
                System.out.println("wrong choice");
        }
        //If "break" is not given after switch condition, compiler reads the correct case and the following case until it finds
        //"break".  Where "default" is given, "break" is optional.
    }
}
