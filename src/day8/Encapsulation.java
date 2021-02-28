package day8;

//Encapsulation: is used to encapsulate data we do not want to share with outsiders
public class Encapsulation {
    private String employeeName;
    private int employeeId;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    /* These getter and setter in real world is called from different class (EncapTest)
    public static void main(String[] args) {
        Encapsulation e1 = new Encapsulation();
        e1.setEmployeeName("Ram");
        e1.setEmployeeId(33);
        System.out.println(e1.getEmployeeName());
        System.out.println(e1.getEmployeeId());
    }

     */
}
