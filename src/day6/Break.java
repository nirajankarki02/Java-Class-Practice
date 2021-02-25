package day6;

public class Break {
    //Break takes you out of loop
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++)
        {
            //System.out.println(i); 1 2 3
            if (i == 3)
            {
                break;

            }
            System.out.println(i);// 1 2
        }
        System.out.println("out of Loop");
    }
}
