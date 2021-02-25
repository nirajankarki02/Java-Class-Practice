package day7;

public class Object2 {
    int a;
    String s;

    public static void main(String[] args) {
        System.out.println(new Object2());
        System.out.println(new Object2().a);
        System.out.println(new Object2().s);

        System.out.println("=================");

        Object2 ob;
        ob = new Object2();
        System.out.println(ob);
        System.out.println(ob.a);
        System.out.println(ob.s);

        System.out.println("=================");

        Object2 obj = new Object2();
        System.out.println(obj);
        System.out.println(obj.a);
        System.out.println(obj.s);

    }

}
