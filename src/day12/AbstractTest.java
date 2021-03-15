package day12;

public class AbstractTest {

    public static void main(String[] args) {
        //Abstract test = new Abstract(); //Cannot make new Abstract class
        Abstract test = new AbstractChild(); //Implicit typecasting
        test.draw();
    }
}
