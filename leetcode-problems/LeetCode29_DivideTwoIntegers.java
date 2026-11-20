
public class LeetCode29_DivideTwoIntegers {

    public static int divide(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        long quotient = 0;

        for (int i = 31; i >= 0; i--) {
            if ((a >> i) >= b) {
                a -= (b << i);
                quotient += (1L << i);
            }
        }

        boolean negative = (dividend < 0) ^ (divisor < 0);

        if (negative) {
            quotient = -quotient;
        }

        return (int) quotient;
    }

    public static void main(String[] args) {
        System.out.println(divide(10, 3));           // 3
        System.out.println(divide(7, -3));           // -2
        System.out.println(divide(-2147483648, -1)); // 2147483647
        System.out.println(divide(-15, 2));           // -7
    }
}

