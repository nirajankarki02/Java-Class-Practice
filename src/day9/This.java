package day9;

import java.util.SortedMap;

//SHADOWING: is the process of hiding instance variable by local variable inside non static Method and Constructor of a class
//THIS: is a keyword and is an implicit reference variable of current type and current object
//       and is available inside non static method and Constructor of a Class
//       We can not change value of 'this'
public class This {
    //Instance variable
    int a = 5;

    public static void m1(){
        int a = 7; //This is not hiding/Shadowing, cannot shadow in static Method
    }

    public void print(){
        System.out.println("this is: "+this);
        System.out.println(a);//since the Method is non static, 'a' can be called directly - 5
        //Local variable : this shadowed the value of Instance variable- SHADOWING
        int a = 6;
        System.out.println(a); // 6

        int sum = a +a;
        System.out.println("Sum is: "+sum);//this will give 6+6 = 12
        //But I want a= 5 + a= 6 = 11
        int Sum2 = this.a + a; //There 'this.a calls instance variable a =5
        System.out.println("The Sum is: "+Sum2);
    }

    public static void main(String[] args) {
        This ob1 = new This();
        System.out.println("ob1 is "+ob1);
        ob1.print();

        System.out.println("=================");

        This ob2 = new This();
        System.out.println("ob2 is "+ob2);
        ob2.print();
    }
}
