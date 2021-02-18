package day3;

public class ConditionalOperator {
    public static void main(String[] args) {
        //Operators:

        //6. Conditional(Ternary) Operator:
        // ?:

        int a = 5;
        int b = 60;

        if (a>b){
            System.out.println("a is greater than b.");
        } else{
            System.out.println("b is greater than a.");
        }
        //ABOVE if else conditional statement can also be written as:

        System.out.println("=============");

        String s = (a>b)?"a is greater than b." : "b is greater than a.";
        System.out.println(s);

        //Another example with boolean

        boolean r = (a>b)? true : false;
        System.out.println(r);

    }
}
