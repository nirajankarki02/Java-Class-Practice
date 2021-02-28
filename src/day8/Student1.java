package day8;
//Ways to assign Variables
public class Student1 {
    //1. This gives default value since no proper name and roll are entered
    // default value of String is null and int is 0 which will be displayed.

    //The below variables are called: non-static variable, instance variable, member's data, properties, attributes, field
    String name;
    int roll;

    public static void main(String[] args) {
        Student1 student1 = new Student1();
        System.out.println(student1.name);
        System.out.println(student1.roll);
        System.out.println("=======================");
        Student1 student2 = new Student1();
        System.out.println(student2.name);
        System.out.println(student2.roll);
        System.out.println("=======================");
    }
}
