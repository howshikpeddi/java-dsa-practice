import java.util.ArrayList;
import java.util.List;

public class LeetCode442_FindAllDuplicatesInAnArray {

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;

            if (nums[index] < 0) {
                result.add(index + 1);
            } else {
                nums[index] = -nums[index];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(findDuplicates(
            new int[]{4, 3, 2, 7, 8, 2, 3, 1}
        ));

        System.out.println(findDuplicates(
            new int[]{1, 1, 2}
        ));

        System.out.println(findDuplicates(
            new int[]{1}
        ));
    }
}
