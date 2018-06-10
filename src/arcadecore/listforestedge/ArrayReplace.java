package arcadecore.listforestedge;

import java.util.Arrays;

/**
 * Given an array of integers, replace all the occurrences of elemToReplace with substitutionElem.
 * <p>
 * Example
 * For inputArray = [1, 2, 1], elemToReplace = 1 and substitutionElem = 3, the output should be
 * arrayReplace(inputArray, elemToReplace, substitutionElem) = [3, 2, 3].
 */
public class ArrayReplace {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 1};
        System.out.println(Arrays.toString(arrayReplace(inputArray, 1, 3)));
    }

    static int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {
        return Arrays.stream(inputArray)
                .map(x -> x == elemToReplace ? substitutionElem : x)
                .toArray();
    }
}
