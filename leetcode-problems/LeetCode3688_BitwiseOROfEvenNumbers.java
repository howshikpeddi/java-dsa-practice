public class LeetCode3688_BitwiseOROfEvenNumbers {

    public static int evenNumberBitwiseORs(int[] nums) {
        int result = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                result |= num;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(
            evenNumberBitwiseORs(new int[]{1, 2, 3, 4, 5, 6})
        );

        System.out.println(
            evenNumberBitwiseORs(new int[]{1, 3, 5})
        );

        System.out.println(
            evenNumberBitwiseORs(new int[]{2, 4, 8})
        );
    }
}
