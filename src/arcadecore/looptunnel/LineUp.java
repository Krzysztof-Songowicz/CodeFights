package arcadecore.looptunnel;

/**
 * Given the list of commands the coach has given, count the number of such commands after which the students will
 * be facing the same direction.
 * <p>
 * Example
 * For commands = "LLARL", the output should be
 * lineUp(commands) = 3.
 * <p>
 * Let's say that there are 4 students, and the second one can't tell left from right.
 * In this case, only after the second, third and fifth commands will the students face the same direction.
 */
public class LineUp {
    public static void main(String[] args) {

        String commands = "LLARL";
        System.out.println(lineUp(commands));
    }

    private static int lineUp(String commands) {
        int counter = 0;
        boolean side = false;
        for (int i = 0; i < commands.length(); i++) {
            char currentChar = commands.charAt(i);
            if (currentChar == 'L' || currentChar == 'R') {
                if (side) {
                    counter++;
                    side = false;
                } else {
                    side = true;
                }
            } else if (currentChar == 'A') {
                if (!side) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
