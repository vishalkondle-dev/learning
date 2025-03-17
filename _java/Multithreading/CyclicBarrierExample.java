package _java.Multithreading;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3, () -> System.out.println("All subsystems are initialized"));
        Subsystem s1 = new Subsystem("Subsystem 1", 1000, barrier);
        Subsystem s2 = new Subsystem("Subsystem 2", 2000, barrier);
        Subsystem s3 = new Subsystem("Subsystem 3", 3000, barrier);
        new Thread(s1).start();
        new Thread(s2).start();
        new Thread(s3).start();
    }
}

class Subsystem implements Runnable {

    private String name;
    private int initializationTime;
    private CyclicBarrier barrier;

    public Subsystem(String name, int initializationTime, CyclicBarrier barrier) {
        this.name = name;
        this.initializationTime = initializationTime;
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " is started");
            Thread.sleep(initializationTime);
            System.out.println(name + " is finished");
            barrier.await();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}