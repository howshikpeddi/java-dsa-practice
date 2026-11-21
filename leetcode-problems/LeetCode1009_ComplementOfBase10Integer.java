public class LeetCode1009_ComplementOfBase10Integer {

    public static int bitwiseComplement(int n) {
        if (n == 0) {
            return 1;
        }

        int mask = 1;

        while (mask <= n) {
            mask <<= 1;
        }

        return (mask - 1) ^ n;
    }

    public static void main(String[] args) {
        System.out.println(bitwiseComplement(5));
        System.out.println(bitwiseComplement(7));
        System.out.println(bitwiseComplement(10));
        System.out.println(bitwiseComplement(0));
    }
}
