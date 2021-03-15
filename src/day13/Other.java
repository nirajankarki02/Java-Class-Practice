package day13;

public class Other {
    public static void main(String[] args) {
        AccessModifier ob = new AccessModifier(4);
        ob.defaultMethod();
        ob.publicMethod();
        //ob.privateMethod(); //PRIVATE is not accessible in other class without relation as well
        ob.protectedMethod();


    }
}
