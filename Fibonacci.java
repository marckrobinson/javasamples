public class Fibonacci {
    public int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Index cannot be negative.");
        }
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int next = a + b;
            a = b;
            b = next;
        }
        return b;
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int n = 10; // or any other value
        int result = fibonacci.fibonacci(n);
        System.out.println("The Fibonacci number at index " + n + " is: " + result);

    }
}
