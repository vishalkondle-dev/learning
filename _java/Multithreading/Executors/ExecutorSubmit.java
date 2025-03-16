package _java.Multithreading.Executors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorSubmit {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<?> future2 = executor.submit(() -> System.out.println("Hello from runnable")); // will always return null
        Future<?> future = executor.submit(() -> "Hello from callable");
        Future<?> future1 = executor.submit(() -> System.out.println("Hello from runnable with result"),
                "Hello from runnable with result");
        System.out.println(future.get()); // Wait for the task to complete
        System.out.println(future1.get()); // Wait for the task to complete
        System.out.println(future2.get()); // Wait for the task to complete
        executor.shutdown();
        Thread.sleep(1);
        System.out.println(executor.isTerminated()); // if dont wait for atleast 1 second it will return false
        System.out.println(executor.isShutdown());

        // invokeAll() // will wait for all tasks to complete
        // invokeAny() // will wait for first task to complete, and return direct result
        // of that task
    }
}
