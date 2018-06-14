package arcadeintro.landoflogic;

import java.util.Arrays;

public class Sudoku {
    private static final int[] blueprint = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void main(String[] args) {
        int[][] sudoku = {
                {4, 2, 9, 8, 1, 3, 5, 6, 7},
                {5, 1, 6, 4, 7, 2, 9, 3, 8},
                {7, 8, 3, 6, 5, 9, 2, 4, 1},
                {6, 7, 2, 1, 3, 4, 8, 5, 9},
                {3, 9, 5, 2, 8, 6, 1, 7, 4},
                {8, 4, 1, 7, 9, 5, 6, 2, 3},
                {1, 5, 8, 3, 6, 7, 4, 9, 2},
                {9, 3, 4, 5, 2, 8, 7, 1, 6},
                {2, 6, 7, 9, 4, 1, 3, 8, 5}};

        int[][] sudoku2 = {{1, 3, 2, 5, 4, 6, 9, 8, 7},
                {4, 6, 5, 8, 7, 9, 3, 2, 1},
                {7, 9, 8, 2, 1, 3, 6, 5, 4},
                {9, 2, 1, 4, 3, 5, 8, 7, 6},
                {3, 5, 4, 7, 6, 8, 2, 1, 9},
                {6, 8, 7, 1, 9, 2, 5, 4, 3},
                {5, 7, 6, 9, 8, 1, 4, 3, 2},
                {2, 4, 3, 6, 5, 7, 1, 9, 8},
                {8, 1, 9, 3, 2, 4, 7, 6, 5}};

        System.out.println(sudokuVerification(sudoku2));


    }

    private static boolean sudokuVerification(int[][] sudoku) {
        System.out.println("Checking sudoku rows");
        System.out.printf("Numbers in rows are %s\n", rowChecker(sudoku) ? "ok" : "not ok");
        System.out.println("Checking sudoku columns");
        System.out.printf("Numbers in columns are %s\n", columnChecker(sudoku) ? "ok" : "not ok");
        System.out.println("Checking sudoku 3x3 grids");
        System.out.printf("Numbers in grids are %s\n\n", checkSudoku3x3Matrixes(sudoku) ? "ok" : "not ok");
        return (rowChecker(sudoku) && columnChecker(sudoku) && checkSudoku3x3Matrixes(sudoku));

    }

    private static boolean checkSudoku3x3Matrixes(int[][] sudoku) {
        int start = 0;
        int i = 0;
        int counter = 0;
        while (counter < 3) {
            for (; i <= 6; i += 3) {
                if (!(checkMiniMatrix(extractMatrix(sudoku[i], start), extractMatrix(sudoku[i + 1], start), extractMatrix(sudoku[i + 2], start))))
                    return false;
            }
            i = 0;
            start += 3;
            counter++;
        }
        return true;
    }

    private static boolean checkMiniMatrix(int[] row1, int[] row2, int[] row3) {
        int[] miniArray = new int[9];
        System.arraycopy(row1, 0, miniArray, 0, row1.length);
        System.arraycopy(row2, 0, miniArray, 3, row2.length);
        System.arraycopy(row3, 0, miniArray, 6, row3.length);

        Arrays.sort(miniArray);
        for (int i = 0; i < miniArray.length; i++) {
            if (miniArray[i] != blueprint[i]) {
                return false;
            }
        }
        return true;
    }

    private static int[] extractMatrix(int[] array, int start) {
        int[] miniGrid = new int[3];
        System.arraycopy(array, start, miniGrid, 0, miniGrid.length);
//        for (int i = 0; i < miniGrid.length; i++) {
//            System.out.println("Element " + i + " Value: " + miniGrid[i]);
//        }
        return miniGrid;
    }

    // Check every row for duplicates:
    private static boolean rowChecker(int[][] sudoku) {
        int[] testLine = new int[9];
        for (int[] aGrid : sudoku) {
            System.arraycopy(aGrid, 0, testLine, 0, 9);
            Arrays.sort(testLine);
            for (int j = 0; j < sudoku[0].length; j++) {
                if (testLine[j] != blueprint[j]) { // comparing sorted test array with blueprint
                    return false;
                }
            }
        }
        return true; // Returns true if all rows are Ok.
    }

    private static boolean columnChecker(int[][] sudoku) {
        int[] testColumn = new int[9];
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku.length; j++) {
                testColumn[j] = sudoku[j][i]; // Assigning whole column to our test array
            }
            Arrays.sort(testColumn);
            for (int k = 0; k < testColumn.length; k++) {
                if (testColumn[k] != blueprint[k]) {
                    return false;
                }
            }
        }
        return true; // Returns true if all columns are Ok.
    }
}

