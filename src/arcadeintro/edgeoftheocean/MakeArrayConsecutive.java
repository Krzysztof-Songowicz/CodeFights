package arcadeintro.edgeoftheocean;

import java.util.Arrays;

/*
For statues = [6, 2, 3, 8], the output should be
makeArrayConsecutive2(statues) = 3.

Ratiorg needs statues of sizes 4, 5 and 7.
 */
public class MakeArrayConsecutive {
    public static void main(String[] args) {

        int[] statues = {6, 2, 3, 8};

        System.out.println(makeArrayConsecutive2(statues));

    }

    private static int makeArrayConsecutive2(int[] statues) {
        Arrays.sort(statues);
        int difference = statues[statues.length - 1] - statues[0];
        return difference - (statues.length - 1);


    }
}
