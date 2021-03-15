package day12;

public class Derived extends Base{

    public Derived(){
        System.out.println("derived default constructor....");
    }

    //Another method (argumented)
    public Derived(int a){
        System.out.println("derived arg constructor....");
    }
}
