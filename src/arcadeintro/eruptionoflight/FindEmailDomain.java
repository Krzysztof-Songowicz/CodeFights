package arcadeintro.eruptionoflight;

public class FindEmailDomain {
    public static void main(String[] args) {

        String address = "<>[]:,;@\"!#$%&*+-/=?^_{}| ~.a\"@example.org";
        String address2 = "prettyandsimple@example.com";

        System.out.println(findEmailDomain(address));
    }

    private static String findEmailDomain(String address2) {
        String[] array = address2.split("@+");
        return array[array.length - 1];
    }
}
