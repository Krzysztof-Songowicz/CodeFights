package arcadecore.listforestedge;

import java.util.Arrays;

/**
 * We define the middle of the array arr as follows:
 * <p>
 * if arr contains an odd number of elements, its middle is the element whose index number is the same when counting
 * from the beginning of the array and from its end;
 * if arr contains an even number of elements, its middle is the sum of the two elements whose index numbers when
 * counting from the beginning and from the end of the array differ by one.
 * Given array arr, your task is to find its middle, and, if it consists of two elements,
 * replace those elements with the value of middle. Return the resulting array as the answer.
 * <p>
 * Example
 * For arr = [7, 2, 2, 5, 10, 7], the output should be
 * replaceMiddle(arr) = [7, 2, 7, 10, 7].
 * <p>
 * The middle consists of two elements, 2 and 5. These two elements should be replaced with their sum, i.e. 7.
 * <p>
 * For arr = [-5, -5, 10], the output should be
 * replaceMiddle(arr) = [-5, -5, 10].
 * <p>
 * The middle is defined as a single element -5, so the initial array with no changes should be returned.
 */
public class ReplaceMiddle {
    public static void main(String[] args) {

        int[] arr = {7, 2, 2, 5, 10, 7};

        System.out.println(Arrays.toString(replaceMiddle(arr)));
    }

    private static int[] replaceMiddle(int[] arr) {
        int size = arr.length;
        if (size % 2 != 0) {
            return arr;
        }
        int[] result = new int[size - 1];
        int index = 0;
        for (int i = 0; i < size; i++, index++) {
            if (i == size / 2 - 1) {
                result[index] = arr[size / 2 - 1] + arr[size / 2];
                i++;
                continue;
            }
            result[index] = arr[i];
        }
        return result;
    }
}

