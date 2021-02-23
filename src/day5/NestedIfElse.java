package day5;

public class NestedIfElse {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        int c = 5;

        if (a > b)
        {
            if (a > c)
            {
                System.out.println("a is largest");
            }
            else {
                System.out.println("c is largest.");
            }
        }
        else
        {
            System.out.println("a is smaller than b but c may be larger/smaller than a.");
        }

        System.out.println("==================");
    }
}
