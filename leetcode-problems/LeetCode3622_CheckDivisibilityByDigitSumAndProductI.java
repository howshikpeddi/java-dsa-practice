
public class LeetCode3622_CheckDivisibilityByDigitSumAndProductI {

    public static boolean checkDivisibility(int n) {
        int temp = n;
        int digitSum = 0;
        long digitProduct = 1;

        while (temp > 0) {
            int digit = temp % 10;

            digitSum += digit;
            digitProduct *= digit;

            temp /= 10;
        }

        if (digitProduct == 0) {
            return false;
        }

        return n % digitSum == 0 &&
               n % digitProduct == 0;
    }

    public static void main(String[] args) {
        System.out.println(checkDivisibility(99));
        System.out.println(checkDivisibility(23));
        System.out.println(checkDivisibility(12));
        System.out.println(checkDivisibility(128));
    }
}

