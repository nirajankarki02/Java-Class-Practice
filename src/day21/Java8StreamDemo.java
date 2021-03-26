package day21;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8StreamDemo {

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(2,7,3,8,5,6);
        //print using stream and forEach
        l.stream().forEach(i-> System.out.println(i));
        //Using map and Stream
        List<Integer> ll = l.stream().map(i -> {
                i = i*2;
                return i;
        }).collect(Collectors.toList());
        System.out.println(ll);

        //Stream and filter
        List<Integer> evenlist = l.stream().filter(i -> i%2==0).collect(Collectors.toList());
        System.out.println("Even List: "+evenlist);

        List<Integer> oddlist = l.stream().filter(i -> i%2!=0).collect(Collectors.toList());
        System.out.println("Odd List: "+oddlist);

        //Stream and reduce
        int sum = l.stream().reduce(0, (a,b)-> a+b);
        System.out.println("Sum of elements in List: "+sum);

        //Stream, MIN MAX
        int min = l.stream().min((a,b)-> a.compareTo(b)).get();
        int max = l.stream().max((a,b)-> a.compareTo(b)).get();
        System.out.println("Min is: "+min);
        System.out.println("Max is: "+max);


    }
}
