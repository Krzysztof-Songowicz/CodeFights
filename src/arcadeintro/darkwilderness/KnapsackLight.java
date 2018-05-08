package arcadeintro.darkwilderness;

/*
For value1 = 10, weight1 = 5, value2 = 6, weight2 = 4 and maxW = 8, the output should be
knapsackLight(value1, weight1, value2, weight2, maxW) = 10.
 */
public class KnapsackLight {
    public static void main(String[] args) {

        int value1 = 10;
        int weight1 = 5;
        int value2 = 6;
        int weight2 = 4;
        int maxW = 8;

        System.out.println(knapsackLight(value1, weight1, value2, weight2, maxW));
    }

    private static int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {
        if (weight1 + weight2 <= maxW) {
            return value1 + value2;
        } else if (weight1 <= maxW && weight2 <= maxW) {
            return value1 > value2 ? value1 : value2;
        } else if (weight1 > maxW && weight2 > maxW) {
            return 0;
        } else {
            return weight1 <= maxW ? value1 : value2;
        }
    }


}
