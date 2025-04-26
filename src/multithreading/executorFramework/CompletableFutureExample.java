package multithreading.executorFramework;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {
    public static void main(String[] args) {
        // This creates a Daemon thread, that's why Main thread won't wait for it to complete.
        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("Worker");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "ok";
        });

//        String s = null;
//        try {
//            s = completableFuture.get();
//        } catch (InterruptedException | ExecutionException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(s);
//        System.out.println("Main Thread is executing.");

        CompletableFuture<String> f2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("Worker");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "ok";
        });

        CompletableFuture<Void> f = CompletableFuture.allOf(f1, f2);
        f.join();
//        f.get() // This throws checkedException
        System.out.println("Main");
    }
}

// Completable future was introduced in 'Java 8' to handle asynchronous programming.
// Multithreading is used to achieve asynchronous behavior (non-blocking execution).