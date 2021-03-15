package day17;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set4 {

    public static void main(String[] args) {
        //Hash Set
        Set<Integer> hs = new HashSet<>();
        hs.add(40);
        hs.add(20);
        hs.add(35);
        hs.add(40);
        hs.add(45);
        hs.add(85);

        System.out.println("hash set is: " +hs);//OUTPUT:  hash set is: [35, 20, 85, 40, 45]
        //hash set removes duplicates and displays elements in random order

        System.out.println("===================");

        //Linked Hash Set
        Set<Integer> lhs = new LinkedHashSet<>();
        lhs.add(40);
        lhs.add(20);
        lhs.add(40);
        lhs.add(45);
        lhs.add(35);
        lhs.add(85);

        System.out.println("Linked hash set is: " +lhs);//OUTPUT: Linked hash set is: [40, 20, 45, 35, 85]
        //Linked hash Set remove duplicates and displays elements in the order given in

        System.out.println("===================");

        //Tree Set
        Set<Integer> ths = new TreeSet<>();
        ths.add(40);
        ths.add(20);
        ths.add(40);
        ths.add(45);
        ths.add(35);
        ths.add(85);

        System.out.println("Tree set is: " +ths);//OUTPUT: Tree set is: [20, 35, 40, 45, 85]
        //Tree Set remove duplicates and prints elements in its sorted order (ascending order)


    }

}
