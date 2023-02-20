import java.util.Arrays;

public class RotateMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        rotateMatrix(matrix);
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");

        int[][] mtrx = {{1,2,3},{4,5,6},{7,8,9}};
        rotMatrix(mtrx);
        for (int[] ints: mtrx) {
            for (int i = 0; i < mtrx.length; i++) {
                System.out.printf("%d   ", ints[i]);
            }
            System.out.println();
        }

    }


    public static void rotateMatrix(int[][] matrix) {

        int row = matrix.length;
        //first find the transpose of the matrix.
        for (int i = 0; i < row; i++) {
            for (int j = i; j < row; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //reverse each row
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][row - 1 - j];
                matrix[i][row - 1 - j] = temp;
            }
        }
    }

    public static void rotMatrix(int[][] matrix) {
        int rows = matrix.length;

        for (int i = 0; i < rows; i++) {
            for (int j = i; j < rows; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][rows - 1 - j];
                matrix[i][rows - 1 - j] = temp;
            }
        }
    }
}
