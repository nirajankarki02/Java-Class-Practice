package day19;

public class Thread6 extends Thread{

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        Thread6 t1 = new Thread6();
        Thread6 t2 = new Thread6();
        Thread6 t3 = new Thread6();

        //Setting priority of thread
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }

}
