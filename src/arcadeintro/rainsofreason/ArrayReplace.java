package arcadeintro.rainsofreason;

import java.util.Arrays;

/*
For inputArray = [1, 2, 1], elemToReplace = 1 and substitutionElem = 3, the output should be
arrayReplace(inputArray, elemToReplace, substitutionElem) = [3, 2, 3].
 */
public class ArrayReplace {
    public static void main(String[] args) {
        int[] array = {1, 2, 1};

        System.out.println(Arrays.toString(arrayReplace(array, 1, 3)));
    }

    private static int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == elemToReplace) {
                inputArray[i] = substitutionElem;
            }
        }
        return inputArray;
    }
}
