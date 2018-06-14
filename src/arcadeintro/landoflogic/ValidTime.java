package arcadeintro.landoflogic;

/**
 * Check if the given string is a correct time representation of the 24-hour clock.
 * <p>
 * Example
 * For time = "13:58", the output should be
 * validTime(time) = true;
 * For time = "25:51", the output should be
 * validTime(time) = false;
 * For time = "02:76", the output should be
 * validTime(time) = false.
 */
public class ValidTime {
    public static void main(String[] args) {

        String time = "13:58";
        String time2 = "25:51";

        System.out.println(validTime(time));

    }

    private static boolean validTime(String time) {
        return time.matches("(1[0-9]|2[0-3]|0[0-9]):([0-5][0-9])");
    }
}
