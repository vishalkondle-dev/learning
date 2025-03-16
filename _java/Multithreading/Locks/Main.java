package _java.Multithreading.Locks;

public class Main {
    public static void main(String[] args) {
        BankAccount sbi = new BankAccount(1000);
        Runnable runnableObj = new Runnable() {
            @Override
            public void run() {
                sbi.withdraw(50);
            }
        };
        Thread t1 = new Thread(runnableObj, "Thread 1");
        Thread t2 = new Thread(runnableObj, "Thread 2");
        t1.start();
        t2.start();
    }
}
