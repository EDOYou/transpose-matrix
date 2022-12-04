//**************************************************** Transpose-Matrix ****************************************************************
package com.epam.rd.autotasks.matrices;
import java.util.Arrays;

public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {

        int[][] transpose = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                transpose[j][i] = matrix[i][j];

            }
        }

        return transpose;
    }

    public static void main(String[] args) {

        // Get a result of your code

          int[][] matrix = { {-4, -65, 56},
                             {78, -13, 32} };

        int[][] result = transpose(matrix);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }

}
