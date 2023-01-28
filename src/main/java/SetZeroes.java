import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetZeroes {
    public static void main(String[] args) {

        int[][] zeroMatrix = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};

        setZeroes(zeroMatrix);
        for (int[] ints : zeroMatrix) {
            for (int i = 0; i < zeroMatrix.length; i++) {
                System.out.print(ints[i] + " ");
            }
            System.out.println();
        }

        System.out.println();

        int[][]matrix = {{1,1,1},{1,0,1},{1,1,1}};
        setMatrixZero(matrix);
        for (int[] ints: matrix) {
            for (int i = 0; i < matrix.length; i++) {
                System.out.printf("%d%s", ints[i], " ");
            }
            System.out.println();
        }
    }

    public static void setZeroes(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;
        Set<Integer> rows = new HashSet<Integer>();
        Set<Integer> cols = new HashSet<Integer>();

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (rows.contains(i) || cols.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void setMatrixZero(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;
        Set<Integer> row = new HashSet<Integer>();
        Set<Integer> col = new HashSet<Integer>();

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (matrix[i][j] == 0) {
                    row.add(i);
                    col.add(j);
                }
            }
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (row.contains(i) || col.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
