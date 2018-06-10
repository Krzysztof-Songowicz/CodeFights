package arcadecore.listforestedge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given two arrays of integers a and b, obtain the array formed by the elements of a followed by the elements of b.
 * <p>
 * Example
 * For a = [2, 2, 1] and b = [10, 11], the output should be
 * concatenateArrays(a, b) = [2, 2, 1, 10, 11].
 */
public class ConcatenateArrays {
    public static void main(String[] args) {
        Integer[] a = {2, 2, 1};
        Integer[] b = {10, 11};
        concatenateArrays(a, b);
    }

    private static Integer[] concatenateArrays(Integer[] a, Integer[] b) {
        List<Integer> list = new ArrayList<>(Arrays.asList(a));
        list.addAll(Arrays.asList(b));
        return list.toArray(new Integer[0]);
    }
}
