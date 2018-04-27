package arcadeintro.rainbowofclarity;

/*
Given a position of a knight on the standard chessboard, find the number of different moves the knight can perform.

The knight can move to a square that is two squares horizontally and one square vertically,
or two squares vertically and one square horizontally away from it. The complete move therefore looks like the letter L.
 */
public class ChessKnight {
    public static void main(String[] args) {
        String cell = "c2";

        System.out.println(chessKnight(cell));

    }

    private static int chessKnight(String cell) {
        int pos1 = cell.charAt(0); // 97 - 104
        int pos2 = cell.charAt(1); // 49 - 56
        int moves = 0;

        for (int i = 1, j = 2; i <= 2; i++, j--) {
            if (possibleMove(pos1 + i, pos2 + j)) {
                moves++;
            }
            if (possibleMove(pos1 + i, pos2 - j)) {
                moves++;
            }
            if (possibleMove(pos1 - i, pos2 + j)) {
                moves++;
            }
            if (possibleMove(pos1 - i, pos2 - j)) {
                moves++;
            }
        }
        return moves;
    }

    private static boolean possibleMove(int pos1, int pos2) {
        return pos1 >= 97 && pos1 <= 104 && pos2 >= 49 && pos2 <= 56;
    }
}
