package _java.Multithreading.Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorsExample {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        // Thread[] threads = new Thread[9];
        // for (int i = 1; i < 10; i++) {
        // int finalI = i;
        // threads[i - 1] = new Thread(() -> System.out.println(finalI + " - " +
        // factorial(finalI)));
        // threads[i - 1].start();
        // }
        // //! The Problem - The main thread does NOT wait for child threads to finish.
        // //! this will be exectued before the child threads
        // System.out.println("Time taken : " + (System.currentTimeMillis() - start));

        // * The Solution - Executors
        ExecutorService executor = Executors.newFixedThreadPool(9);
        for (int i = 1; i < 10; i++) {
            int finalI = i;
            executor.submit(() -> {
                long result = factorial(finalI);
                System.out.println(finalI + " - " + result);
            });
        }
        executor.shutdown();
        try {
            while (!executor.awaitTermination(10, TimeUnit.MILLISECONDS)) {
                System.out.println("Waiting for termination...");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Time taken : " + (System.currentTimeMillis() - startTime));
    }

    public static int factorial(int n) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
