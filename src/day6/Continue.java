package day6;

public class Continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++)
        {
            if (i == 3)
            {
                continue;// when i = 3, it takes back to for loop so 3 is not printed
            }
            System.out.println(i);// 1 2 4 5
        }
        System.out.println("out of Loop");
    }
}
