import java.util.Arrays;

public class LeetCode1877_MinimizeMaximumPairSum {

    public static int minPairSum(int[] nums) {
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;
        int maxSum = 0;

        while (left < right) {
            int pairSum = nums[left] + nums[right];

            maxSum = Math.max(maxSum, pairSum);

            left++;
            right--;
        }

        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(minPairSum(
            new int[]{3, 5, 2, 3}
        ));

        System.out.println(minPairSum(
            new int[]{3, 5, 4, 2, 4, 6}
        ));
    }
}
