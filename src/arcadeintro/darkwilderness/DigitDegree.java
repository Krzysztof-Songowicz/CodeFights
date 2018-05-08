package arcadeintro.darkwilderness;

/*
For n = 5, the output should be
digitDegree(n) = 0;
For n = 100, the output should be
digitDegree(n) = 1.
1 + 0 + 0 = 1.
For n = 91, the output should be
digitDegree(n) = 2.
9 + 1 = 10 -> 1 + 0 = 1.
 */
public class DigitDegree {
    public static void main(String[] args) {
        int n = 91;

        System.out.println(digitDegree(n));

    }

    private static int digitDegree(int n) {
        int counter = 0;
        int number = n;
        while (number >= 10) {
            String[] num = String.valueOf(number).split("");
            number = 0;
            for (String s : num) {
                number += Integer.valueOf(s);
            }
            counter++;
        }
        return counter;
    }
}
