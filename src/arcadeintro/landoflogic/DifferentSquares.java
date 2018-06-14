package arcadeintro.landoflogic;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a rectangular matrix containing only digits, calculate the number of different 2 × 2 squares in it.
 * <p>
 * Example
 * matrix = [[1, 2, 1],
 * [2, 2, 2],
 * [2, 2, 2],
 * [1, 2, 3],
 * [2, 2, 1]]
 * the output should be
 * differentSquares(matrix) = 6.
 */
public class DifferentSquares {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 1},
                {2, 2, 2},
                {2, 2, 2},
                {1, 2, 3},
                {2, 2, 1}};

        System.out.println(differentSquares(matrix));
    }

    private static int differentSquares(int[][] matrix) {
        Set<String> squares = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[0].length - 1; j++) {
                sb.append(matrix[i][j]);
                sb.append(matrix[i][j + 1]);
                sb.append(matrix[i + 1][j]);
                sb.append(matrix[i + 1][j + 1]);
                squares.add(sb.toString());
                sb = new StringBuilder();
            }
        }
        return squares.size();
    }
}

