package _java.Multithreading.Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockExample {

    int count = 0;

    ReadWriteLock lock = new ReentrantReadWriteLock();

    private final Lock readLock = lock.readLock();
    private final Lock writeLock = lock.writeLock();

    public int getCount() {
        readLock.lock();
        try {
            return count;
        } finally {
            readLock.unlock();
        }
    }

    public void increment() {
        writeLock.lock();
        try {
            count++;
        } finally {
            writeLock.unlock();
        }
    }

    public static void main(String[] args) {
        ReadWriteLockExample obj = new ReadWriteLockExample();
        Runnable writeRunnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    obj.increment();
                    System.out.println(Thread.currentThread().getName() + " incremented");
                }
            }
        };

        Runnable readRunnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    obj.getCount();
                    System.out.println(Thread.currentThread().getName() + " - " + obj.getCount());
                }
            }
        };

        Thread t1 = new Thread(writeRunnable, "Thread 1");
        Thread t2 = new Thread(readRunnable, "Thread 2");
        Thread t3 = new Thread(readRunnable, "Thread 3");
        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println(obj.getCount());
    }
}
