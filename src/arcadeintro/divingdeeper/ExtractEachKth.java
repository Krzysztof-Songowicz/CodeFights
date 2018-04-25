package arcadeintro.divingdeeper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExtractEachKth {
    public static void main(String[] args) {

        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 3;

        System.out.println(Arrays.toString(extractEachKth(inputArray, k)));
        System.out.println(Arrays.toString(extractEachKth2(inputArray, k)));

    }

    private static Integer[] extractEachKth(int[] inputArray, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0, j = k; i < inputArray.length; i++) {
            if (i == k - 1) {
                k += j;
                continue;
            }
            list.add(inputArray[i]);
        }
        return list.toArray(new Integer[list.size()]);
    }

    private static int[] extractEachKth2(int[] inputArray, int k) {
        int[] array = new int[inputArray.length - inputArray.length / k];
        int index = 0;
        for (int i = 0, j = k; i < inputArray.length; i++) {
            if (i == k - 1) {
                k += j;
                continue;
            }
            array[index] = inputArray[i];
            index++;
        }
        return array;
    }
}
