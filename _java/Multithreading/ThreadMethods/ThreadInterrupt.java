package _java.Multithreading.ThreadMethods;

public class ThreadInterrupt extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        ThreadInterrupt t1 = new ThreadInterrupt();
        t1.start();
        t1.interrupt();
    }
}
