package arcadeintro.darkwilderness;

import java.util.Arrays;

/*
For bishop = "a1" and pawn = "c3", the output should be
bishopAndPawn(bishop, pawn) = true.
 */
public class BishopAndPawn {
    public static void main(String[] args) {
        String bishop = "h1";
        String pawn = "a8";

        System.out.println(bishopAndPawn(bishop, pawn));
    }

    private static boolean bishopAndPawn(String bishop, String pawn) {
        int[] bishopPosition = {bishop.charAt(0), bishop.charAt(1)};
        int[] bishopNewPosition = {bishopPosition[0], bishopPosition[1]};
        int[] pawnPosition = {pawn.charAt(0), pawn.charAt(1)};
        System.out.println(Arrays.toString(bishopPosition));
        System.out.println(Arrays.toString(pawnPosition));
        for (int i = -7; i < 9; i++) {
            bishopNewPosition[0] = bishopPosition[0];
            bishopNewPosition[1] = bishopPosition[1];
            bishopNewPosition[0] += i;
            bishopNewPosition[1] += i;
            if (Arrays.equals(pawnPosition, bishopNewPosition)) {
                return true;
            }
            bishopNewPosition[0] = bishopPosition[0];
            bishopNewPosition[1] = bishopPosition[1];
            bishopNewPosition[0] += i;
            bishopNewPosition[1] -= i;
            if (Arrays.equals(pawnPosition, bishopNewPosition)) {
                return true;
            }
        }
        return false;
    }


    private static boolean chessBoardCellColor(String cell1, String cell2) {
        return ((cell1.charAt(0) % 2 != 0 && cell1.charAt(1) % 2 != 0) ||
                (cell1.charAt(0) % 2 == 0 && cell1.charAt(1) % 2 == 0)) ==
                ((cell2.charAt(0) % 2 != 0 && cell2.charAt(1) % 2 != 0) ||
                        (cell2.charAt(0) % 2 == 0 && cell2.charAt(1) % 2 == 0));
    }
}