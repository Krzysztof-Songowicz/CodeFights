package arcadeintro.rainsofreason;

import java.util.stream.IntStream;

/*
    For n = 248622, the output should be
    evenDigitsOnly(n) = true;
    For n = 642386, the output should be
    evenDigitsOnly(n) = false.
 */
public class EvenDigitsOnly {
    public static void main(String[] args) {
        int n = 248622;
        int m = 642386;

        System.out.println(evenDigitsOnly(n));
    }

    private static boolean evenDigitsOnly(int n) {
        String number = Integer.toString(n);
        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            if (c == 1 || c == 3 || c == 5 || c == 7 || c == 9) {
                return false;
            }
        }
        return true;
    }

    private static boolean evenDigitsOnly2(int n) {
        IntStream stream = Integer.toString(n).chars();
        return stream.allMatch(e -> e % 2 == 0);
    }
}
