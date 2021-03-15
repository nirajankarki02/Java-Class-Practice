package day12;

public class SuperTest {

    public static void main(String[] args) {
        Super obj = new Sub();
        obj.sayHello(); //Implicit type casting

        //Sub sub = new Super();//cannot do this
        //So can do: Explicit type casting
        Super ob = new Super();
        Sub sub = (Sub)ob;


    }
}
