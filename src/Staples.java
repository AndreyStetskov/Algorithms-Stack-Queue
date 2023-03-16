import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Staples {

    public static boolean sequenceCheck(String staples) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> staple = new HashMap<>();

        staple.put(')', '(');
        staple.put('}', '{');
        staple.put(']', '[');
        staple.put('>', '<');

        for (int i = 0; i < staples.length(); i++) {
            char element = staples.charAt(i);

            if (staple.containsValue(element)) {
                stack.push(element);
            }

            if (staple.containsKey(element)) {
                if (stack.empty() || !stack.pop().equals(staple.get(element))) {
                    return false;
                }
            }
        }

        if (!stack.empty()) return false;

      return true;
    }
}
