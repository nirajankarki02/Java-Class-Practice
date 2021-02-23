package day5;

import java.util.Scanner;

public class WhileLoop2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        while (flag) //while loop is unconditional, so it will go for infinity without terminating if condition is not given
        {
            System.out.println("Enter name: ");
            String name = input.next();
            System.out.println("Name is "+name);
            if (name.equals("nirajan"))//condition statement to terminate the loop.
            {
                flag = false;
            }
        }



    }
}
