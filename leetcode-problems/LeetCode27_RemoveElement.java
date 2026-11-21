import java.util.Arrays;

public class LeetCode27_RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 2, 2, 3};
        int k1 = removeElement(nums1, 3);

        System.out.println("Length: " + k1);
        System.out.println(Arrays.toString(
            Arrays.copyOf(nums1, k1)));

        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int k2 = removeElement(nums2, 2);

        System.out.println("Length: " + k2);
        System.out.println(Arrays.toString(
            Arrays.copyOf(nums2, k2)));
    }
}
