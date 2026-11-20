
import java.util.Arrays;

public class LeetCode189_RotateArray {

    public static void rotate(int[] nums, int k) {
        int n = nums.length;

        if (n == 0) {
            return;
        }

        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        rotate(nums1, 3);
        System.out.println(Arrays.toString(nums1));

        int[] nums2 = {-1, -100, 3, 99};
        rotate(nums2, 2);
        System.out.println(Arrays.toString(nums2));

        int[] nums3 = {1, 2};
        rotate(nums3, 5);
        System.out.println(Arrays.toString(nums3));
    }
}

