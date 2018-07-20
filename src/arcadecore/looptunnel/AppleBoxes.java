package arcadecore.looptunnel;

/**
 * You have k apple boxes full of apples. Each square box of size m contains m × m apples.
 * <p>
 * The smallest box is size 1, the next one is size 2,..., all the way up to size k.
 * Boxes that have an odd size contain only yellow apples. Boxes that have an even size contain only red apples.
 * Your task is to calculate the difference between the number of red apples and the number of yellow apples.
 * <p>
 * Example
 * For k = 5, the output should be
 * appleBoxes(k) = -15.
 * <p>
 * There are 1 + 3 * 3 + 5 * 5 = 35 yellow apples and 2 * 2 + 4 * 4 = 20 red apples, making the answer 20 - 35 = -15.
 */
public class AppleBoxes {
    public static void main(String[] args) {
        int k = 5;
        System.out.println(appleBoxes(k));
        System.out.println(appleBoxesRec(k));
    }

    private static int appleBoxes(int k) {
        int difference = 0;
        for (int i = 1; i <= k; i++) {
            if (i % 2 == 0)
                difference += i * i;
            else
                difference -= i * i;
        }
        return difference;
    }

    private static int appleBoxesRec(int k) {
        return k == 1 ? -1 : k % 2 == 0 ? appleBoxesRec(k - 1) + k * k : appleBoxesRec(k - 1) - k * k;
    }
}
