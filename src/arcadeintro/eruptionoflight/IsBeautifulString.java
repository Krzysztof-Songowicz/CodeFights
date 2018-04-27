package arcadeintro.eruptionoflight;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/*
For inputString = "bbbaacdafe", the output should be
isBeautifulString(inputString) = true;
For inputString = "aabbb", the output should be
isBeautifulString(inputString) = false;
For inputString = "bbc", the output should be
isBeautifulString(inputString) = false.
 */
public class IsBeautifulString {
    public static void main(String[] args) {

        String inputString = "bbbaacdafe";

        System.out.println(isBeautifulString(inputString));
    }

    private static boolean isBeautifulString(String s) {
        Map<Character, Integer> letters = new TreeMap<>();

        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (letters.containsKey(character)) {
                letters.put(character, letters.get(character) + 1);
            } else {
                letters.put(character, 1);
            }
        }
        System.out.println(letters);
        Character start = 'a';
        int count = -1;
        for (Map.Entry<Character, Integer> entry : letters.entrySet()) {
            if (!start.equals(entry.getKey())) {
                return false;
            }
            if (entry.getValue() > count && count != -1) {
                return false;
            }
            start++;
            count = entry.getValue();
        }
        return true;
    }

    // Fails on one of the hidden tests
    private static boolean isBeautifulString2(String s) {
        char[] letters = s.toCharArray();
        Arrays.sort(letters);
        System.out.println(Arrays.toString(letters));
        int count1;
        int temp = 1;
        int count2 = -1;
        char letter = 'a';
        if (letter != letters[0]) {
            return false;
        }
        for (int i = 1; i < letters.length; i++) {
            if (letters[i] == letters[i - 1]) {
                temp++;
            } else {
                if (++letter != letters[i]) {
                    return false;
                }
                count1 = temp;
                temp = 1;
                System.out.println(count1);
                if (count1 > count2 && count2 != -1) {
                    return false;
                }
                count2 = count1;
            }
        }
        return temp <= count2;
    }
}
