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

        topLeftBottomRight(arrays);

        reverseTopLeftBottomRight(arrays);
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

    public static void BottomLeftToTopRight(int[][] arrays){
        int inverseDiagonalSum = 0;
        for(int i = 0; i < arrays.length; i++){
            for(int j = arrays.length - 1; j >= 0; j--){
                if(i == j) inverseDiagonalSum += arrays[i][j];
            }
        }
        System.out.println(inverseDiagonalSum);
    }
    public static void topLeftBottomRight(int[][] arrays){
        int sumOfThat = 0;
        for(int i = 0;  i < arrays.length; i++ ){
            for (int j = arrays.length - 1; j >= 0; j--){
                if((i + j )== arrays.length - 1) sumOfThat+= arrays[i][j];
            }
        }
        System.out.println(sumOfThat );
    }
    public static void reverseTopLeftBottomRight(int[][] arrays){
        int suumOfThat = 0;
        for(int i = arrays.length - 1; i >= 0; i-- ){
            for(int j = 0; j < arrays.length; j++){
                if(Math.abs(i - j) == arrays.length - 1 || (i + j) == arrays.length - 1) suumOfThat += arrays[i][j];
            }
        }
        System.out.println(suumOfThat);
    }
}
