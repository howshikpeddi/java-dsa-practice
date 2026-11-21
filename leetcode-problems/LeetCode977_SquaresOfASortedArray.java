import java.util.Arrays;

public class LeetCode977_SquaresOfASortedArray {

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int position = n - 1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[position] = leftSquare;
                left++;
            } else {
                result[position] = rightSquare;
                right--;
            }

            position--;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            sortedSquares(new int[]{-4, -1, 0, 3, 10})));

        System.out.println(Arrays.toString(
            sortedSquares(new int[]{-7, -3, 2, 3, 11})));
    }
}
