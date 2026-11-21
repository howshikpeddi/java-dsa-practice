import java.util.Arrays;

public class LeetCode645_SetMismatch {

    public static int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] count = new int[n + 1];

        for (int num : nums) {
            count[num]++;
        }

        int duplicate = 0;
        int missing = 0;

        for (int i = 1; i <= n; i++) {
            if (count[i] == 2) {
                duplicate = i;
            } else if (count[i] == 0) {
                missing = i;
            }
        }

        return new int[]{duplicate, missing};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            findErrorNums(new int[]{1, 2, 2, 4})
        ));

        System.out.println(Arrays.toString(
            findErrorNums(new int[]{1, 1})
        ));
    }
}
