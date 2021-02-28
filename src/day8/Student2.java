package day8;

public class Student2 {
    //2. This gives same names to different variables
    // student1 and student2 has same name and same roll
    String name = "Nirajan Karki";
    int roll = 103;

    public static void main(String[] args) {
        Student2 student1 = new Student2();
        System.out.println(student1.name);
        System.out.println(student1.roll);
        System.out.println("=======================");
        Student2 student2 = new Student2();
        System.out.println(student2.name);
        System.out.println(student2.roll);
        System.out.println("=======================");
    }
}
