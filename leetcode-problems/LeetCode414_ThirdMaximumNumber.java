import java.util.TreeSet;

public class LeetCode414_ThirdMaximumNumber {

    public static int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int num : nums) {
            set.add(num);

            if (set.size() > 3) {
                set.pollFirst();
            }
        }

        if (set.size() == 3) {
            return set.first();
        }

        return set.last();
    }

    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{3, 2, 1}));
        System.out.println(thirdMax(new int[]{1, 2}));
        System.out.println(thirdMax(new int[]{2, 2, 3, 1}));
    }
}
