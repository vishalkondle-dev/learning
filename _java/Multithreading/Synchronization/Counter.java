package _java.Multithreading.Synchronization;

public class Counter {
    public int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
