package arcadecore.listforestedge;

import java.util.Arrays;

public class CreateArray {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(Arrays.toString(createArray(n)));
    }

    private static int[] createArray(int n) {
        return Arrays.stream(new int[n]).map(e -> e = 1).toArray();
    }
}
