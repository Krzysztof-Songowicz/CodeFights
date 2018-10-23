package arcadecore.looptunnel;

public class IncreaseNumberRoundness {
    public static void main(String[] args) {
        int n = 902201000;
        increaseNumberRoundness(n);
    }

    private static boolean increaseNumberRoundness(int n) {
        String num = String.valueOf(n);
        for (int i = 1; i < num.length() - 1; i++) {
            if (num.charAt(i) == '0' && num.charAt(i + 1) != '0')
                return true;
        }
        return false;
    }
}
