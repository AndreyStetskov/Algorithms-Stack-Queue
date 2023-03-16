import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@SuppressWarnings("LoopConditionNotUpdatedInsideLoop")
public class Beating {

    public static void days(int members) {
        Random random = new Random();
        int day = 0;
        int count = 0;
        int victim;
        int leader = 1;
        boolean light = true;
        List<Integer> beatenMembers = new ArrayList<>();

        if (members == 1) {
            day = 1;
        }

        while (count + 1 < members) {
            victim = random.nextInt(0, members) + 1;

            if (victim == 1 && light) {
                light = false;
                day ++;
            }

            if (!light && !beatenMembers.contains(victim)) {
                light = true;
                beatenMembers.add(victim);
                day++;
            }
            day ++;
        }
        System.out.println(day);
    }
}
