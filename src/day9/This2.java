package day9;

public class This2 {

    String name;
    int age;

    /*
    public This2(String n, int a){
        name = n; // Name is Raju
        age = a; // age is 23
    }


    public This2(String name, int age){
        name = name; // Name is null
        age = age;// age is 0
    }

     */

    //to avoid getting default value like above we can use 'this':
    public This2(String name, int age){
        this.name = name; // Name is Raju
        this.age = age;// age is 23
    }
    public void displayInfo(){
        System.out.println("Name is "+name);
        System.out.println("age is "+age);
    }

    public static void main(String[] args) {
        This2 ob1 = new This2("Raju", 23);
        ob1.displayInfo();
    }
}
