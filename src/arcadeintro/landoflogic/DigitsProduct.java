package arcadeintro.landoflogic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given an integer product, find the smallest positive (i.e. greater than 0) integer the product of whose digits is equal to product. If there is no such integer, return -1 instead.
 * <p>
 * Example
 * For product = 12, the output should be
 * digitsProduct(product) = 26;
 * For product = 19, the output should be
 * digitsProduct(product) = -1.
 */
public class DigitsProduct {
    public static void main(String[] args) {
        int product = 12; // 26
        int product2 = 243; // 399
        int product3 = 19;
        int product4 = 450;
        System.out.println(digitsProductBrute(product2));

    }

    private static int digitsProduct(int product) {
        int divisor = 9;
        int temp = 1;
        List<Integer> num = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (divisor == 1) {
                return -1;
            } else if (product / divisor < 10 && product % divisor == 0) {
                num.add(product / divisor);
                num.add(divisor);
                Collections.sort(num);
                for (Integer integer : num) {
                    sb.append(integer);
                }
                return Integer.valueOf(sb.toString());
            } else if (product / divisor > 10) {
                temp = divisor;
                product = product / divisor;
                num.add(divisor);
            }
            divisor--;
        }
    }

    private static int digitsProductBrute(int product) {
        for (int i = 0; i < 3000; i++) {
            int digit = i % 10;
            int tens = i % 100 / 10;
            int hundreds = i / 100 % 10;
            int thousands = i / 1000;
            if (i < 10) {
                if (i == product) {
                    return i;
                }
            } else if (i < 100) {
                if (digit * tens == product) {
                    return i;
                }
            } else if (i < 1000) {
                if (digit * tens * hundreds == product) {
                    return i;
                }
            } else {
                if (digit * tens * hundreds * thousands == product) {
                    return i;
                }
            }
        }
        return -1;
    }
}
