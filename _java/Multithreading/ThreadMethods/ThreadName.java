package _java.Multithreading.ThreadMethods;

public class ThreadName extends Thread {

    public ThreadName(String s) {
        super(s);
    }

    public ThreadName() {
        super();
    }

    public static void main(String[] args) {
        ThreadName t1 = new ThreadName("Thread 1");
        t1.start();
        ThreadName t2 = new ThreadName("");
        t2.setName("Thread 2");
        t2.start();

        System.out.println("Thread 1: " + t1.getName());
        System.out.println("Thread 2: " + t2.getName());

    }
}
