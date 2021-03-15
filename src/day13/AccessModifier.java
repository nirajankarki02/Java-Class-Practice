package day13;

//cannot write "private' or "protected" in front of the class
//if nothing is written it is default/public
public class AccessModifier {

    //We can use "private"/"public"/"protected" in front of VARIABLES
    String defaultVar = "this is default variable.";
    public String publicVar = "this is public variable";
    private String privateVar = "this is private variable";
    protected String protectedVar = "this is protected variable";

    //METHODS
    //We can use "private"/"public"/"protected" in front of METHODS
    void defaultMethod(){
        System.out.println("this is default method");
    }
    public void publicMethod(){
        System.out.println("this is public method");
    }
    private void privateMethod(){
        System.out.println("this is private Method");
    }
    protected void protectedMethod(){
        System.out.println("this is protected Method");
    }


    //CONSTRUCTOR
    //We can use "private"/"public"/"protected" in front of CONSTRUCTOR
    AccessModifier(int a){
        System.out.println("default CONSTRUCTOR");
    }
    public AccessModifier(){
        System.out.println("public CONSTRUCTOR");
    }
    private AccessModifier(int a, int b){
        System.out.println("Private CONSTRUCTOR");
    }
    protected AccessModifier(String c){
        System.out.println("default CONSTRUCTOR");
    }

    public static void main(String[] args) {
        AccessModifier ob = new AccessModifier(4,5);
        ob.defaultMethod();
        ob.publicMethod();
        ob.privateMethod();
        ob.protectedMethod();

    }
}
