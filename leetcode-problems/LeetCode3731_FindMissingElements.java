import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode3731_FindMissingElements {

    public static List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        Set<Integer> present = new HashSet<>();

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
            present.add(num);
        }

        List<Integer> missing = new ArrayList<>();

        for (int i = min + 1; i < max; i++) {
            if (!present.contains(i)) {
                missing.add(i);
            }
        }

        return missing;
    }

    public static void main(String[] args) {
        System.out.println(
            findMissingElements(new int[]{1, 4, 2, 5})
        );

        System.out.println(
            findMissingElements(new int[]{7, 8, 6, 9})
        );

        System.out.println(
            findMissingElements(new int[]{5, 1})
        );
    }
}

