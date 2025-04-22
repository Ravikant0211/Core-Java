package multithreading.threads;

public class MyThread extends Thread {

//    public MyThread(String name) {
//        super(name);
//    }

    @Override
    public void run() {

//        for (int i = 0; i < 5; i++) {
//            System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + "- count: " + i);
//            try {
//                Thread.sleep(1000);
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//        }

        while (true) {
            System.out.println("Hello world!");
        }
    }

    public static void main(String[] args) throws InterruptedException {
//        MyThread low = new MyThread("Low Priority Thread");
//        MyThread medium = new MyThread("Medium Priority Thread");
//        MyThread high = new MyThread("High Priority Thread");
//        low.setPriority(Thread.MIN_PRIORITY);
//        medium.setPriority(Thread.NORM_PRIORITY);
//        high.setPriority(Thread.MAX_PRIORITY);
//        low.start();
//        medium.start();
//        high.start();


//        t1.join();
//        System.out.println("Hello world!");

        MyThread myThread = new MyThread();
        myThread.setDaemon(true);
        myThread.start();
        System.out.println("Main done");
    }
}

// start run sleep join setPriority interrupt yield setDaemon

// DAEMON THREADS- works in background. Jvm does not wait for them.
