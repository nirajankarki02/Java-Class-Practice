package day8;

public class Student5ConstructorMethod {
    /*Constructor: is a special function with following features:
    1. It should be names same as its Class (Constructor's name is same as Class name)
    2. It has no return type
    3. "void" keyword is not used
    4. It can have any access modifier
    5. It runs only once for each object.
    6. It is mainly used to initialise the member data

    Class: is a specification/template/model/prototype
    Object: is  an instance of a class which has properties and behavior

     */

    String name;
    int roll;

    //Constructor - This helps to avoid giving multiple value to unique variable as we saw without constructor
    //Even if multiple value is given only one is displayed for one variable since constructor runs only once for each object.
    public Student5ConstructorMethod(String n, int r){
        name = n;
        roll = r;
        System.out.println("Constructor Called:");
    }

    public void displayInfo(){
        System.out.println("Student's Name is: "+name);
        System.out.println("Student Roll is: "+roll);
    }

    public static void main(String[] args) {
        Student5ConstructorMethod student1 = new Student5ConstructorMethod("Niraj", 33);
        student1.displayInfo();

        System.out.println("==================");

        Student5ConstructorMethod student2 = new Student5ConstructorMethod("Raj", 103);
        student2.displayInfo();

    }

}
