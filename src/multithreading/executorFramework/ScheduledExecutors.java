package multithreading.executorFramework;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutors {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
//        Method: 1
//        scheduler.schedule(() -> System.out.println("Task scheduled after 5 second delay!"), 5, TimeUnit.SECONDS);
//        scheduler.shutdown();


//        Method: 2 - task overlapping occurs, if task does not complete with in the time period interval.
       /* scheduler.scheduleAtFixedRate(
                () -> System.out.println("Task executed after 5 seconds delay!"),
                5,
                5,
                TimeUnit.SECONDS
        );

        scheduler.schedule(() -> {
            System.out.println("Initializing shutdown...");
            scheduler.shutdown();
        }, 20, TimeUnit.SECONDS);*/


//         Method: 3 - No overlapping of task, run the next task with the given delay after completion of current task.
        ScheduledFuture<?> scheduledFuture = scheduler.scheduleWithFixedDelay(
                () -> System.out.println("Task executed after 5 seconds delay!"),
                5,
                5,
                TimeUnit.SECONDS
        );

        scheduledFuture.isDone();

        scheduler.schedule(() -> {
            System.out.println("Initializing shutdown...");
            scheduler.shutdown();
        }, 20, TimeUnit.SECONDS);

    }
}
