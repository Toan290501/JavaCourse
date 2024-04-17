import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;

public class Account {
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition sufficientFundsCondition = lock.newCondition();
    private int balance;

    public Account(int initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(int amount) {
        lock.lock();
        try {
            balance += amount;
            System.out.println(Thread.currentThread().getName() + " deposited " + amount + ". Balance is now " + balance);
            sufficientFundsCondition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void withdraw(int amount) throws InterruptedException {
        lock.lock();
        try {
            while (balance < amount) {
                System.out.println(Thread.currentThread().getName() + " waits to withdraw " + amount + ". Insufficient funds!");
                sufficientFundsCondition.await();
            }
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew " + amount + ". Balance is now " + balance);
        } finally {
            lock.unlock();
        }
    }

    public int getBalance() {
        return balance;
    }
}
