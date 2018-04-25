package arcadeintro.eruptionoflight;

/*
Given a string, find the shortest possible string which can be achieved by adding characters to the
end of initial string to make it a palindrome.

Example
For st = "abcdc", the output should be
buildPalindrome(st) = "abcdcba".
 */
public class BuildPalindrome {
    public static void main(String[] args) {

        String st = "abcdc";
        System.out.println(buildPalindrome(st));
        System.out.println(isPalindorme("abba"));
    }

    private static String buildPalindrome(String st) {
        if (isPalindorme(st)) {
            return st;
        }
        StringBuilder sbBlueprint = new StringBuilder(st);
        StringBuilder sb = new StringBuilder(st);
        StringBuilder temp;
        for (int i = 1; i < st.length(); i++) {
            temp = new StringBuilder(sb.substring(0, i)).reverse();
            sb.append(temp);
            if (isPalindorme(sb.toString())) {
                break;
            }
            sb = sbBlueprint;
        }
        System.out.println(sb);

        return sb.toString();
    }

    private static boolean isPalindorme(String string) {
        return string.equals(new StringBuilder(string).reverse().toString());
    }
}
