package Question4;

import java.util.Arrays;

public class ArraysPatternExamples {
    public static void main(String[] args) {
        // Method that find the sum diagonal from top right to bottom left
        int[][] arrays = {
                {0, 45, 0},
                {1, 45, 2},
                {0, 3, 0}
        };
        topRightBottomleftSum(arrays);

        // topLeftBottomRight(arrays);

        //reverseTopLeftBottomRight(arrays);

        sumInXPattern(arrays);
        printStarPattern();
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

    public static void BottomLeftToTopRight(int[][] arrays) {
        int inverseDiagonalSum = 0;
        for (int i = 0; i < arrays.length; i++) {
            for (int j = arrays.length - 1; j >= 0; j--) {
                if (i == j) inverseDiagonalSum += arrays[i][j];
            }
        }
        System.out.println(inverseDiagonalSum);
    }

    public static void topLeftBottomRight(int[][] arrays) {
        int sumOfThat = 0;
        for (int i = 0; i < arrays.length; i++) {
            for (int j = arrays.length - 1; j >= 0; j--) {
                if ((i + j) == arrays.length - 1) sumOfThat += arrays[i][j];
            }
        }
        System.out.println(sumOfThat);
    }

    public static void reverseTopLeftBottomRight(int[][] arrays) {
        int suumOfThat = 0;
        for (int i = arrays.length - 1; i >= 0; i--) {
            for (int j = 0; j < arrays.length; j++) {
                if (Math.abs(i - j) == arrays.length - 1 || (i + j) == arrays.length - 1) suumOfThat += arrays[i][j];
            }
        }
        System.out.println(suumOfThat);
    }

    public static void sumInXPattern(int[][] arrays) {
        int sumOfThat = 0;
        int i, v;
        for (i = 0, v = arrays.length - 1; i < arrays.length; i++, v--) {
            for (int j = 0; j < arrays.length; j++) {
                if (i == j || v == j) sumOfThat += arrays[i][j];
            }
        }
        System.out.println(sumOfThat);
    }

    public static void findRepeatedElements(int[] arrays) {
        Arrays.sort(arrays);

    }

    public static void printStarPattern() {
        int num = 0;

        for (int i = 0; i < 11; i++) {
            for(int j = 11- i - 1; j >= 1; j--){
                System.out.print(" ");
            }
            for (int t = 1; t < i; t++) System.out.print("* ");
            System.out.println();
        }
    }
}