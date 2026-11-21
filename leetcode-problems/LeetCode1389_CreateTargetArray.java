import java.util.Arrays;

public class LeetCode1389_CreateTargetArray {

    public static int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        int[] target = new int[n];

        int size = 0;

        for (int i = 0; i < n; i++) {
            for (int j = size; j > index[i]; j--) {
                target[j] = target[j - 1];
            }

            target[index[i]] = nums[i];
            size++;
        }

        return target;
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 1, 2, 3, 4};
        int[] index1 = {0, 1, 2, 2, 1};

        int[] nums2 = {1, 2, 3, 4, 0};
        int[] index2 = {0, 1, 2, 3, 0};

        System.out.println(Arrays.toString(
            createTargetArray(nums1, index1)));

        System.out.println(Arrays.toString(
            createTargetArray(nums2, index2)));
    }
}
