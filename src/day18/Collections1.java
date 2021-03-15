package day18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collections1 {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(20);
        l.add(10);
        l.add(30);
        l.add(15);

        System.out.println(l);// [20, 10, 30, 15]

        //sort the list
        Collections.sort(l);
        System.out.println("Sorted with Collection: "+l);//[10, 15, 20, 30]

        System.out.println("----------------");
        //Another way to sort list
        l.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2){
                    return  1;
                }
                else {
                    return -1;
                }
            }
        });
        System.out.println("Sorted with Comparator: "+l);//[10, 15, 20, 30]
        System.out.println();
        //Reverse List
        Collections.reverse(l);
        System.out.println(l);// [30, 20, 15, 10]

        System.out.println(Collections.max(l));//30
        System.out.println(Collections.min(l));//10
    }
}
