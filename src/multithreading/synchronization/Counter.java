package multithreading.synchronization;

public class Counter {
    private int count = 0;

    // this: Here this refers to the instance which is being accessed by more than one thread at a time.
    // Using synchronized keyword, we make the instance accessible to only one thread at a time.
    // the code snippet which needs synchronization is called critical section. And the synchronization is
    // also known as mutual exclusion.
    // We could also use synchronized keyword at method level as below

    /*public synchronized void increment() {
        count++;
    }*/

    // So, making the shared resources accessible to only one thread at a time is known as locking.
    public void increment() {
        synchronized (this) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}
