package Question4;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysExample {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int[][] arrays = {
                {1,3,4},
                {1,2,3},
                {3,4,5}
        };

        //arrayUserInput(arrays);

        //system.out.println(Arrays.deepToString(arrays));

        //diagonalPattern(arrays);
        checkerBoardPattern(arrays);
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
}
