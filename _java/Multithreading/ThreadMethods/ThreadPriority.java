package _java.Multithreading.ThreadMethods;

public class ThreadPriority extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 100000; j++) {
                Math.random();
            }
            System.out.println(
                    Thread.currentThread().getName() + " - " + Thread.currentThread().getPriority() + " - " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
    }

    public static void main(String[] args) {
        ThreadPriority l = new ThreadPriority();
        ThreadPriority m = new ThreadPriority();
        ThreadPriority h = new ThreadPriority();

        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);

        l.start();
        m.start();
        h.start();
    }
}
