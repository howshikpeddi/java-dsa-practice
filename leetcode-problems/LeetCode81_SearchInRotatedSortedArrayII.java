public class LeetCode81_SearchInRotatedSortedArrayII {

    public static boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return true;
            }

            // Handle duplicates
            if (nums[left] == nums[mid]
                    && nums[mid] == nums[right]) {
                left++;
                right--;
            }
            // Left half is sorted
            else if (nums[left] <= nums[mid]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            // Right half is sorted
            else {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(search(
            new int[]{2, 5, 6, 0, 0, 1, 2}, 0));

        System.out.println(search(
            new int[]{2, 5, 6, 0, 0, 1, 2}, 3));

        System.out.println(search(
            new int[]{1, 0, 1, 1, 1}, 0));
    }
}
