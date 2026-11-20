public class LeetCode1752_CheckIfArrayIsSortedAndRotated {

    public static boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }

        return count <= 1;
    }

    public static void main(String[] args) {
        System.out.println(check(new int[]{3, 4, 5, 1, 2}));
        System.out.println(check(new int[]{2, 1, 3, 4}));
        System.out.println(check(new int[]{1, 2, 3}));
    }
}

