package _java.Multithreading.Locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount) {
        try {
            if (lock.tryLock(2000, TimeUnit.MILLISECONDS)) { // Not to wait indefinitely by avoiding synchronized
                if (balance >= amount) {
                    System.out.println(Thread.currentThread().getName() + " Withdrawing " + balance + "-" + amount);
                    try {
                        Thread.sleep(3000);
                    } catch (Exception e) {
                        System.out.println("Interrupted");
                    } finally {
                        lock.unlock();
                    }
                    balance -= amount;
                    System.out.println(Thread.currentThread().getName() + " New balance " + balance);
                } else {
                    System.out.println("Insufficient balance");
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " Unable to get lock");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
