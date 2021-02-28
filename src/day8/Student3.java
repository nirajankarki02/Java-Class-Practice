package day8;

public class Student3 {
    //3. Values for each variable can be given separately. Each variable has its own output.

    String name;
    int roll;

    public static void main(String[] args) {
        Student3 student1 = new Student3();
        student1.name = "Niraj";
        student1.roll = 33;
        System.out.println(student1.name);
        System.out.println(student1.roll);
        System.out.println("=======================");

        Student3 student2 = new Student3();
        student2.name = "Raj";
        student2.roll = 103;
        System.out.println(student2.name);
        System.out.println(student2.roll);
        System.out.println("=======================");
    }
}
