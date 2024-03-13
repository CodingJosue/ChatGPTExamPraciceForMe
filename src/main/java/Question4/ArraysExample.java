package Question4;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysExample {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int[][] arrays = {
                {1,3,4,9,8,9,8},
                {1,2,3,8,8,9,8},
                {3,4,5,7,8,9,8}
        };

        //arrayUserInput(arrays);

        //system.out.println(Arrays.deepToString(arrays));

        //diagonalPattern(arrays);
      //  checkerBoardPattern(arrays);

        //twoDiagonalPattern(arrays);
        //twoDiagonalPatterns(arrays);

        tryingPatterns(arrays);

    }
    public static void arrayUserInput(int[][] arrays){
        for(int i = 0; i < arrays.length; i++){

            for(int j = 0; j < arrays[i].length; j++){
                System.out.println("Enter your element into" + i + "column of your " + j + " element");
                if(sc.hasNextInt()) arrays[i][j] = sc.nextInt();
                else System.out.println("Should have put an integer ");

            }
        }
    }
    public static void diagonalPattern(int[][] arrays){

        for(int i = 0; i < arrays.length; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            System.out.println(arrays[i][i]);
        }
    }
    public static void checkerBoardPattern(int[][] arrays){
        int min = findMinimumValue(arrays);
        int max = findMaxValue(arrays);
        for(int i = 0; i < arrays.length; i++){
            for(int j = 0; j <= arrays[0].length - 1; j++){
                if((i + j) % 2 != 0) System.out.print(max);
                else System.out.print(min);
            }
            System.out.println();
        }
    }

    public static int findMinimumValue(int[][] arrays){
        int minimumValue = Integer.MAX_VALUE;
        for(int i = 0; i < arrays.length; i++){
            for(int j = 0; j < arrays[i].length; j++){
                if(minimumValue > arrays[i][j]) minimumValue = arrays[i][j];
            }
        }
        return minimumValue;
    }
    public static int findMaxValue(int[][] arrays){
        int maxValue = Integer.MIN_VALUE;
        for(int i = 0; i < arrays.length; i++){
            for(int j = 0; j < arrays[0].length; j++){
                if(maxValue < arrays[i][j]) maxValue = arrays[i][j];
            }
        }
        return  maxValue;
    }
    public static void twoDiagonalPattern(int[][] arrays){
        for(int v = arrays.length -1; v >= 0; v--){
            for(int t = v - 1; t >= 0; t--){
                System.out.print(" ");
            }
            System.out.println(arrays[v][v]);
        }

        for(int i = 0; i < arrays.length; i++){

            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            System.out.println(arrays[i][i]);
        }

    }
    public static void twoDiagonalPatterns(int[][] arrays) {
        int n = arrays.length; // Assuming it's a square matrix

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Check if we're on one of the diagonals
                if (i == j || i + j == n - 1) {
                    System.out.print(arrays[i][j] + " ");
                } else {
                    System.out.print("  "); // Adjust the number of spaces as needed for alignment
                }
            }
            System.out.println(); // New line after each row
        }
    }
    public static void tryingPatterns(int[][] arrays){
        int v,i;
        for(i = 0, v = arrays.length - 1; i < arrays.length; i++,v-- ){

            for(int j = 0; j < arrays[i].length; j++ ){
                if(j == i ){
                    System.out.print(arrays[i][j] + " " + arrays[v][j]);
                }else System.out.print(" ");
            }
            System.out.println();

        }
    }
}
