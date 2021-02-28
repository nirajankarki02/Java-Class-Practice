package day9;

public class This3MethodArgument {

    public void display(){
        System.out.println("Hey I am 'this'");
    }

    public void print(This3MethodArgument ob){
        ob.display();
    }

    public void show(){
        print(this); // this is same as: This3 ob = new This3(); print(ob); we can simply so print(this) as well
    }

    public static void main(String[] args) {
        This3MethodArgument ob = new This3MethodArgument();
        ob.show();
    }
}
