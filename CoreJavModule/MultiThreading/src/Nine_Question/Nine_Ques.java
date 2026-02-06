/*
WAP to showcase the difference between shutdown() and shutdownNow().
 */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Nine_Ques  {

    static class MyTask implements Runnable {
        private final int id;

        MyTask(int id) {
            this.id = id;
        }

        public void run() {
            System.out.println("Task " + id + " started by " +
                    Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Task " + id + " interrupted");
            }
            System.out.println("Task " + id + " finished");
        }
    }

    public static void main(String[] args) throws InterruptedException {

        // -------- shutdown() example --------
        System.out.println("Using shutdown()");
        ExecutorService executor1 = Executors.newFixedThreadPool(2);

        executor1.submit(new MyTask(1));
        executor1.submit(new MyTask(2));
        executor1.submit(new MyTask(3));

        executor1.shutdown(); // graceful shutdown

        Thread.sleep(1000);
        System.out.println("shutdown() called\n");

        // -------- shutdownNow() example --------
        System.out.println("Using shutdownNow()");
        ExecutorService executor2 = Executors.newFixedThreadPool(2);

        executor2.submit(new MyTask(4));
        executor2.submit(new MyTask(5));
        executor2.submit(new MyTask(6));

        Thread.sleep(1000);
        executor2.shutdownNow(); // forceful shutdown
        System.out.println("shutdownNow() called");
    }
}

