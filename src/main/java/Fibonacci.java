
public class Fibonacci {


    public static void main(String[] args) {
        Fibonacci.run();
    }

    private static void run() {
        System.out.println(fibonacci(6));
    }

    private static int fibonacci(int n) {
        if (n < 2) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
