package arcadeintro.rainbowofclarity;

/**
 * Determine if the given character is a digit or not.
 * <p>
 * Example:
 * For symbol = '0', the output should be
 * isDigit(symbol) = true;
 * For symbol = '-', the output should be
 * isDigit(symbol) = false.
 */
public class IsDigit {
    public static void main(String[] args) {

        char symbol = 'h';
        System.out.println(isDigit(symbol));
    }

    private static boolean isDigit(char symbol) {
        return (symbol >= 48 && symbol <= 57);
    }
}
