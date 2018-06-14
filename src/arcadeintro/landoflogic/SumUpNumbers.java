package arcadeintro.landoflogic;

import java.util.Arrays;

/**
 * Help Ratiorg by writing a function that returns the sum of numbers that appear in the given inputString.
 * <p>
 * Example
 * For inputString = "2 apples, 12 oranges", the output should be
 * sumUpNumbers(inputString) = 14.
 */
public class SumUpNumbers {
    public static void main(String[] args) {
        String inputString = "2 apples, 12 oranges";
        System.out.println(sumUpNumbers(inputString));

    }

    private static int sumUpNumbers(String inputString) {
        return Arrays.stream(inputString.split("[^0-9]"))
                .filter(e -> !e.isEmpty())
                .map(e -> Integer.valueOf(e))
                .reduce((a, b) -> a + b).orElse(0);
    }


}
