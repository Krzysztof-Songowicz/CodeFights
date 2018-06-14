package arcadeintro.landoflogic;

import java.util.Arrays;

/**
 * Construct a square matrix with a size N × N containing integers from 1 to N * N in a spiral order, starting from top-left and in clockwise direction.
 * <p>
 * Example
 * For n = 3, the output should be
 * spiralNumbers(n) = [[1, 2, 3],
 * [8, 9, 4],
 * [7, 6, 5]]
 */
public class SpiralNumbers {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(Arrays.deepToString(spiralNumbers(n)));
        printArray(spiralNumbers(n));
    }

    private static int[][] spiralNumbers(int n) {
        int[][] spiral = new int[n][n];
        int count = 1;
        int minColumn = 0;
        int minRow = 0;
        int maxColumn = n - 1;
        int maxRow = n - 1;
        while (count <= n * n) {
            for (int i = minColumn; i <= maxColumn; i++) {
                spiral[minRow][i] = count;
                count++;
            }
            for (int i = minRow + 1; i <= maxRow; i++) {
                spiral[i][maxColumn] = count;
                count++;
            }
            for (int i = maxColumn - 1; i > minColumn; i--) {
                spiral[maxRow][i] = count;
                count++;
            }
            for (int i = maxRow; i > minRow; i--) {
                spiral[i][minColumn] = count;
                count++;
            }
            minColumn++;
            minRow++;
            maxColumn--;
            maxRow--;
        }
        return spiral;
    }

    static void printArray(int[][] array) {
        for (int[] x : array) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
