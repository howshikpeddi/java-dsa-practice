import java.util.Arrays;

public class BubbleSort {

    public static void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};
        sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int[] duplicates = {5, 2, 5, 1, 2};
        sort(duplicates);
        System.out.println(Arrays.toString(duplicates));

        int[] empty = {};
        sort(empty);
        System.out.println(Arrays.toString(empty));
    }
}
