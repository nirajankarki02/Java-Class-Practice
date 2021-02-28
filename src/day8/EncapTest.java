package day8;

public class EncapTest {
    public static void main(String[] args) {
        Encapsulation e1 = new Encapsulation();
        e1.setEmployeeName("Ram");
        e1.setEmployeeId(33);
        System.out.println(e1.getEmployeeName());
        System.out.println(e1.getEmployeeId());
    }
}
