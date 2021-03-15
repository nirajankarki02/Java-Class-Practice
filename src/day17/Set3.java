package day17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class Set3 {

    public static void main(String[] args) {

        Set<Integer> s = new HashSet<>();
        s.add(40);
        s.add(20);
        s.add(40);
        s.add(45);
        s.add(85);

        System.out.println(s);//OUTPUT:  [20, 85, 40, 45]

        for (int i:s){
            System.out.println(i);//OUTPUT:  20   85   40   45
        }

        System.out.println("++++++++++++++++++++1");
        Iterator<Integer> it = s.iterator();
        while (it.hasNext()){
            System.out.println(it.next());//OUTPUT:  20   85   40   45
        }
        System.out.println("++++++++++++++++++++2");

        s.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer a) {
                System.out.println(a);//OUTPUT:  20   85   40   45
            }
        });
    }
}
