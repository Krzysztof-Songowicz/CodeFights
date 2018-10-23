package arcadecore.labyrinthofnestedloops;

public class IsPower {
    public static void main(String[] args) {
        int n = 125;
        System.out.println(isPower(n));
    }

    private static boolean isPower(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Math.pow(i, j) > n)
                    continue;
                if (Math.pow(i, j) == n)
                    return true;
            }
        }
        return false;
    }

}