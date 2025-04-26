package multithreading.executorFramework;

import java.util.concurrent.*;

public class CyclicBarrierExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        int numberOfServices = 3;
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfServices);
        CyclicBarrier barrier = new CyclicBarrier(numberOfServices, new Runnable() {
            @Override
            public void run() {
                System.out.println("All services are up and running.");
            }
        });
        executorService.submit(new DependentServicev2(barrier));
        executorService.submit(new DependentServicev2(barrier));
        executorService.submit(new DependentServicev2(barrier));
        System.out.println("Main");
        executorService.shutdown();


    }
}

class DependentServicev2 implements Callable<String> {

    private final CyclicBarrier barrier;

    public DependentServicev2(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " service started.");
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName() + " awaits at the Barrier");
        barrier.await();
        return "ok";
    }
}

// CyclicBarrier:
// 1. Cyclic Barrier doesn't block the Main thread, unlike CountDownLatch.
// 2. You can use it when you want all your threads to wait at a certain point, before any of them proceed.
