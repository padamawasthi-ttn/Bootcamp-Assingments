/*
Use a singleThreadExecutor, newCachedThreadPool() and newFixedThreadPool() to submit a list of tasks and wait for completion of all tasks.
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Seventh_Ques {

    public static void main(String[] args) throws InterruptedException {

        Runnable task = () -> {
            System.out.println(
                    Thread.currentThread().getName() + " is running"
            );
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        };

        // Single Thread Executor
        ExecutorService single = Executors.newSingleThreadExecutor();
        single.submit(task);
        single.submit(task);
        single.submit(task);
        single.shutdown();
        single.awaitTermination(5, TimeUnit.SECONDS);

        System.out.println("SingleThreadExecutor finished\n");

        // Cached Thread Pool
        ExecutorService cached = Executors.newCachedThreadPool();
        cached.submit(task);
        cached.submit(task);
        cached.submit(task);
        cached.shutdown();
        cached.awaitTermination(5, TimeUnit.SECONDS);

        System.out.println("CachedThreadPool finished\n");

        // fixed Thread Pool (2 threads)
        ExecutorService fixed = Executors.newFixedThreadPool(2);
        fixed.submit(task);
        fixed.submit(task);
        fixed.submit(task);
        fixed.shutdown();
        fixed.awaitTermination(5, TimeUnit.SECONDS);

        System.out.println("FixedThreadPool finished");
    }
}


