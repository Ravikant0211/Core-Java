package multithreading.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairLockExample {

    private final Lock lock = new ReentrantLock(true); // fairness defines that one thread will start and finish
    // before second thread and so on...
    // If fairness is set to true and there are more than 20 threads (condition of race), then each thread must get chance to execute, which is not
    // necessary otherwise.
    // For example, if 'thread 1' starts first then it will acquire the lock and release the lock firstly. Then only second
    // thread can start acquiring the lock.

    public void accessResource() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " acquired the lock.");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            System.out.println(Thread.currentThread().getName() + " released the lock.");
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        FairLockExample example = new FairLockExample();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                example.accessResource();
            }
        };

        Thread thread1 = new Thread(task, "Thread 1");
        Thread thread2 = new Thread(task, "Thread 2");
        Thread thread3 = new Thread(task, "Thread 3");
        Thread thread4 = new Thread(task, "Thread 4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
