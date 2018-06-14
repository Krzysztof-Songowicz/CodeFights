package arcadeintro.landoflogic;

/**
 * For code = "010010000110010101101100011011000110111100100001", the output should be
 * messageFromBinaryCode(code) = "Hello!".
 * <p>
 * The first 8 characters of the code are 01001000, which is 72 in the binary numeral system.
 * 72 stands for H in the ASCII-table, so the first letter is H.
 * Other letters can be obtained in the same manner.
 */
public class MessageFromBinaryCode {
    public static void main(String[] args) {
        String code = "010010000110010101101100011011000110111100100001";

        System.out.println(messageFromBinaryCode(code));
    }

    private static String messageFromBinaryCode(String code) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0, j = 8; i <= code.length() - 8; i += 8, j += 8) {
            sb.append(((char) Integer.parseInt(code.substring(i, j), 2)));
        }
        return sb.toString();
    }
}
