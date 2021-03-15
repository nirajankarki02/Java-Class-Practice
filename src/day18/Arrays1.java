package day18;

import java.util.Arrays;
import java.util.List;

public class Arrays1 {

    public static void main(String[] args) {
        int [] arr = {10,30,20,15};
        System.out.println(arr); //[I@4dd8dc3

        for (int s: arr){
            System.out.println(s);// 10 30 20 15
        }

        //Instead of for loop we can also do:
        System.out.println(Arrays.toString(arr));//this only iterates the values
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));// this gives array

        //Instead of using ".add" to add each element in a list, we can do:
        List<Integer> l = Arrays.asList(30,40,23,31);
        System.out.println(l);// [30, 40, 23, 31]
    }
}
