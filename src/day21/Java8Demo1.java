package day21;

import day20.Thread7;

public class Java8Demo1 {
//Use of LAMDA EXPRESSION on Java8
    //LAMDA EXPRESSION  can be used in any functional interface
    public static void main(String[] args) {
        /*
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello from thread..");
            }
        });
        t1.start();
        */
        //Java8 makes above code with in "/*....*/" much easier by the use of "lambda" shown below

        new Thread(() -> System.out.println("hello from thread..")).start(); //this is good for one line command if
        // multiple lines of commands are required "{...}" is required
    }

    //Like below

    /*
      new Thread(() -> {
      System.out.println("hello from thread..");
      System.out.println("hello from thread222222..");
      }).start();
     */
}
