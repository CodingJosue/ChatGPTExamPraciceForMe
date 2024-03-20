package BankSimulation;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

public class AlgorithmProblem {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(1);
        integers.add(5);
        integers.add(1);
        integers.add(6);
        integers.add(1);
        integers.add(6);
findElementIndices(integers);

findReapetedElement(integers);
    }

    public static boolean isNumPalindrome(int num){
        int initialNum = num;
        int reverseNum = 0;
        int extracted;
        while(num > 0){
            extracted = num % 10;

            reverseNum = reverseNum * 10 + extracted ;

            num /= 10;
        }
        if(reverseNum == initialNum){
            return true;
        }else  return false;
    }


    public static void findElementIndices(ArrayList<Integer> list) {
        // we have a boolean array that has the same size as the arraylist
            boolean[] counted = new boolean[list.size()];
// we iterate through the array list
            for (int i = 0; i < list.size(); i++) {
                // just assigning the value to element
                int element = list.get(i);
                // here if the boolean at the current index is false than we can print it else we cannot
                if (!counted[i]) {
                    System.out.print("The element " + element + " is found at the index " + i);
                    // let say at index 0 the current element is counted so we must say count[i] = true
                    counted[i] = true;
// j most start at i + 1 to avoid code issues
                    for (int j = i + 1; j < list.size(); j++) {
                        if (list.get(j).equals(element)) {
                            System.out.print(", " + j);
                            // we also set that if the value at j equals to element then counted  = true
                            counted[j] = true;
                        }
                    }
                    System.out.println();
                }
            }
        }


    public static int index (int num, ArrayList<Integer> integers){
        for(int i = 0; i < integers.size(); i++){
          //  for(int j = 1; j < integers.size(); j++) {
                if ( integers.get(i).equals(num)) return i;
           // }
        }
        return  0;
    }

    public static void findReapetedElement(ArrayList<Integer> integers){
        boolean[] isCounted = new boolean[integers.size()];
        int count = 0;

        for(int i = 0; i < integers.size(); i++){
            for(int j = i + 1; j < integers.size(); j++) {

                if (integers.get(j).equals(integers.get(i))) {
                    count++;
                    isCounted[j] = true;
                }
            }
                if (!isCounted[i]) {
                    System.out.print("The element " + integers.get(i) + "is counted " + count);
                    System.out.println();
                    isCounted[i] = true;
                }

            count = 1;
        }
    }
    public static boolean caseSensitive(ArrayList<String> strings, String input){
        for(String string : strings){
            if(input.equalsIgnoreCase(string)){
                return  true;
            }
        }
        return  false;
    }
}


