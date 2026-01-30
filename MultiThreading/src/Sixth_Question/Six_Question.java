/*
Improve the code written in Basics of Multi Threading Part 1 exercise question 4 to handle the deadlock using reentract lock.
 */
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.TimeUnit;

class Six_Question {

    static Lock lock1 = new ReentrantLock();
    static Lock lock2 = new ReentrantLock();

    public static void main(String[] args) {

        // Thread 1
        Thread t1 = new Thread(() -> {
            try {
                if (lock1.tryLock(2, TimeUnit.SECONDS)) {      // here using try lock instead of normal lock with time bound
                    System.out.println("Thread 1 acquired lock1");

                    Thread.sleep(1000);

                    if (lock2.tryLock(2, TimeUnit.SECONDS)) {        // here using try lock instead of normal lock with time bound
                        try {
                            System.out.println("Thread 1 acquired lock2");
                        } finally {
                            lock2.unlock();
                        }
                    } else {
                        System.out.println("Thread 1 could not acquire lock2");
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                if (lock1.tryLock()) {
                    lock1.unlock();
                }
            }
        });

        // Thread 2
        Thread t2 = new Thread(() -> {
            try {
                if (lock2.tryLock(2, TimeUnit.SECONDS)) {        // here using try lock instead of normal lock with time bound
                    System.out.println("Thread 2 acquired lock2");

                    Thread.sleep(1000);

                    if (lock1.tryLock(2, TimeUnit.SECONDS)) {       // here using try lock instead of normal lock with time bound
                        try {
                            System.out.println("Thread 2 acquired lock1");
                        } finally {
                            lock1.unlock();
                        }
                    } else {
                        System.out.println("Thread 2 could not acquire lock1");
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                if (lock2.tryLock()) {
                    lock2.unlock();
                }
            }
        });

        t1.start();
        t2.start();
    }
}

