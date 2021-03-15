package day17;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {

    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        System.out.println(al); //OUTPUT: [10, 20, 30]
        //We can add elements later
        //Lets add 40 after 10
        al.add(1,40);//1 is index, 40 is element
        System.out.println(al); //OUTPUT: [10, 40, 20, 30]

        //replace variable
        al.set(2, 25); // replaces 20 with 25
        System.out.println(al);// OUTPUT: [10, 40, 25, 30]

        //check size
        System.out.println(al.size());// OUTPUT: 4

        //see a variable in certain index
        System.out.println(al.get(2));// OUTPUT: 25

        //remove variable
        al.remove(3);
        System.out.println(al);// OUTPUT: [10, 40, 25]

        //Check index of a variable in the list
        System.out.println(al.indexOf(25));// OUTPUT: 2

        //Remove all data
       // al.clear();
        //System.out.println(al);// OUTPUT: []

        //Check if the list is empty
        System.out.println(al.isEmpty());// OUTPUT: true

        System.out.println("=====================================");

        List<Integer>all = new ArrayList<>();
        all.add(45);
        System.out.println(all);//OUTPUT: [45]

        //Add all the elements of al to all
        all.addAll(al);
        System.out.println(all);// OUTPUT: [45, 10, 40, 25]

        //add elements of al to all in index 0
        all.addAll(0, al);
        System.out.println(all);//OUTPUT: [10, 40, 25, 45, 10, 40, 25]

        /*

        //Removes all elements add from al
        all.removeAll(al);
        System.out.println(all);//OUTPUT: [45]

         */

        //Remove variables of all and retain from al
        all.retainAll(al);
        System.out.println(all);//OUTPUT: [10, 40, 25, 10, 40, 25]

        //check if the list contains 20
        System.out.println(al.contains(20));////OUTPUT: false

    }
}
