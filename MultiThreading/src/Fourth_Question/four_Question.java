/*
Write a code to simulate a deadlock in java
 */

public class four_Question {

    static final Object lock1= new Object();
    static final Object lock2= new Object();

    public static void main(String[] args) {

        //Thread 1
        Thread t1 = new Thread(() -> {
            synchronized (lock1){
                System.out.println("Thread 1 acquired lock1 ");

                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("Thread 1 waiting for lock2 ");
                synchronized(lock2){
                    System.out.println("Thread 1 acquiring lock 2");
                }
            }
        });


        //Thread 2
        Thread t2 = new Thread(() -> {
            synchronized (lock2){
                System.out.println("Thread 2 acquired lock2 ");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("Thread 2 waiting for lock1");
                synchronized(lock1){
                    System.out.println("Thread 2 acquiring lock 1");
                }
            }
        });


        //starting both threads
        t1.start();
        t2.start();
    }
}
