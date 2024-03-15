package Question4;

import javax.xml.namespace.QName;
import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class ExcercisesaArrays {
    static Random random = new Random();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] arrays = {
                {0,1,2},
                {0,1,2},
                {0,1,2}
        };
        //xPattern(arrays);
      //  reverseTopLeftToBottomRightPattern(arrays);
        leftTopBottomRight(arrays);
    }

    public static int generateRANDOM(){
        int randomNum = random.nextInt(1,101);
        return randomNum;
    }
    public static void getInput(int[][] arrays){
        for(int i = 0; i < arrays.length; i++){
            for(int j = 0; j < arrays[i].length; j++){
                arrays[i][j] = generateRANDOM();
            }
        }
    }
    public static void sumOfRow(int[][] arrays){
        int sumOfRow = 0;
        for(int i = 0; i < arrays.length; i++){
            for(int j = 0; j < arrays[i].length; j++){
                sumOfRow += arrays[i][j];
            }
            System.out.println("Sum of " + i + "row" + "is equal to " + sumOfRow);
            sumOfRow = 0;
        }
    }
    public static void sumOfColumn(int[][] arrays){
        int sumOfColumn  = 0;

        for(int i = 0; i < arrays[0].length; i++){
           for(int j = 0; j < arrays.length; j++){
               sumOfColumn += arrays[j][i];
           }
            System.out.println(sumOfColumn + "column " + i);
           sumOfColumn = 0;
        }
    }

    public static ArrayList arrayList() {
        ArrayList<String> strings = new ArrayList<>();
        System.out.println("How many elements you want to enter: ");
        int numberOfElements = sc.nextInt();
        for(int i = 0; i < numberOfElements; i++) {
            System.out.println("Enter name string: ");
            String name = sc.next();
            if (!isNameRepeated(strings, name)) {
                strings.add(name);
            }
        }
        return strings;
    }
    public static boolean isNameRepeated(ArrayList<String> strings, String input){
        for(String string : strings){
            if(string.equalsIgnoreCase(input)){
                return true;
            }
        }
        return false;
    }
    public static void xPattern(int[][] arrays){
        int i,v;
        for(i = 0, v = arrays.length - 1;  i < arrays.length; i++,v--){
            for(int j = 0; j < arrays.length; j++){
                if(i == j ||  j == v){
                    System.out.print(arrays[i][j] + " ");
                }else System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static  void reverseTopLeftToBottomRightPattern(int[][] arrays) {
        for (int i = arrays.length - 1; i >= 0; i--) {
            for (int j = arrays[i].length - 1; j >= 0; j--) {
                if (i == j) {
                    System.out.print( arrays[i][j]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void leftTopBottomRight(int[][] arrays){
        for(int i = 0; i < arrays.length; i++){
            for(int j = 0; j <arrays[i] .length; j++){
                 if((i + j) == arrays[i].length - 1) System.out.print(arrays[i][j]);
                else {
                    //if(j - 1 >= 0){
                    for(int t = 0; t < j + 1; t++) {
                        System.out.print(" ");
                    }
                    //}
                 }
            }
            System.out.println();
        }
    }
}
