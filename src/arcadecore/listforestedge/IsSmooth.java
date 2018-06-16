package arcadecore.listforestedge;

/**
 * We define the middle of the array arr as follows:
 * <p>
 * if arr contains an odd number of elements, its middle is the element whose index number is the same when counting
 * from the beginning of the array and from its end;
 * if arr contains an even number of elements, its middle is the sum of the two elements whose index numbers
 * when counting from the beginning and from the end of the array differ by one.
 * An array is called smooth if its first and its last elements are equal to one another and to the middle.
 * Given an array arr, determine if it is smooth or not.
 * <p>
 * Example
 * For arr = [7, 2, 2, 5, 10, 7], the output should be
 * isSmooth(arr) = true.
 * <p>
 * The first and the last elements of arr are equal to 7, and its middle also equals 2 + 5 = 7.
 * Thus, the array is smooth and the output is true.
 * <p>
 * For arr = [-5, -5, 10], the output should be
 * isSmooth(arr) = false.
 * <p>
 * The first and middle elements are equal to -5, but the last element equals 10. Thus, arr is not smooth and the output is false.
 */
public class IsSmooth {
    public static void main(String[] args) {
        int[] arr = {7, 2, 2, 5, 10, 7};

        System.out.println(isSmooth(arr));

    }

    private static boolean isSmooth(int[] arr) {
        int aLength = arr.length;
        int first = arr[0];
        int last = arr[aLength - 1];
        int middle = aLength % 2 != 0 ? arr[aLength / 2] : arr[aLength / 2] + arr[(aLength / 2) - 1];
        return first == last && first == middle;
    }
}
