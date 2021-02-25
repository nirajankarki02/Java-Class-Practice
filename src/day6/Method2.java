package day6;

public class Method2 {

    public static String greet(){
        String gr = "Hello, Good Morning";
        return gr;
    }

    public static int findMax(int a, int b){
        int max = 0;
        if (a>b)
        {
            max = a;
        }
        else
        {
            max = b;
        }
        return max;
    }

    public static void main(String[] args) {
        String g = greet();//Since the Method above is Static, no need to make another object to call Method
        System.out.println(g);

        int m = findMax(5, 10);
        System.out.println("max number is "+m);
    }
}
