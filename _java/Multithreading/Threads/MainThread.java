package _java.Multithreading.Threads;

public class MainThread {
    public static void main(String[] args) {
        ThreadClass t0 = new ThreadClass();
        RunnableInterface ri = new RunnableInterface();
        Thread t1 = new Thread(ri);

        t0.start();
        t1.start();
        for (int i = 0; i < 50; i++) {
            System.out.println("Main Thread - " + i);
        }
    }
}
