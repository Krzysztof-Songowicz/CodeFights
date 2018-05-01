package arcadeintro.rainsofreason;

/*
For cell1 = "A1" and cell2 = "C3", the output should be
chessBoardCellColor(cell1, cell2) = true.
 */
public class ChessBoardCellColor {
    public static void main(String[] args) {

        String cell1 = "A1";
        String cell2 = "C3";

        chessBoardCellColor(cell1, cell2);
    }

    private static boolean chessBoardCellColor(String cell1, String cell2) {
        return ((cell1.charAt(0) % 2 != 0 && cell1.charAt(1) % 2 != 0) ||
                (cell1.charAt(0) % 2 == 0 && cell1.charAt(1) % 2 == 0)) ==
                ((cell2.charAt(0) % 2 != 0 && cell2.charAt(1) % 2 != 0) ||
                        (cell2.charAt(0) % 2 == 0 && cell2.charAt(1) % 2 == 0));
    }
}
