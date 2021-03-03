package day10;

import javax.print.attribute.standard.Finishings;

public class Array8 {

    public static void main(String[] args) {
        String [][] names = {{"Ram", "sam", "gyan"}, {"raja", "Babu", "hari"}, {"gita", "sita", "Rita"}};

        for (int i = 0; i < names.length; ++i) {
            for (int j = 0; j < names.length; ++j) {
                System.out.print(names[i][j] + " ");
            }
            System.out.println();
        }
    }
}
