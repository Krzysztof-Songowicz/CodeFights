package arcadecore.looptunnel;

public class CountSumOfTwo {
    public static void main(String[] args) {

        int n = 6;
        int l = 2;
        int r = 4;

        System.out.println(countSumOfTwoRepresentations2(n, l, r));
    }

    private static int countSumOfTwoRepresentations2(int n, int l, int r) {
        int a;
        int b;
        int counter = 0;
        for (a = l; a <= r; a++)
            for (b = a; b <= r; b++) {
                if (a + b == n)
                    counter++;
                if (a + b > n)
                    break;
            }
        return counter;
    }

}
