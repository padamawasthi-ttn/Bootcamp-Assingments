/*
WAP to return a random integert value from a thread execution using Future.
 */

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class Eight_Ques {

    public static void main(String[] args)
            throws ExecutionException, InterruptedException {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Submit Callable task
        Future<Integer> future = executor.submit(new RandomNumberTask());

        // Get result from Future
        int result = future.get();
        System.out.println("Received result in main thread: " + result);

        executor.shutdown();
    }
}

class RandomNumberTask implements Callable<Integer> {

    public Integer call() {
        Random random = new Random();
        int value = random.nextInt(100); // random number 0–99
        System.out.println("Generated number in thread: " + value);
        return value;
    }
}



