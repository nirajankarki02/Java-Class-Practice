package day17;

public class ArrayList {
//Array is fixed length, we cannot add or remove data of array on run time
    public static void main(String[] args) {
        int [] ar = new int[3];
        ar [0] = 10;
        ar [1] = 10;
        ar [2] = 10;
    //    ar [3] = 10;//this will give exception 'coz the size is 3 means indices can be 0,1 and2.
                    // ERROR: ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3


        for (int i = 0; i < ar.length; ++i){
            System.out.println(ar[i]);
        }
    }
}
