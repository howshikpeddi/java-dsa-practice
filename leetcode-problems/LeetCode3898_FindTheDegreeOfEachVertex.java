import java.util.Arrays;

public class LeetCode3898_FindTheDegreeOfEachVertex {

    public static int[] findDegrees(int[][] matrix) {
        int n = matrix.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i] += matrix[i][j];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix1 = {
            {0, 1, 1},
            {1, 0, 1},
            {1, 1, 0}
        };

        int[][] matrix2 = {
            {0, 1, 0},
            {1, 0, 0},
            {0, 0, 0}
        };

        System.out.println(Arrays.toString(findDegrees(matrix1)));
        System.out.println(Arrays.toString(findDegrees(matrix2)));
    }
}
