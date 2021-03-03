package day10;

import java.util.Scanner;

public class Array3 {
//3. Ways to initialize array:
    //Ask User for Elements of Array
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println(arr);
        System.out.println(arr.length);
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; ++i){
            System.out.println("Enter element of an array: ");
            arr[i] = input.nextInt();
        }

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println("Printing array with for loop");
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
