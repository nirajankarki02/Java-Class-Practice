package day19;

/*
"implements" are used to call "interface" ; implements can achieve multiple inheritance ; more than one "interface" can be inherited using comma with implements
            While
"extends" are used to call "class" ; extends cannot achieve multiple inheritance ; more than one "Class" cannot be inherited with extends
 */
public class Thread2 implements Runnable{

    @Override
    public void run() {
        System.out.println("hello from thread....");
    }

    public static void main(String[] args) {
        Thread2 th1 = new Thread2();
        Thread2 th2 = new Thread2();
        Thread2 th3 = new Thread2();

        //When we use Runnable, we have to call thread differently as below:
        Thread t1 = new Thread(th1);
        Thread t2 = new Thread(th2);
        Thread t3 = new Thread(th3);

        t1.start();
        t2.start();
        t3.start();
    }
}
