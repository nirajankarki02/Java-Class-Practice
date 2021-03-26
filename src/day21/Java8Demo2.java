package day21;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//Lambda Expression for iteration
public class Java8Demo2 {

    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("hello from thread..");
            System.out.println("hello from thread222222..");
        }).start();

        //Here in Below code "consumer" is a functional interface, so we can write differently in Java8
        /*
        List<Integer> l = Arrays.asList(2,10,3,25,4);
        l.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.println(i);
            }
        });
        */

        //Java8 simplicity of the above code
        List<Integer> l = Arrays.asList(2,10,3,25,4);
        l.forEach(i -> System.out.println(i));
    }
}
