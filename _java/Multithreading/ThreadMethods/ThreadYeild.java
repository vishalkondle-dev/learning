package _java.Multithreading.ThreadMethods;

public class ThreadYeild extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            Thread.yield(); // ! hint to cpu to switch to another thread
        }
    }

    public ThreadYeild(String s) {
        super(s);
    }

    public static void main(String[] args) {
        ThreadYeild t1 = new ThreadYeild("Thread 1");
        ThreadYeild t2 = new ThreadYeild("Thread 2");
        t1.start();
        t2.start();
    }
}
