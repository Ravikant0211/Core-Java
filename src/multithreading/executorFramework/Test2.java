package multithreading.executorFramework;

import java.util.concurrent.*;

public class Test2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
//      Submits a Runnable task for execution and returns a Future representing that task.
//      The Future's get method will return null upon successful completion.
//      Future<?> future = executorService.submit(() -> System.out.println("Hello"));


//      Submits a Runnable task for execution and returns a Future representing that task.
//      The Future's get method will return the given result upon successful completion.
        Future<String> future = executorService.submit(() -> System.out.println("Hello"), "success");
        System.out.println(future.get()); // success
        executorService.shutdown();
    }
}