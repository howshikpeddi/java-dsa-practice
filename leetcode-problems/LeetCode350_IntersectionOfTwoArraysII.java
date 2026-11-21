import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class LeetCode350_IntersectionOfTwoArraysII {

    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> counts = new HashMap<>();

        for (int num : nums1) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();

        for (int num : nums2) {
            if (counts.getOrDefault(num, 0) > 0) {
                result.add(num);
                counts.put(num, counts.get(num) - 1);
            }
        }

        int[] answer = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            intersect(
                new int[]{1, 2, 2, 1},
                new int[]{2, 2}
            )
        ));

        System.out.println(Arrays.toString(
            intersect(
                new int[]{4, 9, 5},
                new int[]{9, 4, 9, 8, 4}
            )
        ));
    }
}
