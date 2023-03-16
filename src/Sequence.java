import java.util.*;

public class Sequence {
    public static boolean isSymmetrical(List<Integer> sequence) {
        Stack<Integer> end = new Stack<>();
        Queue<Integer> start = new LinkedList<>();

        if (sequence.size() == 0 || sequence.size() == 1) {
            return true;
        }

        if (sequence.size() %2 == 0) {
            for (int i = 0; i < sequence.size() / 2; i++) start.add(sequence.get(i));

            for (int i = sequence.size() / 2; i < sequence.size(); i++) end.push(sequence.get(i));
        }
        else {
            for (int i = 0; i < sequence.size() / 2 - 1; i++) start.add(sequence.get(i));

            for (int i = sequence.size() / 2 + 1; i < sequence.size(); i++) end.push(sequence.get(i));
        }

        while (start.size() != 0) {
            Integer a = start.remove();
            Integer b = end.pop();
            if (!Objects.equals(a, b)) {
                return false;
            }
        }
        return true;
    }
}
