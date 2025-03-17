package _java.Multithreading.ThreadMethods;

public class ThreadDaemon extends Thread {
    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("t1")) {
            System.out.println("User Thread");
        } else {
            while (true) {
                System.out.println("Daemon Thread");
            }
        }
    }

    public static void main(String[] args) {
        ThreadDaemon t1 = new ThreadDaemon();
        ThreadDaemon t2 = new ThreadDaemon();
        t1.setName("t1");
        t2.setName("t2");

        t2.setDaemon(true); // If we remove this line, t2 will be a user thread and it will run infinitely
                            // because of while loop

        t1.start();
        t2.start();
    }
}
