package multithreading.executorFramework;

import java.util.concurrent.Callable;

public class RunnableTask implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
