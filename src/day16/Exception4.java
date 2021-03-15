package day16;

public class Exception4 {

    public static void main(String[] args) {
        int [] ar = new int[2];
        ar[2] = 10;//Error: ArrayIndexOutOfBoundsException ;  Since 2 here is size not index and indexes are 0 and 1;
    }

    //there are lots more types of exceptions other than these
}
