package multithreading.executorFramework;

import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Callable<String> callable = () -> "Hello";
        // The Callable interface is similar to Runnable, in that both are designed for classes whose instances
        // are potentially executed by another thread. A Runnable, however, does not return a result and cannot
        // throw a checked exception.
        Future<String> future = executorService.submit(callable);
        System.out.println(future.get()); // Waits if necessary for the computation to complete, and then retrieves its result
        if (future.isDone()) {
            System.out.println("The task is done.");
        }
        executorService.shutdown();
    }
}

// Difference between 'Callable' & 'Runnable'
// 1. Use Callable if there is some return value, otherwise Runnable.
// 2. Callable has 'call()' method, while Runnable has 'run()' method.
// 3. 'call()' method in 'Callable' throws Exception in its method signature, while 'run()' method of 'Runnable' doesn't.
