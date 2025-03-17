package _java.Multithreading.Executors;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecuters {
    public static void main(String[] args) {
        ScheduledExecutorService schedule = Executors.newScheduledThreadPool(1);
        schedule.schedule(() -> System.out.println("schedule - Printing after 5 seconds delay"), 5, TimeUnit.SECONDS);

        schedule.scheduleAtFixedRate(
                () -> System.out.println("scheduleAtFixedRate - Printing after every 5 seconds delay"), 5, 5,
                TimeUnit.SECONDS); // on every 5 seconds

        schedule.scheduleWithFixedDelay(
                () -> System.out.println("scheduleWithFixedDelay - Printing after every 5 seconds delay"), 5, 5,
                TimeUnit.SECONDS); // * on every 5 seconds, after each execution it will wait for 5 seconds

        // ! schedule.shutdown(); // this will shutdown immediately without executing
        // scheduleAtFixedRate, because it is a infinite loop.
        // To resolve this issue
        schedule.schedule(() -> {
            System.out.println("schedule - Printing after 20 seconds delay");
            schedule.shutdown();
        }, 20, TimeUnit.SECONDS);
    }
}
