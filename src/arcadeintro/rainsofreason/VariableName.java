package arcadeintro.rainsofreason;

/*
For name = &quot;var_1__Int&quot;, the output should be
VariableName(name) = true;
For name = &quot;qq-q&quot;, the output should be
VariableName(name) = false;
For name = &quot;2w2&quot;, the output should be
VariableName(name) = false.
Correct variable names consist only of English letters, digits and underscores and they can't start with a digit.
 */
public class VariableName {
    public static void main(String[] args) {

        String name = "var_1__Int";

        System.out.println(variableName(name));
    }

    private static boolean variableName(String name) {
        String pattern = "[a-zA-z]+([a-zA-Z_1-9]*)*";
        return name.matches(pattern);
    }
}
