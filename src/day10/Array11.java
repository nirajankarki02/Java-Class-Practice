package day10;

public class Array11 {

    public static void main(String[] args) {
        String [][] names = new String [][]{{"Ram", "sam", "gyan"}, {"raja", "Babu", "hari"}, {"gita", "sita", "Rita"}};
        //Enhanced for each loop
        for (String [] name: names) {
            for (String n: name) {
                System.out.print(n+ " ");
            }
            System.out.println();
        }
    }
}
