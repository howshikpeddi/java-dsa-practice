
import java.util.*;

public class LeetCode496_NextGreaterElementI {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nextGreater = new HashMap<>();
        Deque<Integer> stack = new ArrayDeque<>();

        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                nextGreater.put(stack.pop(), num);
            }

            stack.push(num);
        }

        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreater.getOrDefault(nums1[i], -1);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        System.out.println(
            Arrays.toString(nextGreaterElement(nums1, nums2))
        );

        int[] nums3 = {2, 4};
        int[] nums4 = {1, 2, 3, 4};

        System.out.println(
            Arrays.toString(nextGreaterElement(nums3, nums4))
        );
    }
}

