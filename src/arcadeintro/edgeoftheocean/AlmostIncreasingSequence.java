package arcadeintro.edgeoftheocean;

/*
For sequence = [1, 3, 2, 1], the output should be
almostIncreasingSequence(sequence) = false;

There is no one element in this array that can be removed in order to get a strictly increasing sequence.

For sequence = [1, 3, 2], the output should be
almostIncreasingSequence(sequence) = true.

You can remove 3 from the array to get the strictly increasing sequence [1, 2].
Alternately, you can remove 2 to get the strictly increasing sequence [1, 3].
*/
public class AlmostIncreasingSequence {
    public static void main(String[] args) {

        int[] sequence = {1, 3, 2, 1};
        int[] sequence2 = {1, 3, 2};
        int[] sequence4 = {10, 1, 2, 3, 4, 5};
        int[] sequence3 = {40, 50, 60, 10, 20, 30};

        System.out.println(almostIncreasingSequence3(sequence4));
    }


    private static boolean almostIncreasingSequence3(int[] sequence) {
        boolean error = false;
        if (sequence.length == 1 || sequence.length == 2) {
            return true;
        }
        int first = sequence[0];
        if (first >= sequence[2] && sequence[1] >= sequence[2]) {
            return false;
        }
        for (int i = 1; i < sequence.length; i++) {
            if (first >= sequence[i]) {
                if (error) {
                    return false;
                }
                error = true;
                // Only checking if i is < sequence.length - 1
                if ((i < sequence.length - 1 && sequence[i] >= sequence[i + 1]) && first >= sequence[i]) {
                    return false;
                }
                first = sequence[i];
            }
        }
        return true;
    }

    // TODO fix the solution
    private static boolean almostIncreasingSequence(int[] sequence) {
        int duplicateCounter = 0;
        int errorCounter = 0;
        int errorIndex = -1;
        for (int i = 0; i < sequence.length - 1; i++) {
            for (int j = i + 1; j < sequence.length; j++) {
                if (sequence[i] == sequence[j] && i != j) {
                    duplicateCounter++;
                }
            }
            if (sequence[i] > sequence[i + 1] && i != errorIndex) {
                errorCounter++;
                errorIndex = i;
            } else if (i != 0) {
                if (sequence[i - 1] > sequence[i + 1])
                    errorCounter++;
            }
        }
        for (int k = 0; k < sequence.length - 1; k++) {
            if (sequence[k] > sequence[k + 1] && k != errorIndex) {
                errorCounter++;
                errorIndex = k;
            }
        }
        return (errorCounter <= 1 && duplicateCounter <= 1);
    }

    // Solution fails on { 40, 50, 60, 10, 20, 30 }
    private static boolean almostIncreasingSequence4(int[] sequence) {
        int duplicateCounter = 0;
        int sequenceCounter = 0;
        for (int i = 0; i < sequence.length - 1; i++) {
            for (int j = i + 1; j < sequence.length; j++) {
                if (sequence[i] == sequence[j] && i != j) {
                    duplicateCounter++;
                }
            }
            if (sequence[i] < sequence[i + 1])
                sequenceCounter++;
        }
        System.out.println(sequenceCounter);
        return (sequenceCounter >= sequence.length - 2 && duplicateCounter <= 1);
    }


    static boolean almostIncreasingSequence2(int[] sequence) {
        int deleted = 0;

        for (int i = 0; i < sequence.length - 2 && deleted <= 2; i++) {
            int first = sequence[i];
            int second = sequence[i + 1];
            int third = sequence[i + 2];

            if (first >= second) {
                // Assuming we delete the element and replace it with the lower number (-1)
                deleted++;
                sequence[i] = second - 1;
            }
            if (second >= third) {
                deleted++;

                if (first == third) {
                    // Assuming we delete the element and replace it with the higher number (+1)
                    sequence[i + 2] = second + 1;
                } else {
                    // Assuming we delete the element and replace it with the first number
                    sequence[i + 1] = first;
                }
            }
        }
        return deleted <= 1;
    }
}

