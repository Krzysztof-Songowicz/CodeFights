package arcadecore.looptunnel;

/**
 * For param1 = 456 and param2 = 1734, the output should be
 * additionWithoutCarrying(param1, param2) = 1180.
 * 456
 * 1734
 * + ____
 * 1180
 */
public class AdditionWithoutCarrying {
    public static void main(String[] args) {
        int param1 = 456;
        int param2 = 1734;

        System.out.println(additionWithoutCarryingString(param1, param2));
    }

    private static int additionWithoutCarryingString(int a, int b) {
        StringBuilder numA = new StringBuilder(String.valueOf(a)).reverse();
        StringBuilder numB = new StringBuilder(String.valueOf(b)).reverse();
        int x, y;
        int shorter = numA.length() > numB.length() ? numB.length() : numA.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < shorter; i++) {
            x = Character.getNumericValue(numA.charAt(i));
            System.out.println("x = " + x);
            y = Character.getNumericValue(numB.charAt(i));
            System.out.println("y = " + y);
            sb.append((x + y) % 10);
            System.out.println(sb.toString());
        }
        StringBuilder longer = numA.length() > numB.length() ? numA : numB;
        if (shorter != longer.length()) {
            for (int i = longer.length() - 1; i >= shorter; i--) {
                sb.append(longer.charAt(i));
            }
        }
        System.out.println(sb.toString());
        return Integer.valueOf(sb.reverse().toString());
    }

}
