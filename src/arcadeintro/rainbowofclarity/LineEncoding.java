package arcadeintro.rainbowofclarity;

/**
 * Given a string, return its encoding defined as follows:
 * First, the string is divided into the least possible number of disjoint substrings consisting of identical characters
 * for example, "aabbbc" is divided into ["aa", "bbb", "c"]
 * Next, each substring with length greater than one is replaced with a concatenation of its length
 * and the repeating character
 * for example, substring "bbb" is replaced by "3b"
 * Finally, all the new strings are concatenated together in the same order and a new string is returned.
 */
public class LineEncoding {
    public static void main(String[] args) {
        String inputString = "aabbbcc";

        System.out.println(lineEncoding(inputString));
    }

    private static String lineEncoding(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                if (count == 1) {
                    sb.append(s.charAt(i - 1));
                } else {
                    sb.append(count);
                    sb.append(s.charAt(i - 1));
                }
                count = 1;
            }
        } // Managing last letters as the for loop fails to execute:
        if (count == 1) {
            sb.append(s.charAt(s.length() - 1));
        } else {
            sb.append(count);
            sb.append(s.charAt(s.length() - 1));
        }
        return sb.toString();
    }
}
