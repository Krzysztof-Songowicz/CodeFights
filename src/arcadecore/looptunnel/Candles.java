package arcadecore.looptunnel;

/**
 * When a candle finishes burning it leaves a leftover. makeNew leftovers can be combined to make a new candle,
 * which, when burning down, will in turn leave another leftover.
 * <p>
 * You have candlesNumber candles in your possession. What's the total number of candles you can burn,
 * assuming that you create new candles as soon as you have enough leftovers?
 * <p>
 * Example
 * For candlesNumber = 5 and makeNew = 2, the output should be
 * candles(candlesNumber, makeNew) = 9.
 * <p>
 * Here is what you can do to burn 9 candles:
 * burn 5 candles, obtain 5 leftovers;
 * create 2 more candles, using 4 leftovers (1 leftover remains);
 * burn 2 candles, end up with 3 leftovers;
 * create another candle using 2 leftovers (1 leftover remains);
 * burn the created candle, which gives another leftover (2 leftovers in total);
 * create a candle from the remaining leftovers;
 * burn the last candle.
 * Thus, you can burn 5 + 2 + 1 + 1 = 9 candles, which is the answer.
 */
public class Candles {
    public static void main(String[] args) {
        int candlesNumber = 5;
        int makeNew = 2;

        System.out.println(candlesRecursion(candlesNumber, makeNew));
        System.out.println(candles(candlesNumber, makeNew));
    }

    private static int candlesRecursion(int candlesNumber, int makeNew) {
        if (candlesNumber == makeNew)
            return 1;
        return candlesRecursion(candlesNumber - 1, makeNew) + candlesNumber + candlesNumber / makeNew;
    }

    private static int candles(int candlesNumber, int makeNew) {
        int result = candlesNumber;
        int leftovers = 0;
        int temp;
        while (true) {
            leftovers += candlesNumber;
            temp = leftovers % makeNew;
            leftovers /= makeNew;
            result += leftovers / makeNew;
            leftovers += temp;
            candlesNumber = leftovers / makeNew;
            if (candlesNumber == 0) {
                break;
            }
            leftovers -= candlesNumber;
        }
        return result;
    }
}
