package day7;

public class StaticNonStaticTest {

    public static void main(String[] args) {

        StaticNonStatic ob = new StaticNonStatic();
        System.out.println(ob.nonStaticVar);
        ob.nonStaticMethod();

        System.out.println(StaticNonStatic.staticVar);
        StaticNonStatic.staticMethod();
    }
}
