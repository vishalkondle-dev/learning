package _java.Multithreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        CompletableFuture<String> cf1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("cf1");
            } catch (Exception e) {
                System.out.println(e);
            }
            return "Hello";
        });

        CompletableFuture<String> cf2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("cf2");
            } catch (Exception e) {
                System.out.println(e);
            }
            return "World";
        });

        CompletableFuture<Void> cf3 = CompletableFuture.allOf(cf1, cf2);
        // cf3.join(); // this will make main thread wait for cf1 and cf2 to finish
        System.out.println("Main");
    }
}
