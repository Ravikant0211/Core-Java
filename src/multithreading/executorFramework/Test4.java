package multithreading.executorFramework;

import java.util.concurrent.*;

public class Test4 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<Integer> future = executorService.submit(() -> {
            Thread.sleep(2000);
            System.out.println("Hello");
            return 42;
        });

//        try {
////            Integer i = future.get();
//            Integer i = future.get(1, TimeUnit.SECONDS);
//            System.out.println(future.isDone()); // true
//            System.out.println(i); // 42
//        } catch (InterruptedException | ExecutionException | TimeoutException e) {
//            System.out.println("Exception occured: " + e);
//        }

//        future.cancel(true); // It cancels the task irrespective of its running state.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Exception occured: " + e);
        }
        future.cancel(false); // It doesn't cancel the task, if it is running. Only cancels, if not running.
        System.out.println(future.isCancelled()); // true
        System.out.println(future.isDone()); // true
        executorService.shutdown();
    }
}