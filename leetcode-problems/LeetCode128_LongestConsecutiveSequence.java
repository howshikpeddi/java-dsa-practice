import java.util.HashSet;
import java.util.Set;

public class LeetCode128_LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int current = num;
                int length = 1;

                while (current != Integer.MAX_VALUE
                        && set.contains(current + 1)) {
                    current++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        System.out.println(
            longestConsecutive(new int[]{100, 4, 200, 1, 3, 2})
        );

        System.out.println(
            longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1})
        );

        System.out.println(
            longestConsecutive(new int[]{})
        );
    }
}
