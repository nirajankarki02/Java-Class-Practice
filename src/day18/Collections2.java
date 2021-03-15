package day18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections2 {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(20);
        l.add(10);
        l.add(30);
        l.add(15);

        System.out.println(l);// [20, 10, 30, 15]

        List<Integer> ll = Collections.unmodifiableList(l);
        System.out.println(ll);//[20, 10, 30, 15]
        //Now we cannot add or any other thing in this list since this is now unmodifiable List
        ll.add(40); // This gives ERROR
    }
}
