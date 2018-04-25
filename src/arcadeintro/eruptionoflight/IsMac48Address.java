package arcadeintro.eruptionoflight;

/*
The standard (IEEE 802) format for printing MAC-48 addresses in human-friendly form is six groups of
two hexadecimal digits (0 to 9 or A to F), separated by hyphens (e.g. 01-23-45-67-89-AB).

Your task is to check by given string inputString whether it corresponds to MAC-48 address or not.

Example
For inputString = "00-1B-63-84-45-E6", the output should be
isMAC48Address(inputString) = true;
For inputString = "Z1-1B-63-84-45-E6", the output should be
isMAC48Address(inputString) = false;
For inputString = "not a MAC-48 address", the output should be
isMAC48Address(inputString) = false.
 */
public class IsMac48Address {
    public static void main(String[] args) {

        String inputString = "00-1B-63-84-45-E6";

        System.out.println(isMac48Address(inputString));
    }

    private static boolean isMac48Address(String s) {
        String pattern = "([A-Z0-9]{2}-){5}[A-Z0-9]{2}";
        return s.matches(pattern);
    }
}
