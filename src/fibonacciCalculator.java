public class fibonacciCalculator {

    public static long fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static long fibonacciForLoop(int n) {
        if (n <= 1) {
            return n;
        }
        long a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static long fibonacciWhileLoop(int n) {
        if (n <= 1) {
            return n;
        }
        long a = 0, b = 1, c = 0;
        int i = 2;
        while (i <= n) {
            c = a + b;
            a = b;
            b = c;
            i++;
        }
        return c;
    }

    public static long calculateFibonacci(int n, String mode) {
        return switch (mode) {
            case "recursive" -> fibonacciRecursive(n);
            case "for" -> fibonacciForLoop(n);
            case "while" -> fibonacciWhileLoop(n);
            default -> throw new IllegalArgumentException("Invalid mode");
        };
    }
}
