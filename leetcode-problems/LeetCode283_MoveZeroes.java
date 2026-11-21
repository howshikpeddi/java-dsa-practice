import java.util.Arrays;

public class LeetCode283_MoveZeroes {

    public static void moveZeroes(int[] nums) {
        int position = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[position];
                nums[position] = nums[i];
                nums[i] = temp;

                position++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 1, 0, 3, 12};
        int[] nums2 = {0};
        int[] nums3 = {1, 2, 3};

        moveZeroes(nums1);
        moveZeroes(nums2);
        moveZeroes(nums3);

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.toString(nums3));
    }
}
