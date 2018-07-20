package arcadecore.looptunnel;

/**
 * We want to turn the given integer into a number that has only one non-zero digit using a tail rounding approach.
 * This means that at each step we take the last non 0 digit of the number and round it to 0 or to 10.
 * If it's less than 5 we round it to 0 if it's larger than or equal to 5 we round it to 10
 * (rounding to 10 means increasing the next significant digit by 1).
 * The process stops immediately once there is only one non-zero digit left.
 * <p>
 * Example
 * For value = 15, the output should be
 * rounders(value) = 20;
 * <p>
 * For value = 1234, the output should be
 * rounders(value) = 1000.
 * <p>
 * 1234 -> 1230 -> 1200 -> 1000.
 * <p>
 * For value = 1445, the output should be
 * rounders(value) = 2000.
 * <p>
 * 1445 -> 1450 -> 1500 -> 2000.
 */
public class Rounders {
    public static void main(String[] args) {
        int value = 1445;
        System.out.println(rounders(value));
        System.out.println(rounders2(value));

    }

    private static int rounders(int value) {
        StringBuilder sb = new StringBuilder();
        int length = String.valueOf(value).length();
        for (int i = 0; i < length - 1; i++) {
            if (value % 10 >= 5) {
                sb.append(0);
                value += 10;
            } else {
                sb.append(0);
            }
            value /= 10;
        }
        sb.insert(0, value);
        return Integer.valueOf(sb.toString());
    }

    private static int rounders2(int n) {
        int p = 10;
        while (n > p) {
            if ((n % p) / (p / 10) < 5)
                n = (n / p) * p;
            else
                n = (n / p + 1) * p;
            p *= 10;
        }
        return n;
    }
}
