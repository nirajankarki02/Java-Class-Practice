package day6;

public class Method {
    //method declaration
    public void sayHello(){
        System.out.println("Hello");
        return; //It is not necessary to have return in method with void
    }

    public void displayInfo(String name, int age,double salary){
        System.out.println("Name is " +name);
        System.out.println("Age is " +age);
        System.out.println("Salary is " +salary);
    }

    public static void main(String[] args) {
        System.out.println("main");
        //method calling
        Method ob = new Method();//If Method is declared using "static" in it, it can be called simply by "sayHello"
        ob.sayHello();

        ob.displayInfo("Ram", 22, 567.34);

        //if the parameters is given by user Scanner can be used or as follows:
        String n = "Nirajan";
        int a = 32;
        double s = 152.42;
        ob.displayInfo(n, a, s);

        System.out.println("main End");
    }
}
