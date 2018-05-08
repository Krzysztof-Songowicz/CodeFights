package arcadeintro.darkwilderness;

public class LongestDigitsPrefix {
    public static void main(String[] args) {

        String inputString = "123aa1";

        System.out.println(longestDigitsPrefix(inputString));
    }

    private static String longestDigitsPrefix(String inputString) {
        String pattern = "[0-9]*";
        String result = "";
        for (int i = 0; i <= inputString.length(); i++) {
            if (inputString.substring(0, i).matches(pattern)) {
                result = inputString.substring(0, i);
            } else {
                break;
            }
        }
        return result;
    }
}
