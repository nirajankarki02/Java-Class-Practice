package day21;

import java.util.Arrays;
import java.util.List;

public class Java8MethodReference1 {

    //Method Reference in Java8 can be done for both static as well as non-static Methods
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(2,7,3,8,5,6);
        l.forEach(System.out::println);
    }
}
