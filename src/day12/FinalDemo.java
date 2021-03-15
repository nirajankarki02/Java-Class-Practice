package day12;

public /*final*/class FinalDemo {
    //if there is final in the class, it cannot be inherited or extended

    public /*final*/void sayHello(){
        System.out.println("hello from parent...");
        //we cannot override final method as well
    }

    public /*final*/ FinalDemo (){
        //CANNOT use "final" keyword in Constructor
    }
}
