public class LeetCode509_FibonacciNumber {

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }

        int a = 0;
        int b = 1;

        for (int i = 2; i <= n; i++) {
            int current = a + b;
            a = b;
            b = current;
        }

        return b;
    }

    public static void main(String[] args) {
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
        System.out.println(fib(10));
    }
}
