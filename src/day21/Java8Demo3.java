package day21;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Java8Demo3 {

    //COMPARATOR
    /*
    public static void main(String[] args) {

        List<Integer> l = Arrays.asList(2,10,3,25,4);
        l.forEach(i -> System.out.println(i));

        System.out.println(l);

        l.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2){
                    return 1;
                }
                else {
                    return -1;
                }
            }
        });
        System.out.println(l);//this prints sorted list
    }
    */

    //COMPARATOR is functional Interface as well, so Java8 makes the ABOVE code shorter as follows:

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(2,10,3,25,4);
        l.forEach(i -> System.out.println(i));

        System.out.println(l); //unsorted code

        l.sort((o1,o2) -> {
            if (o1 > o2){
                return 1;
            }
            else {
                return -1;
            }

        });
        System.out.println(l);//this prints sorted list
    }

}
