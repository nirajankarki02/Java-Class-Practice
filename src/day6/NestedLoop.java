package day6;

public class NestedLoop {
    public static void main(String[] args) {
        for (int i = 1; i<=3; i++)
        {
            for (int j = 1; j<=3; j++)
            {
                //System.out.print(i+" " +j+" "); // "print" prints in one line
                System.out.println(i+" " +j+" ");
                if (i == 3)
                    break;
            }
            System.out.println();
        }
        System.out.println("out of loop"); // "println" prints in different lines
    }
}
