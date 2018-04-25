package arcadeintro.divingdeeper;

/*
For inputString = "var_1__Int", the output should be
firstDigit(inputString) = '1';
For inputString = "q2q-q", the output should be
firstDigit(inputString) = '2';
For inputString = "0ss", the output should be
firstDigit(inputString) = '0'
 */
public class FirstDigit {
    public static void main(String[] args) {
        String input = "a a_933";

        System.out.println(firstDigit(input));
    }

    private static String firstDigit(String input) {
        Integer[] numbers = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57};
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (!result.equals("")) {
                break;
            }
            for (Integer number : numbers) {
                if (input.charAt(i) == number) {
                    result = String.valueOf(input.charAt(i));
                    break;
                }
            }
        }
        return result;
    }

    private static String firstDigit2(String input) {
        char[] numbers = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        int index = -1;
        for (char number : numbers) {
            index = input.indexOf(number);
            if (index != -1) {
                break;
            }
        }
        return String.valueOf(input.charAt(index));
    }
}
