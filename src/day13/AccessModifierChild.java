package day13;

public class AccessModifierChild extends AccessModifier{

    public static void main(String[] args) {
        AccessModifier ob = new AccessModifier(4);
        ob.defaultMethod();
        ob.publicMethod();
        //ob.privateMethod(); PRIVATE is not accessible in child
        ob.protectedMethod();


    }
}
