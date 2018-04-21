package arcadeintro.edgeoftheocean;

/*
For matrix = [[0, 1, 1, 2],
             [0, 5, 0, 0],
             [2, 0, 3, 3]]
the output should be
MatrixElementsSum(matrix) = 9.
Here's the rooms matrix with unsuitable rooms marked with 'x':

[[x, 1, 1, 2],
 [x, 5, x, x],
 [x, x, x, x]]

Thus, the answer is 1 + 5 + 1 + 2 = 9.
 */
public class MatrixElementsSum {
    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 1, 2},
                {0, 5, 0, 0},
                {2, 0, 3, 3}};

        System.out.println(matrixElementsSum(matrix));
    }

    private static int matrixElementsSum(int[][] matrix) {
        int price = 0;
        int[] columnOut = new int[matrix[0].length];
        for (int[] element : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (element[j] == 0) {
                    columnOut[j] = 1;
                } else if (columnOut[j] != 1) {
                    price += element[j];
                }
            }
        }
        return price;
    }

}
