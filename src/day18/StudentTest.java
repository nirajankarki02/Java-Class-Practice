package day18;

import java.util.Set;
import java.util.TreeSet;

public class StudentTest {

    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(new Student());
        students.add(new Student("ram", 45));
        students.add(new Student("sam", 25));
        students.add(new Student("kam", 55));
        students.add(new Student("bam", 15));

        System.out.println(students);// [bam 15, sam 25, ram 45, kam 55]

        //student with highest age
        System.out.println(students.last());// Kam 55
    }
}
