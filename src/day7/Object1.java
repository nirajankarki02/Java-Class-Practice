package day7;

import javax.management.ObjectName;

public class Object1 {
    public static void main(String[] args) {
        //different ways to address Objects
        //1. Anonymous Object
        new Object1(); //Similar to to giving 5

        //2.
        Object1 ob; // Similar to int a;
        ob = new Object1();// AND a = 4;

        //2. and 3. are Same

        //3.
        Object1 obj = new Object1();
    }
}
