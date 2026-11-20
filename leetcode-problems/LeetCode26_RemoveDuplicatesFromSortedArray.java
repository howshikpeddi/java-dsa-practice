
import java.util.Arrays;

public class LeetCode26_RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int k1 = removeDuplicates(nums1);

        System.out.println("Unique count: " + k1);
        System.out.println(Arrays.toString(Arrays.copyOf(nums1, k1)));

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = removeDuplicates(nums2);

        System.out.println("Unique count: " + k2);
        System.out.println(Arrays.toString(Arrays.copyOf(nums2, k2)));
    }
}

