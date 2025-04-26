package multithreading.executorFramework;

import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Test3 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // -------------------------------------------------------------------------

        // Example: 1
        /* Future<Integer> submit = executorService.submit(() -> 1 + 2);
        Integer i = submit.get();
        System.out.println("Sum is " + i); // Sum is 3
        executorService.shutdown();
        System.out.println(executorService.isShutdown());  // true
        System.out.println(executorService.isTerminated()); */// false

        //--------------------------------------------------------------------------

        // Example: 2
        /*Callable<Integer> callable1 = () -> {
            Thread.sleep(1000);
            System.out.println("Task 1");
            return 1;
        };
        Callable<Integer> callable2 = () -> {
            Thread.sleep(1000);
            System.out.println("Task 2");
            return 2;
        };
        Callable<Integer> callable3 = () -> {
            Thread.sleep(1000);
            System.out.println("Task 3");
            return 3;
        };

        List<Callable<Integer>> list = Arrays.asList(callable1, callable2, callable3);

        List<Future<Integer>> futures = null;
        try {
            futures = executorService.invokeAll(list, 1, TimeUnit.SECONDS); // waits for the completions of all tasks
        } catch (InterruptedException e) {

        }

        for (Future<Integer> f: futures) {
            try {
                System.out.println(f.get());
            } catch (CancellationException e) {

            } catch (InterruptedException e) {

            } catch (ExecutionException e) {

            }
        }
        executorService.shutdown();
        System.out.println("Hello world!"); // always prints at the end*/

        // ---------------------------------------------------------------------

        Callable<Integer> callable1 = () -> {
            Thread.sleep(1000);
            System.out.println("Task 1");
            return 1;
        };
        Callable<Integer> callable2 = () -> {
            Thread.sleep(1000);
            System.out.println("Task 2");
            return 2;
        };
        Callable<Integer> callable3 = () -> {
            Thread.sleep(1000);
            System.out.println("Task 3");
            return 3;
        };

        List<Callable<Integer>> list = Arrays.asList(callable1, callable2, callable3);

//      Executes the given tasks, returning the result of one that has completed successfully (i.e., without throwing an exception),
//      if any do. Upon normal or exceptional return, tasks that have not completed are cancelled.
        try {
            Integer i = executorService.invokeAny(list);
            System.out.println(i);
        } catch (InterruptedException e) {

        } catch (ExecutionException e) {

        }

        executorService.shutdown();
    }

}
