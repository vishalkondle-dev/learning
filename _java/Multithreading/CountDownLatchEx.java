package _java.Multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchEx {

    public static void main(String[] args) throws InterruptedException {
        int numberOfThreads = 3;
        ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads);
        CountDownLatch countDownLatch = new CountDownLatch(numberOfThreads);
        executor.submit(new DependantService(countDownLatch));
        executor.submit(new DependantService(countDownLatch));
        executor.submit(new DependantService(countDownLatch));
        countDownLatch.await(); // this will wait for all threads to complete
        // countDownLatch.await(5, TimeUnit.SECONDS); // this will wait for all threads
        // to complete for 5 seconds
        System.out.println("main thread waiting for dependant threads to complete");
        executor.shutdown(); // this will shutdown after all already running threads complete
        executor.shutdownNow(); // this will shutdown immediately, and stop all running threads
    }

}

class DependantService implements Callable<String> {
    private final CountDownLatch countDownLatch;

    public DependantService(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public String call() {
        try {
            Thread.sleep(2000);
            System.out.println("DependantService");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            countDownLatch.countDown();
        }
        return "ok";
    }
}