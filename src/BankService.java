import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class BankService {
    private final Account account;

    public BankService(Account account) {
        this.account = account;
    }

    public void processTransactions() {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 20; i++) {
            int amount = (int) (Math.random() * 100) + 1;
            if (Math.random() > 0.5) {
                executorService.submit(() -> {
                    account.deposit(amount);
                });
            } else {
                executorService.submit(() -> {
                    try {
                        account.withdraw(amount);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                });
            }
        }

        executorService.shutdown();
    }
}
