package _java.Multithreading.Threads;

public class ThreadClass extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("ThreadClass Thread - " + i);
        }
    }
}
