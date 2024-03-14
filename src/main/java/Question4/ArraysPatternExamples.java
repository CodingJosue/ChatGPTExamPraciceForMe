package Question4;

public class ArraysPatternExamples {
    public static void main(String[] args) {
        // Method that find the sum diagonal from top right to bottom left
        int[][] arrays = {
                {1,45,7},
                {1,45,2},
                {1,3,45}
        };
        topRightBottomleftSum(arrays);
    }

    public static void topRightBottomleftSum(int[][] arrays) {
        int diagonalSum = 0;
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                if (i == j) diagonalSum += arrays[i][j];
            }
        }
        System.out.println(diagonalSum);
    }
}
