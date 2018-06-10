package arcadecore.listforestedge;

import java.util.Arrays;

/**
 * Reversing an array can be a tough task, especially for a novice programmer.
 * Mary just started coding, so she would like to start with something basic at first.
 * Instead of reversing the array entirely, she wants to swap just its first and last elements.
 * <p>
 * Given an array arr, swap its first and last elements and return the resulting array.
 * <p>
 * Example
 * For arr = [1, 2, 3, 4, 5], the output should be
 * firstReverseTry(arr) = [5, 2, 3, 4, 1].
 */
public class FirstReverseTry {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(firstReverseTry(arr)));
    }

    private static int[] firstReverseTry2(int[] arr) {
        int[] result = new int[arr.length];
        if (arr.length == 0)
            return result;
        System.arraycopy(arr, 0, result, 0, arr.length);
        result[0] = arr[arr.length - 1];
        result[result.length - 1] = arr[0];
        return result;
    }

    private static int[] firstReverseTry(int[] arr) {
        if (arr.length == 0)
            return arr;
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        return arr;
    }
}
