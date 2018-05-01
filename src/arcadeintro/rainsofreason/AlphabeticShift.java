package arcadeintro.rainsofreason;

/*
Given a string, replace each its character by the next one in the English alphabet (z would be replaced by a).
Example
For inputString = "crazy", the output should be
AlphabeticShift(inputString) = "dsbaz".
*/
public class AlphabeticShift {
    public static void main(String[] args) {
        String inputString = "crazy";

        System.out.println(alphabeticShift(inputString));
    }

    private static String alphabeticShift(String inputString) {
        int[] intChars = inputString.chars().toArray();
        char[] chars = new char[inputString.length()];
        for (int i = 0; i < intChars.length; i++) {
            if (intChars[i] == 122) {
                intChars[i] = 97;
                chars[i] = (char) intChars[i];
            } else {
                intChars[i]++;
                chars[i] = (char) intChars[i];
            }
        }
        return new String(chars);
    }
}
