package day20;

import java.util.concurrent.Callable;

public class Thread7 implements Callable {
/*
Callable: returns Object(String, Integer....)
Runnable: returns nothing (void)
 */

    @Override
    public Integer call() throws Exception {
        int a = 5;
        int b = 6;
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Thread7 t1 = new Thread7();
        try {
            Integer s = t1.call();
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
