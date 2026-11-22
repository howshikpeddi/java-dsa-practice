public class LeetCode1486_XOROperationInAnArray {

    public static int xorOperation(int n, int start) {
        int result = 0;

        for (int i = 0; i < n; i++) {
            result ^= start + 2 * i;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(xorOperation(5, 0));
        System.out.println(xorOperation(4, 3));
    }
}
