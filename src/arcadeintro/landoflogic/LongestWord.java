package arcadeintro.landoflogic;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Define a word as a sequence of consecutive English letters. Find the longest word from the given string.
 * <p>
 * Example
 * For text = "Ready, steady, go!", the output should be
 * longestWord(text) = "steady".
 */
public class LongestWord {
    public static void main(String[] args) {
        String text = "Ready, steady, go!";

        System.out.println(longestWord(text));
        System.out.println(longestWordStreams(text));
    }

    private static String longestWord(String text) {
        String[] strings = text.split("[^A-Za-z ]");
        System.out.println(Arrays.toString(strings));
        int index = 0;
        for (int i = 1; i < strings.length; i++) {
            if (strings[i - 1].trim().length() < strings[i].trim().length()) {
                index = i;
            }
        }
        return strings[index].trim();
    }

    private static String longestWordStreams(String text) {
        return Arrays.stream(text.split("[^A-Za-z]"))
                .map(e -> String.valueOf(e))
                .max(Comparator.comparing(e -> e.length())).get();
    }
}
