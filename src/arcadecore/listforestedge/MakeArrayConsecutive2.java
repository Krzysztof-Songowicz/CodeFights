package arcadecore.listforestedge;

import java.util.Arrays;

/**
 * Ratiorg got statues of different sizes as a present from CodeMaster for his birthday, each statue having an
 * non-negative integer size. Since he likes to make things perfect, he wants to arrange them from smallest to
 * largest so that each statue will be bigger than the previous one exactly by 1. He may need some additional statues
 * to be able to accomplish that. Help him figure out the minimum number of additional statues needed.
 * <p>
 * Example
 * For statues = [6, 2, 3, 8], the output should be
 * makeArrayConsecutive2(statues) = 3.
 * <p>
 * Ratiorg needs statues of sizes 4, 5 and 7.
 */
public class MakeArrayConsecutive2 {
    public static void main(String[] args) {

        int[] statues = {6, 2, 3, 8};
        makeArrayConsequtive(statues);
    }

    private static int makeArrayConsequtive(int[] statues) {
        Arrays.sort(statues);
        int difference = statues[statues.length - 1] - statues[0];
        return difference - (statues.length - 1);
    }
}
