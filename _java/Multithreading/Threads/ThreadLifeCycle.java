package _java.Multithreading.Threads;

class ThreadLifeCycle extends Thread {
    @Override
    public void run() {
        System.out.println("6 t1 - RUNNING");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted t1");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadLifeCycle t1 = new ThreadLifeCycle();
        System.out.println("16 t1 - " + t1.getState()); // NEW
        t1.start();
        System.out.println("18 t1 - " + t1.getState()); // RUNNABLE
        Thread.sleep(100);
        System.out.println("20 t1 - " + t1.getState()); // TIMED_WAITING
        t1.join(); // main thread will wait for t1 to finish
        System.out.println("22 t1 - " + t1.getState()); // TERMINATED
    }
}
