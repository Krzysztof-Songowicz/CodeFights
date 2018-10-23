package arcadecore.labyrinthofnestedloops;

/**
 * Find the number of ways to express n as sum of some (at least two) consecutive positive integers.
 * <p>
 * Example
 * For n = 9, the output should be
 * isSumOfConsecutive2(n) = 2.
 * <p>
 * There are two ways to represent n = 9: 2 + 3 + 4 = 9 and 4 + 5 = 9.
 * <p>
 * For n = 8, the output should be
 * isSumOfConsecutive2(n) = 0.
 * <p>
 * There are no ways to represent n = 8.
 */
public class IsSumConsecutive2 {
    public static void main(String[] args) {
        int n = 9;

        System.out.println(isSumOfConsecutive2(n));
    }

    private static int isSumOfConsecutive2(int n) {
        int counter = 0;
        int number = 0;
        int iter = 1;
        while (iter < n) {
            for (int i = iter; i < n; i++) {
                number += i;
                if (number == n) {
                    counter++;
                    iter++;
                    number = 0;
                    break;
                } else if (number > n) {
                    iter++;
                    number = 0;
                    break;
                }
            }
        }
        return counter;
    }

}
