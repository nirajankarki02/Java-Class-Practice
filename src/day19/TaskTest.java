package day19;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskTest {

    //Thread Pooling
    public static void main(String[] args) {
        ExecutorService executors = Executors.newFixedThreadPool(3);
        executors.execute(new Task1("task1"));
        executors.execute(new Task1("task2"));
        executors.execute(new Task1("task3"));
        executors.execute(new Task1("task4"));
        executors.execute(new Task1("task5"));

        executors.shutdown();
    }
}
