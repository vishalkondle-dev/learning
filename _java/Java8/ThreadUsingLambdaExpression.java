package _java.Java8;

public class ThreadUsingLambdaExpression {
    public static void main(String[] args) {
        // Using Runnable Interface
        // Runnable myThread = new MyThread();
        // Thread t1 = new Thread(myThread);
        // t1.run();

        // Using Lambda Expression
        Runnable runnableObj = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("runnableObj Thread" + i);
            }
        };
        Thread t = new Thread(runnableObj);
        t.run();
    }
}

// class MyThread implements Runnable {
// @Override
// public void run() {
// for (int i = 0; i < 10; i++) {
// System.out.println("MyThread Thread" + i);
// }
// }
// }