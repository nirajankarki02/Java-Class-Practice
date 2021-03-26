package day19;

public class Thread3 {

    public static void main(String[] args) {
        //These are anonymous inner class
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello from Thread.....!!!!!");
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello from Thread.....!!!!!");
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello from Thread.....!!!!!");
            }
        });
        t1.start();
        t2.start();
        t3.start();
    }
}
