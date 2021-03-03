package day11;

public class Main {

    public static void main(String[] args) {
        printNames(new String[] {"Ram","Gita", "Sita"});

    }

    public static void printNames(String [] names){
        for (String name:names) {
            System.out.println(name);
        }
    }
}
