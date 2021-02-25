package day7;

public class StaticNonStatic {
    //these can be called in any block just like global in C
    String nonStaticVar = "this is non static variable";
    static String staticVar = "this is static variable";

    public void nonStaticMethod(){
        System.out.println("this is non static method..");
    }

    public static void staticMethod(){
        System.out.println("this is static method...");
    }

    public static void main(String[] args) {
        //Local variable
        int a = 5;
        String name = "Ram";

        //call non static
        StaticNonStatic ob = new StaticNonStatic();
        System.out.println(ob.nonStaticVar);
        ob.nonStaticMethod();

        /*
        //call static
        System.out.println(staticVar);
        staticMethod();*/

        //Best way to call Static
        System.out.println(StaticNonStatic.staticVar);
        StaticNonStatic.staticMethod();

    }
}
  //BLOCK: {....} => thi sis called block starts with '{' and ends with '}'