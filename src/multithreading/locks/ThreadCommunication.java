package multithreading.locks;

class SharedResource {
    private int data;
    private boolean hasData;
    
    public synchronized void produce(int value) {
        while (hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        data = value;
        System.out.println("Produced: " + value);
        hasData = true;
        notify();
    }
    
    public synchronized int consume() {
        while(!hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        hasData = false;
        System.out.println("Consumed: " + data);
        notify();
        return data;
    }
}

class Producer implements  Runnable {
    private SharedResource resource;
    
    public Producer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            resource.produce(i);
        }
    }
}

class Consumer implements Runnable {
    private SharedResource resource;

    public Consumer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            int value = resource.consume();
        }
    }
}

public class ThreadCommunication {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Thread producerThread = new Thread(new Producer(resource));
        Thread consumerThread = new Thread(new Consumer(resource));
        
        producerThread.start();
        consumerThread.start();
    }
}

// Methods:

// There are three methods, which are used for thread communication.
// 1. wait(): Tells current thread to release the lock and wait until some other thread notifies, meaning runs notify() or notifyAll().
// 2. notify(): Wakes up single thread that is waiting.
// 3. notifyAll(): Wakes up all threads that are waiting.
// These methods can only be used inside 'synchronized' method or block.

// Thread safety:
// Thread safety is a stage, when multiple threads tries to access the same shared resource and do not result in some unexpected
// result or race condition.
// We try to achieve thread safety using synchronized keyword, ReentrantLock, Read/write lock, and wait/notify/notifyAll etc.