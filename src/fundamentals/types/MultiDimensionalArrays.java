package fundamentals.types;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {

        // 2 dimensional (2d)
        // matrix rows * columns
        int[][] matrix1 = new int[2][2];
        matrix1[0][0] = 1;
        matrix1[0][1] = 2;
        matrix1[1][0] = 3;
        System.out.println(Arrays.toString(matrix1));
        System.out.println(Arrays.deepToString(matrix1));

        int[][] matrix2 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println(Arrays.deepToString(matrix2));
        System.out.println(matrix2.length + " " + matrix2[0].length);

        // 3 dimensional (3d)
        // Cube 3 * 3 * 3 depth * rows * columns
        int[][][] cube1 = {
                // Layer 0
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                },

                // Layer 1
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                },

                // Layer 2
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                }
        };
        System.out.println(cube1.length + " " + cube1[0].length + " " + cube1[0][0].length);

        // jagged 3d array - layers of different sizes
        int[][][] cube2 = {
                {
                        {1, 2, 3},
                        {4, 5, 6}
                },
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                }
        };
    }
}