package arcadecore.listforestedge;

import java.util.Arrays;

/**
 * Remove a part of a given array between given 0-based indexes l and r (inclusive).
 * <p>
 * Example
 * For inputArray = [2, 3, 2, 3, 4, 5], l = 2 and r = 4, the output should be
 * removeArrayPart(inputArray, l, r) = [2, 3, 5].
 */
public class RemoveArrayPart {
    public static void main(String[] args) {

        int[] inputArray = {2, 3, 2, 3, 4, 5};
        int[] inputArray2 = {5, 3, 2, 3, 4};
        System.out.println(Arrays.toString(removeArrayPart(inputArray2, 1, 1)));
    }

    private static int[] removeArrayPart(int[] inputArray, int l, int r) {
        int[] result = new int[inputArray.length - r + l - 1];
        int index = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (i < l || i > r) {
                result[index++] = inputArray[i];
            }
        }
        return result;
    }
}
