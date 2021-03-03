package day11;

import java.util.Scanner;

public class MethodArray1 {

    public int [] returnArray(Scanner in){
        System.out.println("Enter Size of an array: ");
        int size = in.nextInt();
        int arr[] = new int[size];
        //Asking Elements
        for (int i = 0; i < arr.length;++i){
            System.out.println("Enter elements:  ");
            arr[i] = in.nextInt();
        }
        return arr;
    }

    public void printElementsofAnArray(int [] arr){
        for (int a : arr) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MethodArray1 obj = new MethodArray1();
        int [] arr = obj.returnArray(input);
        obj.printElementsofAnArray(arr);
    }


}
