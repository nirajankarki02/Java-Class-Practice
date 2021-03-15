package day17;

import java.util.HashSet;
import java.util.Set;

public class Set1 {

    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);

        System.out.println(s);//OUTPUT: [20, 40, 10, 30]
    }
}
