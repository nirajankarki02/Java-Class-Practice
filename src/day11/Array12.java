package day11;

public class Array12 {

    public static void main(String[] args) {
        //Jacked Array

        int [] [] arr = new int[3][]; // ROw is fixed but not column

        //Now we assign the Column
        arr[0] = new int[1];//For Row# 0, 1 Column
        arr[1] = new int[2];//For Row# 1, 2 Column
        arr[2] = new int[3];//For Row# 2, 3 Column

        //Assigning elements to the array
        arr[0][0] = 10;

        arr[1][0] = 10;
        arr[1][1] = 20;

        arr[2][0] = 10;
        arr[2][1] = 20;
        arr[2][2] = 30;

        for (int [] ar: arr){
            for (int a : ar){
                System.out.print(a+ " ");
            }
            System.out.println();
        }
    }
}
