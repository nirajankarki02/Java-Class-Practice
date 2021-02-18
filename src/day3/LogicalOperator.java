package day3;

public class LogicalOperator {
    public static void main(String[] args) {
        //Operators

        //5. Logical Operator:
        // && (and), ||(OR), !(not)

        System.out.println(true && true);//true
        System.out.println(true && false);//false
        System.out.println(false && true);//false
        System.out.println(false && false);//false

        System.out.println("=============");

        System.out.println(true || true);//true
        System.out.println(true || false);//true
        System.out.println(false || true);//true
        System.out.println(false || false);//false

        System.out.println("=============");

        System.out.println(!true);//false
        System.out.println(!false);//true

    }
}
