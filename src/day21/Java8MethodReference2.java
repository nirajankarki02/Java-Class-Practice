package day21;

import java.util.Arrays;

public class Java8MethodReference2 {


    //Static Method
    public static void print(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        Arrays.asList("a", "b", "c").stream().forEach(Java8MethodReference2::print);
    }
}
