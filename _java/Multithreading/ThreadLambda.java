package _java.Multithreading;

public class ThreadLambda {
    public static void main(String[] args) {
        Thread t1 = new Thread(
                () -> {
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Thread 1 - " + i);
                    }
                });
        t1.start();

        Thread t2 = new Thread(() -> System.out.println("Thread 2"));
        t2.start();
    }
}
