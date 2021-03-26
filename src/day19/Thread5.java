package day19;

public class Thread5 extends Thread{

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++){
            try {
                System.out.println(i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //System.out.println(i);
        }

    }

    public static void main(String[] args) {
        Thread5 t1 = new Thread5();
        Thread5 t2 = new Thread5();
        Thread5 t3 = new Thread5();

        t1.start();
        try {
            t1.join(); //join helps to complete t1 and then run t2 and t3 simultaneously
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        t3.start();
    }
}
