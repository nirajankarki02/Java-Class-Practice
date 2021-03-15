package day13;

public class Polymorphism {
    //poly: many; morphism: form
    //there are two types: Compile time Polymorphism (Static binding) AND Runtime Polymorphism(dynamic binding)

    //CAn make multiple Methods of same name but gotta differ:
    //1. number of arguments
    //2. type of arguments
    //3. sequence of arguments
    //This is called OverLoading of Methods

    //METHOD OVERLOADING - Compile time polymorphism is obtained by this process
    public void sum(int a, int b){
        int r = a+b;
        System.out.println("1. Sum is: "+r);
    }

    public void sum(int a, int b, int c){
        int r = a+b+c;
        System.out.println("2. Sum is: "+r);
    }

    public void sum(double a, double b){
        double r = a+b;
        System.out.println("3. Sum is: "+r);
    }

    public static void main(String[] args) {
        //Compile time Polymorphism (static binding) - can be achieved by over loading of method
        Polymorphism ob = new Polymorphism();
        //depending on the argument given, it'll call the specific method
        ob.sum(5,6);//1
        ob.sum(5,6,7);//2
        ob.sum(5.4,6.9);//3
    }

}
