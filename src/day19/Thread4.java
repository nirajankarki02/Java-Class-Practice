package day19;

public class Thread4 extends Thread{

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
        Thread4 t1 = new Thread4();
        Thread4 t2 = new Thread4();
        Thread4 t3 = new Thread4();

        t1.start();
        t2.start();
        t3.start();

    }
}
