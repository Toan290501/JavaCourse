import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadManager {
    private static ExecutorService executor;

    public static void start(int threadCount) {
        executor = Executors.newFixedThreadPool(threadCount);
    }


    public static void shutdown() {
        try {
            executor.shutdown();
            executor.awaitTermination(60, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Logger.error("Threads interrupted: " + e.getMessage());
        }
    }
}
