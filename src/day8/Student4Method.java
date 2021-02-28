package day8;
//The previous three way are not proper way to assign variables. It is better
//practice to use Method for the purpose as below:

//Even though this is a better practice but there are chances to have the assigned value of variable
//chance eg. student1 can get different names even though it is suppose to be unique value
public class Student4Method {
    //4. This gives default value since no proper name and roll are entered
    // default value of String is null and int is 0 which will be displayed.

    String name;
    int roll;

    //This is member's behavior
    public void assignInfo(String n, int r){
        name = n;
        roll = r;
    }

    public void displayInfo(){
        System.out.println("Name is: "+name);
        System.out.println("Roll is: "+roll);
    }

    public static void main(String[] args) {
        Student4Method student1 = new Student4Method();
        student1.assignInfo("Niraj", 33);
        student1.displayInfo();
        //System.out.println(student1.name);
        //System.out.println(student1.roll);

        //Demonstrating weakness of this method, multiple value of same variable
        student1.assignInfo("Ram", 23);
        student1.displayInfo();

        System.out.println("=======================");

        Student4Method student2 = new Student4Method();
        student2.assignInfo("Raj", 103);
        student2.displayInfo(); // this can be used instead of following two lines
        //System.out.println(student2.name);
        //System.out.println(student2.roll);

        //Demonstrating weakness of this method, multiple value of same variable
        student2.assignInfo("Yadav", 13);
        student2.displayInfo();
        System.out.println("=======================");
    }
}
