package arcadeintro.rainbowofclarity;

/*
For n = 152, the output should be
deleteDigit(n) = 52;
For n = 1001, the output should be
deleteDigit(n) = 101.
 */
public class DeleteDigit {
    public static void main(String[] args) {

        int n = 1522;
        System.out.println(deleteDigit(n));

    }

    private static int deleteDigit(int n) {
        int max = 0;
        int temp;
        StringBuilder sb = new StringBuilder();
        char[] num = String.valueOf(n).toCharArray();
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (j != i) {
                    sb.append(num[j]);
                }
            }
            temp = Integer.valueOf(sb.toString());
            if (temp > max) {
                max = temp;
            }
            sb = new StringBuilder();
        }
        return max;
    }
}
