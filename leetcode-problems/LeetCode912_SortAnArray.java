import java.util.Arrays;

public class LeetCode912_SortAnArray {

    public static int[] sortArray(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }

        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    private static void mergeSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);

        merge(nums, left, mid, right);
    }

    private static void merge(int[] nums, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        while (j <= right) {
            temp[k++] = nums[j++];
        }

        for (int x = 0; x < temp.length; x++) {
            nums[left + x] = temp[x];
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            sortArray(new int[]{5, 2, 3, 1})
        ));

        System.out.println(Arrays.toString(
            sortArray(new int[]{5, 1, 1, 2, 0, 0})
        ));

        System.out.println(Arrays.toString(
            sortArray(new int[]{})
        ));
    }
}
