package day19;

import java.util.Random;
import java.util.concurrent.*;

public class Task2 implements Callable {


    String name;
    public Task2(String name){
        this .name = name;
    }


    @Override
    public Integer call() throws Exception {
        /*
        int sum = 0;
        for (int i = 0; i < 5; ++i){
            sum += i;
        }
        return sum;
        */

        Random random = new Random();
        Integer randomNumber = random.nextInt(5);
        Thread.sleep(randomNumber*1000);
        return randomNumber;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //For "Callable" we have to make pool:
        ExecutorService executors = Executors.newSingleThreadExecutor();
        Future<Integer> future = executors.submit(new Task2("task1"));
        Integer n = future.get();
        System.out.println(n);
        executors.shutdown();

        System.out.println(future.isDone());
        System.out.println(future.isCancelled());

        /*
        FutureTask[] randomNumberTasks = new FutureTask[5];

        for (int i =0; i < 5; ++i){
            Callable callable = new Task2();
            randomNumberTasks[i] = new FutureTask<>(callable);
            Thread t = new Thread(randomNumberTasks[i]);
            t.start();
        }

        for (int i =0; i < 5; ++i){
            System.out.println(randomNumberTasks[i].get());
        }
        */

    }
}
