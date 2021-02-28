package day9;

public class This4MethodReturn {

    public This4MethodReturn getObject(){
        //This4MethodReturn ob = new This4MethodReturn();
        //return ob; OR
        //return new This4(); OR
        return this; // this does not need This4MethodReturn ob = new This4MethodReturn();
    }

    public void greet (){
        System.out.println("Good Afternoon..");
    }

    public static void main(String[] args) {
        This4MethodReturn ob = new This4MethodReturn();
        This4MethodReturn obj = ob.getObject();
        obj.greet();
    }
}
