package day17;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class ArrayList3 {

    public static void main(String[] args) {
        List<Integer> al = new LinkedList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        //To check elements of each index: possible only if there are few elements
        System.out.println(al);//OUTPUT: [10, 20, 30]
        System.out.println(al.get(0));//OUTPUT: 10
        System.out.println(al.get(1));//OUTPUT: 20
        System.out.println(al.get(2));//OUTPUT: 30

        System.out.println("=============================");

        //now to iterate the list
        for (int i =0; i < al.size(); ++i){
            System.out.println(al.get(i));// OUTPUT: 10 20 30
        }

        System.out.println("=============================");

        //using enhance for loop
        for (int a: al){
            System.out.println(a);// OUTPUT: 10 20 30
        }

        System.out.println("============++=================");

        //USINg Interator
        Iterator<Integer> it = al.iterator();
        while (it.hasNext()){
            System.out.println(it.next());// OUTPUT: 10 20 30
        }

        System.out.println("============++++===============");

        ListIterator<Integer> lit = al.listIterator();
        while (lit.hasNext()){
            System.out.println(lit.next()); // OUTPUT: 10 20 30
        }
        System.out.println();

        //THis is the difference between "Iterator" and "ListIterator", ListIterator can iterate elements backward as well
        while (lit.hasPrevious()){
            System.out.println(lit.previous());//OUTPUT: 30 20 10
        }

        System.out.println("************************");
        al.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.println(i);//// OUTPUT: 10 20 30
            }
        });
    }
}
