package day8;

//We can make multiple CONSTRUCTOR in one class and when done is called Constructor Overloading:
//Each Constructor in a Class should be different in: number of arguments, type of arguments or sequence of arguments.
public class ConstructorOverLoading {
    String name;
    int age;

    //Class 1. Default Class since this does not have any arguments
    public ConstructorOverLoading(){
        System.out.println("This is Default Constructor/no-arg constructor");
    }

    //Class 2. Argumentated /Parameterized Constructor
    public ConstructorOverLoading(String n, int a){
        name = n;
        age = a;
        System.out.println("This is Argumentated /Parameterized Constructor.");
    }
    /*
    Ways we can make similar looking above constructor:
    1. Types of arguments
    public ConstructorOverLoading(String n, int a){
            }
    2.Sequence of Arguments
    public ConstructorOverLoading(int n, String a){
            }
    3. Number of Arguments
    public ConstructorOverLoading(String n, int a, int c){
            }
     */

    public static void main(String[] args) {
        ConstructorOverLoading student1 = new ConstructorOverLoading();//This calls default constructor
        System.out.println("==============");
        ConstructorOverLoading student2 = new ConstructorOverLoading("Ram", 23);//Calls Parameterized Constructor
    }
}
