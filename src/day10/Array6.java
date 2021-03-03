package day10;

import java.util.Scanner;

public class Array6 {

    public static void main(String[] args) {
        //Two dimensional Array
        final int ROWS = 3;
        final int COLUMNS = 3;

        int [][] arr = new int[ROWS][COLUMNS];
        //Scanner input = new Scanner(System.in);
        arr[0][0] = 10;
        arr[0][1] = 10;
        arr[0][2] = 10;

        arr[1][0] = 10;
        arr[1][1] = 10;
        arr[1][2] = 10;

        arr[2][0] = 10;
        arr[2][1] = 10;
        arr[2][2] = 10;

        for (int i = 0; i < ROWS; ++i){
            for (int j = 0; j < COLUMNS; ++j){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

    }
}//We need above Row and column when we need:

// 10 20 30
// 45 35 25
// 11 22 35