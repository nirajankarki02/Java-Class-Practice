package day17;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set2 {

    public static void main(String[] args) {
        //Set does not show any duplicates and also displays elements randomly UNLIKE List
        Set<Integer> s = new HashSet<>();
        s.add(40);
        s.add(20);
        s.add(40);
        s.add(45);
        s.add(85);

        System.out.println(s);//OUTPUT: [20, 85, 40, 45] : does not show the duplicates

        //Lets check list
        List<Integer> l = new ArrayList<>();
        l.add(40);
        l.add(20);
        l.add(40);
        l.add(45);

        System.out.println(l);//OUTPUT: [40, 20, 40, 45] : maintains insertion order, and keeps duplicates

        l.add(0,12);
        System.out.println(l);//OUTPUT: [12, 40, 20, 40, 45]

    }
}
