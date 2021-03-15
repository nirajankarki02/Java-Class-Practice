package day12;

public class AbstractChild extends Abstract{
    @Override //abstract need override for it to work so
    // "private","protected" and "static" cannot be written on abstract method
    public void draw() {
        System.out.println("traingle");
    }
}
